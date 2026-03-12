import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;
        String titulo, alfabetizado;

        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

        System.out.println("Tem titulo de eleitor regular s/n");
        titulo = ler.next();

        System.out.println("Pessoa alfabetizada s/n");
        alfabetizado = ler.next();

        if (idade >= 16 && titulo.equals("s") && alfabetizado.equals("s") ) {
            System.out.println("Está apto a votar");
        } else {
            System.out.println("Não está apto");
        }
    }
}
