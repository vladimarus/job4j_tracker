package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (key.equals(value[index])) {
                rsl = index;
                break;
            }
        }
        if (rsl < 0) {
            throw new ElementNotFoundException("Element not found.");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"первый", "второй", "3й", "4й"}, "3");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
