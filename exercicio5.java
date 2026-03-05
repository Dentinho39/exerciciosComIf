import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);

        int num;
        System.out.println("Digite um número");
        num = ler.nextInt();

        if (num >= 50 || num <= 100) {
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Não pertence ao intervalo");
        }
    }
}
