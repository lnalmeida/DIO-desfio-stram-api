import java.util.Arrays;
import java.util.List;

public class desafio_10 {
    public static void main(String[] args) {
        //Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números: " + numeros.stream().sorted().toList());

        List<Integer> multiplosDe3Ou5 = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).toList();

        System.out.print("Numeros múltiplos de 3 ou dee 5: "  + multiplosDe3Ou5);
    }
}
