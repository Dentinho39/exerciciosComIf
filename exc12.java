import java.util.Scanner;

//Júlio César da Silva


public class exc12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu sálario.");

        double salario = ler.nextDouble();

        if (salario <= 600) {
            System.out.println("Isento");

        } else if (salario > 600 && salario <= 1200) {
            double desconto = salario * 0.2;

            System.out.println("\n Desconto de "  + desconto  + " no sálario");
        } else if (salario > 1200 && salario <= 2000) {

            double desconto = salario * 0.25;

            System.out.println("\n Desconto de "  + desconto  + " no sálario");

        } else {

            double desconto = salario * 0.3;

            System.out.println("\n Desconto de "  + desconto  + " no sálario");

        }

    }
}
