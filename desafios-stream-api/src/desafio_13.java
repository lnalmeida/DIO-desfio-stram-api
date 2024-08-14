import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class desafio_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Desafio 13 - Filtrar os números que estão dentro de um intervalo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println("Números: " + numeros.stream().sorted().toList());

        System.out.print("Digite o inicio do intervalo: ");
        int inicioIntervalo = input.nextInt();
        System.out.print("Digite o fim do intervalo: ");
        int fimIntervalo = input.nextInt();

        List<Integer> numerosNoIntervalo = numeros.stream().filter(n -> n >= inicioIntervalo && n <= fimIntervalo).sorted().toList();

        System.out.printf("Números dentro do intervalo: " + numerosNoIntervalo);
    }
}
