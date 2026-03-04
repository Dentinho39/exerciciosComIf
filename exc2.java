import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        if((num % 2) == 0){
            System.out.println(num + " O número é par");
        } else {
            System.out.println(num + " É um número ímpar");
        }
    }
}
