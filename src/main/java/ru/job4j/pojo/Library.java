package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("First head java", 720);
        Book book1 = new Book("Code complete", 1000);
        Book book2 = new Book("Clean code", 900);
        Book book3 = new Book("SQL за 10 минут", 600);
        Book[] library = new Book[4];
        library[0] = book0;
        library[1] = book1;
        library[2] = book2;
        library[3] = book3;
        for (int i = 0; i < 4; i++) {
            System.out.println(library[i].getName() + " - " + library[i].getPages());
        }
        System.out.println();
        Book tmp = new Book("", 0);
        tmp = library[0];
        library[0] = library[3];
        library[3] = tmp;
        for (int i = 0; i < 4; i++) {
            System.out.println(library[i].getName() + " - " + library[i].getPages());
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            if (library[i].getName() == "Clean code") {
                System.out.println(library[i].getName() + " - " + library[i].getPages());
            }
        }
    }
}
