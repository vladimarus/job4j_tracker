package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс реализующий модель данных User
 *
 * @author Vladimir_m
 * @version 1.0
 */
public class User {
    /**
     * Идентификатор паспорта
     */
    private String passport;
    /**
     * Имя клиента
     */
    private String username;

    /**
     * Конструктор объекта класса User
     *
     * @param passport идентификатор нового паспорта
     * @param username имя нового пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод получения идентификатора паспорта пользователя
     *
     * @return Возвращает строку с идентификатором паспорта пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод изменения поля passport
     *
     * @param passport Новое значения поля passport
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод получения значения поля username
     *
     * @return Возвращает строку с значением поля username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод изменения поля username
     *
     * @param username Новое значение поля username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод сравнения объектов класса
     *
     * @param o Объект, сравнивающийся с текущим объектом
     * @return Возвращает true, если ссылки объектов эквивалентны или
     * значения поля passport объектов равны. Во всех других случаях
     * вернет false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Уникальный хэш идентификатор объекта генерируется на основе
     * значения поля passport
     *
     * @return Возвращает уникальный хэш-код объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
