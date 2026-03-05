import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double num1, num2;

        System.out.println("Digite dois números diferentes");
        num1 = ler.nextDouble();
        num2 = ler.nextDouble();

        if (num1 > num2) {
            System.out.printf("#f Maior que #f", num1, num2);
        } else {
            System.out.printf("#f Maior que #f", num2, num1);
        }
    }
}