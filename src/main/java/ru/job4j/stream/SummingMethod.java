package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingMethod {

    public static class User {

        private final String name;

        private final List<Bill> bills;

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }

        public String getName() {
            return name;
        }

        public List<Bill> getBills() {
            return bills;
        }
    }

    public static class Bill {

        private final int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    private static class Pair {
        private final User user;
        private final Bill bill;

        public Pair(User user, Bill bill) {
            this.user = user;
            this.bill = bill;
        }

        public User getUser() {
            return user;
        }

        public Bill getBill() {
            return bill;
        }
    }

    public static Map<String, Integer> summing(List<User> users) {
        List<Pair> pairs;

        pairs = users.stream()
                .flatMap(user -> user.getBills().stream()
                        .map(bill -> new Pair(user, bill)))
                .collect(Collectors.toList());

        return
                pairs.stream()
                        .collect(Collectors.groupingBy(
                                p -> p.getUser().getName(),
                                Collectors.summingInt(
                                        p -> p.getBill().getBalance())));
    }
}
