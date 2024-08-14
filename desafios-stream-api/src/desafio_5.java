import java.util.Arrays;
import java.util.List;

public class desafio_5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaMaioresQue5 = numeros.stream().filter(n -> n > 5).reduce(0, Integer::sum);
        double mediaMaioresQue5 = (double)somaMaioresQue5 / numeros.stream().filter(n -> n > 5).toList().size();

        System.out.printf("A soma dos números maiores que 5 é: %.0f", mediaMaioresQue5);
    }
}
