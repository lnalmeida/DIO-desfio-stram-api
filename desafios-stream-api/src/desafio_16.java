import java.util.Arrays;
import java.util.List;

public class desafio_16 {
    public static void main(String[] args) {
        //Desafio 16 - Agrupe os números em pares e ímpares
        List<Integer> numeros = Arrays.asList( -2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 23);
        System.out.println("Números: " + numeros.stream().sorted().toList());

        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        System.out.printf("Numeros pares: " + numerosPares);
        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).toList();
        System.out.printf("\nNumeros ípares: " + numerosImpares);

    }
}
