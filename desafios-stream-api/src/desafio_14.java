import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class desafio_14 {
    public static void main(String[] args) {
        //Desafio 14 - Encontre o maior número primo da lista:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 23);
        System.out.println("Números: " + numeros.stream().sorted().toList());

        Optional<Integer> maiorPrimo = numeros.stream().filter(n ->
                IntStream.rangeClosed(2, (int)Math.sqrt(n)).noneMatch(p -> n % p == 0)).max(Integer::compareTo);

        System.out.printf("O maior número primo da lista é: %d", maiorPrimo.orElse(0));
    }
}
