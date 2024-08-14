import java.util.Arrays;
import java.util.List;

public class desafio_2 {
    public static void main(String[] args) {
        //Desafio 2 - Imprima a soma dos números pares da lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somarNumerosPares = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);

        System.out.print("Numeros pares: ");
        numeros.stream().filter(n -> n % 2 == 0).sorted().forEach(n -> System.out.print(n+", "));
        System.out.println("\nA soma dos números pares é: " + somarNumerosPares);
    }
}
