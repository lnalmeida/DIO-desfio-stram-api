import java.util.Arrays;
import java.util.List;


public class desafio_1 {
    //Desafio 1 - Mostre a lista na ordem numérica:
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().sorted().toList());
    }
}

