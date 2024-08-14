import java.util.Arrays;
import java.util.List;

public class desafio_12 {
    public static void main(String[] args) {
        //Desafio 12 - Encontre o produto de todos os números da lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println("Números: " + numeros.stream().sorted().toList());

        int produtoDosNumeros = numeros.stream().reduce(1, (n1, n2) -> n1 * n2);

        System.out.printf("O produto dos números da lista é: %d", produtoDosNumeros);
    }
}
