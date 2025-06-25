package exercicios;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Ex16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 14, 10, 5, 4, 3);

        var pares = numeros.stream()
                .filter(n -> n % 2 == 0).collect(toList());

        var impares = numeros.stream()
                .filter(n -> n % 2 == 1).collect(toList());

        System.out.println("Pares: " + pares +
                "\nImpares: " + impares);
    }
}
