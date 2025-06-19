package exercicios;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ex03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, -10, 7, 8, 9, 10, 5, 4, 3);

        Consumer<Integer> positivos = n -> {
            if (n >= 0) {
                System.out.println(n);
            }
        };

        numeros.stream().sorted().forEach(positivos);

    }
}
