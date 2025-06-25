package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class Ex05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> result = numeros.stream().filter(n -> n >= 5).collect(toList());

        Optional<Integer> result2 = result.stream().reduce((a, b) -> a + b);

        System.out.println(result2.get() / 2);
    }
}
