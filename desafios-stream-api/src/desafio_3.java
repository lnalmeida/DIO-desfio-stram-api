import java.util.Arrays;
import java.util.List;

public class desafio_3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosPositivos = numeros.stream().allMatch(n -> n >= 0);
        System.out.print("Números: ");
        numeros.stream().sorted().forEach(n -> System.out.print(n+", "));
        System.out.println("\nTodos os Números são positivos? ".concat(todosPositivos ? "SIM" : "NÃO"));

    }
}
