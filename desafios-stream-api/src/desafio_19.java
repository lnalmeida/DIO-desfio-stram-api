import java.util.Arrays;
import java.util.List;

public class desafio_19 {
    public static void main(String[] args) {
        //Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
        List<Integer> numeros = Arrays.asList( -2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 23);
        System.out.println("Números: " + numeros.stream().sorted().toList());

        List<Integer> numerosDivisiveisPor3E5 = numeros.stream().filter(n -> n % 3 == 0 || n % 5 ==0).toList();
        System.out.print("Números divisíveis por 3 ou po 5: " + numerosDivisiveisPor3E5);

        int somaDivisiveis = numerosDivisiveisPor3E5.stream().reduce(0, Integer::sum);
        System.out.printf("\nA soma dos numeros divisíveis por 3 e por 5 é: %d", somaDivisiveis);
    }
}
