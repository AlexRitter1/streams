package exercicios;

import java.util.Arrays;
import java.util.List;

public class Ex08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 14, 10, 5, 4, 3);

        var result = numeros.stream().reduce((a,b) -> a+b);

        System.out.println(result.get());
    }
}
