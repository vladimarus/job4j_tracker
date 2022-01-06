package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> findByKey(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(key)
                    || person.getSurname().contains(key)
                    || person.getPhone().contains(key)
                    || person.getAddress().contains(key)
            ) {
                result.add(person);
            }
        }
        return result;
    }

    /**
     * Реализация метода @find поиска с применением функции высшего порядка -
     * - комбинации предикатов
     *
     * @param key Ключевое слово поиска
     * @return Список пользователей, удовлетворяющих поиску (содержат ключ
     * в любом из своих полей)
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> nameCheck = p -> p.getName().contains(key);
        Predicate<Person> sNameCheck = p -> p.getSurname().contains(key);
        Predicate<Person> phoneCheck = p -> p.getPhone().contains(key);
        Predicate<Person> addressCheck = p -> p.getAddress().contains(key);

        Predicate<Person> combine = nameCheck.or(sNameCheck.or(phoneCheck.or(addressCheck)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
