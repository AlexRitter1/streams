package exercicios;

import java.util.Arrays;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 14, 10, 5, 4, 3);

        numeros.stream()
                .filter(n -> n % 2 == 1)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .forEach(System.out::println);
    }
}
