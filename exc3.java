import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {

        Scanner ler =  new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite um número: ");
        num1 = ler.nextInt();

        System.out.println("Digite outro número: ");
        num2 = ler.nextInt();

        if(num1 == num2) {
            System.out.println("Os números são iguais.");
        } else if (num1 > num2) {

            System.out.printf("%d É %d Maior que %d" , num1, (num1 - num2), num2 );
        }else {

            System.out.printf("%d É %d Maior que %d" , num2, (num2 - num1), num1 );
        }
    }
}
