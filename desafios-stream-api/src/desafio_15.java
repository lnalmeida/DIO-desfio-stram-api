import java.util.Arrays;
import java.util.List;

public class desafio_15 {
    public static void main(String[] args) {
        //Desafio 15 - Verifique se a lista contém pelo menos um número negativo
        List<Integer> numeros = Arrays.asList( -2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 23);
        System.out.println("Números: " + numeros.stream().sorted().toList());

        String temNegativo = numeros.stream().anyMatch(n -> n < 0) ? "SIM" : "NÃO";

        System.out.printf("Existe algum número negativo na lista? %s", temNegativo);
    }
}
