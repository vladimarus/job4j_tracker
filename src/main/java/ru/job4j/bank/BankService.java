package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<>());
        }
    }

    public boolean deleteUser(User user) {
        return users.remove(user) != null;
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = users.get(user);
            userAccounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        User res = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                res = user;
                break;
            }
        }
        return res;
    }

    public Account findByRequisite(String passport, String requisite) {
        List<Account> accounts = null;
        Account res = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                accounts = users.get(user);
                break;
            }
        }
        if (accounts != null) {
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    res = account;
                    break;
                }
            }
        }
        return res;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);

        if (destAccount != null && srcAccount != null) {
            if (srcAccount.getBalance() >= amount) {
                destAccount.setBalance(destAccount.getBalance() + amount);
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                rsl = true;
            }
        }
        return rsl;
    }
}

