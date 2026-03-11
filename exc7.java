import java.util.Scanner;

//Júlio César da Silva

public class exc7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int anosDeEmpresa;
        double salario;

        System.out.println("Digite quantos anos você tem de empresa");
        anosDeEmpresa = ler.nextInt();

        System.out.println("Digite seu sálario: ");
        salario = ler.nextDouble();

        if (anosDeEmpresa >= 5) {

            double bonus = salario * 0.2;
            System.out.println("O bônus é de " + bonus);
        } else {
            double bonus = salario * 0.1;
            System.out.println("O bônus é de " + bonus);
        }


    }
}
