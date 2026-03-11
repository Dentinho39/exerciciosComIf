import java.util.Scanner;

public class exc11 {
    //Júlio César da Silva

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.println("Digite sua idade");
        int idade = ler.nextInt();

        if(idade >= 5 && idade <= 7) {
            System.out.println("InfantilA");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("InfantilB");
        }  else if (idade >= 11 && idade <= 13) {
            System.out.println("JuvenilA");
        }  else if (idade >= 14 && idade <= 17) {
            System.out.println("JuvenilB");
        } else if (idade >= 18) {
            System.out.println("Sênior");
        }


    }
}
