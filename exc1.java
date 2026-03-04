import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = ler.nextInt();

        if(num > 20){

           double rest = num / 2;

            System.out.println(rest);
        }


    }
}