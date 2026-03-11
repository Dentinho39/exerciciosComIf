import java.util.Scanner;

//Júlio César da Silva


public class exc9 {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);

        double salario, porcetagemDosalario, prestacao;

        System.out.println("Digite o sálario");
        salario = ler.nextDouble();

        System.out.println("Digite o valor da pretação desejado");
        prestacao = ler.nextDouble();

        porcetagemDosalario = salario * 0.3;


        if (porcetagemDosalario >= prestacao) {
            System.out.println("Emprestimpo concluido com sucesso.");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }

    }
}
