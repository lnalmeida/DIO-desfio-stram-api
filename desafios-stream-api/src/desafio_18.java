import java.util.Arrays;
import java.util.List;

public class desafio_18 {
    public static void main(String[] args) {
        //Desafio 18 - Verifique se todos os números da lista são iguais
        //List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> numeros = Arrays.asList( -2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 23);
        System.out.println("Números: " + numeros.stream().sorted().toList());

        System.out.printf("Todos os números da lista são iguais? %s", numeros.stream().distinct().count() == 1 ? "SIM" : "NÃO");
    }
}
