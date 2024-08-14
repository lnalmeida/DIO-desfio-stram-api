import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class desafio_17 {
    public static void main(String[] args) {
        //Desafio 17 - Filtrar os números primos da lista:
        List<Integer> numeros = Arrays.asList( -2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 23);
        System.out.println("Números: " + numeros.stream().sorted().toList());

        List<Integer> numerosPrimos = numeros.stream().filter(n ->
                IntStream.rangeClosed(2, (int)Math.sqrt(n)).noneMatch(p -> n % p == 0)).toList();

        System.out.printf("Números primos da lista: " + numerosPrimos);
    }
}
