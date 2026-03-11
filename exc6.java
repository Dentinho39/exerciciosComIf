import java.util.Scanner;

//Júlio César da Silva

public class exc6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String sexo;
        double altura;

        System.out.println("Digite seu sexo: ");
        sexo = ler.next();

        System.out.println("Digite sua altura");
        altura = ler.nextDouble();

        if (sexo == "Feminino") {
           double peso_ideal = 52 + 0.75 * (altura - 152.4);
            System.out.println("Seu peso ideal é: " + peso_ideal);
        } else {
            double peso_ideal = 72.7 + 0.75 * (altura - 152.4);
            System.out.println("Seu peso ideal é: " + peso_ideal);
        }
    }
}