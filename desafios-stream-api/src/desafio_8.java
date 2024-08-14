import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio_8 {
    public static void main(String[] args) {
        //Desafio 8 - Somar os dígitos de todos os números da lista:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<String> numerosToString = numeros.stream().flatMap(n -> Arrays.stream(n.toString().split(""))).toList();
        int somaDigitos = numerosToString.stream().mapToInt(n -> Integer.parseInt(n)).reduce(0, (n1, n2) -> n1 + n2);
        System.out.print("Números divididos por digito: " + numerosToString + "\n");
        System.out.print("Soma dos dígitos: " + somaDigitos + "\n");



    }
}
