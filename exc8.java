import java.util.Scanner;

//Júlio César da Silva

public class exc8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String senhaPadrao, senha;

        senhaPadrao = "R10p5";

        System.out.println("Digite a senha");
        senha = ler.next();

        if (senha.equals(senhaPadrao)) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
