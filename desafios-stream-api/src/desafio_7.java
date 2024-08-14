import java.util.Arrays;
import java.util.List;

public class desafio_7 {
    public static void main(String[] args) {
        //Desafio 7 - Encontrar o segundo número maior da lista:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        System.out.println("Números: " + numeros.stream().sorted().toList());

        int segundoMaiorNumero = numeros.stream().sorted().toList().get(numeros.size() - 2);

        System.out.printf("O segunfo maior número é: %d", segundoMaiorNumero);
    }
}
