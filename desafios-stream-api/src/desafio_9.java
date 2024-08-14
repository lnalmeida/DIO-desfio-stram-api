import java.util.Arrays;
import java.util.List;

public class desafio_9 {
    public static void main(String[] args) {
        //Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Números: " + numeros.stream().sorted().toList());
        String saoDistintos = numeros.stream().distinct().count() < numeros.size() ? "SIM" : "NÃO";

        System.out.printf("Existem números repetidos na lista? %s", saoDistintos);
    }
}
