package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель данных банковского счета хранит реквизит счета и доступные
 * средства на счету
 *
 * @author Vladimir_m
 * @version 1.0
 */
public class Account {
    /**
     * Строка - реквизит счета
     */
    private String requisite;
    /**
     * Вещественное число двойной длины - баланс счета
     */
    private double balance;

    /**
     * Конструктор объекта класса создает объект с заданными параметрами
     *
     * @param requisite реквизит нового счета
     * @param balance   баланс нового счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Возвращает значение поля requisite
     *
     * @return значение поля requisite текущего объекта
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Устанавливает новое значение поля requisite
     *
     * @param requisite новое значение поля requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Возвращает состояние счета
     *
     * @return значение поля balance объекта
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Изменяет состояние счета
     *
     * @param balance новое значение поля balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод сравнения объектов класса
     *
     * @param o Объект, сравнивающийся с текущим объектом
     * @return Возвращает true, если ссылки объектов эквивалентны или
     * значения поля requisite объектов равны. Во всех других случаях
     * вернет false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Уникальный хэш идентификатор объекта генерируется на основе
     * значения поля requisite
     *
     * @return Возвращает уникальный хэш-код объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
