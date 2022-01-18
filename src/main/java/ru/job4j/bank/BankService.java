package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывающий банковский сервис.
 *
 * @author Vladimir_m
 * @version 1.0
 */
public class BankService {
    /**
     * Данные хранятся в виде HashMap<User, List<Account>> - пар
     * ключ-значене, где:
     * User - ключ - уникальная учетная запись клиента,
     * List<Account> - значение - кписок счетов клиента
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет клиента в базу клиентов банка. Клиент будет
     * добавлен только если его еще нет в базе клиентов. Список счетов
     * нового клиента создается пустой.
     *
     * @param user новый клиент
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Добавляет счет account клиенту с паспортом passport. Если такого
     * клиента не существует - изменения не будут внесены. Если у клиента
     * с паспортом passport уже существует счет account - изменения не будут
     * внесены.
     *
     * @param passport паспорт клиента
     * @param account  новый счет клиента
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> userAccounts = users.get(user.get());
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
            }
        }
    }

    /**
     * Ищет клиента по указанному паспорту в базе клиентов банка
     *
     * @param passport паспорт искомого клиента
     * @return если учетная запись клиента существует, возврвщвает ее; в
     * противном случае возвращает null
     */
    public Optional<User> findByPassport(String passport) {
        User res = users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);

        return res == null ? Optional.empty() : Optional.of(res);
    }

    /**
     * Ищет банковский счет с реквизитом requisite принадлежащий пользователю
     * с паспортом passport.
     *
     * @param passport  паспорт владельца счета
     * @param requisite реквизит счета
     * @return Возвращает банковский счет клиента. Если клиент не найден или
     * счет не существует - вернется null
     */
    public Account findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value).stream()
                .filter(account -> requisite.equals(account.getRequisite()))
                .findFirst())
                .orElse(null);
    }

    /**
     * Перечисляет средства с одного счета на другой
     *
     * @param srcPassport   паспорт клиента-отправителя
     * @param srcRequisite  реквизит счета списания
     * @param destPassport  паспорт клиента-получателя
     * @param destRequisite реквизит счета начисления
     * @param amount        сумма перевода
     * @return Возвращает true в случае успешной транзакции. Если клиентов не
     * существует, либо счетов не существует, либо на счету отправителя
     * недостаточно средств - транзакция не выполнится, а метод вернет false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);

        if (destAccount != null && srcAccount != null && srcAccount.getBalance() >= amount) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}

