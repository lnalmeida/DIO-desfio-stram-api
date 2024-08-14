import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class desafio_4 {
    public static void main(String[] args) {
        //Desafio 4 - Remova todos os valores ímpares:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.print("Numeros pares: ");
        numeros.stream().filter(n -> n % 2 == 0).sorted().forEach(n -> System.out.print(n+", "));
    }
}
