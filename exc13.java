import java.util.Scanner;

//Júlio César da Silva


public class exc13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num1, num2;
        char sinal;

        System.out.println("Digite o sinal da operação desejado");
        sinal= ler.next().charAt(0);

        System.out.println("Digite dois números para fazer a conta:");
        num1 = ler.nextDouble();
        num2 = ler.nextDouble();

        if (sinal == '*') {
            System.out.printf("O resultado de %.2f X %.2f = %.2f", num1, num2, (num1 * num2));
        } else if (sinal == '+') {

            System.out.printf("O resultado de %.2f + %.2f = %.2f", num1, num2, (num1 + num2));
        } else if (sinal == '-') {

            System.out.printf("O resultado de %.2f - %.2f = %.2f", num1, num2, (num1 - num2));
        } else if (sinal == '/') {

            System.out.printf("O resultado de %.2f X %.2f = %.2f", num1, num2, (num1 / num2));
        } else {
            System.out.println("Sinal inválido.");
        }

        }
    }

