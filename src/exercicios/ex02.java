package exercicios;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
*/
public class ex02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*
        Consumer<Integer> numeroPar = (n) -> {
            if (n % 2 == 0){
                System.out.println(n);
            }
        };
        */

        // consumer para imprimir números pares
        numeros.stream().sorted().forEach(n -> {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            });

        System.out.println("--------------");

        // predicate no metodo filter
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}
