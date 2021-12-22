package ru.job4j.lambda;

import java.util.function.Supplier;

/**
 * Пример взаимодейсвия лямбда-выражения с областью видимости.
 * В данном случае для обеспечения безопасности параллелизма переменная @total
 * не может быть захвачена лямбда-выражением. Для передачи @total в
 * лямбда-выражение используется фактически-окончательная временная
 * переменная @finalTotal
 */
public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        for (int num : number) {
            int finalTotal = total;
            total = add(
                    () -> finalTotal + num
            );
        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
