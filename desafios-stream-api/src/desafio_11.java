import java.util.Arrays;
import java.util.List;

public class desafio_11 {
    public static void main(String[] args) {
        //Desafio 11 - Encontre a soma dos quadrados de todos os números da lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println("Números: " + numeros.stream().sorted().toList());

        int somaDosQuadrados = numeros.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.printf("A soma dos quadrados dos numeros da lista é: %d", somaDosQuadrados);
    }
}
