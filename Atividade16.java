import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaIdades = 0;
        int quantidadeIdades = 0;

        while (true) {
            System.out.print("Digite a idade (ou 0 para encerrar): ");
            int idade = entrada.nextInt();

            if (idade == 0) {
                break;
            } else if (idade < 0) {
                System.out.println("Idade inválida. Digite novamente.");
            } else {
                somaIdades += idade;
                quantidadeIdades++;
            }
        }

        if (quantidadeIdades > 0) {
            double mediaIdades = (double) somaIdades / quantidadeIdades;
            System.out.println("A média das idades digitadas é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade válida foi digitada.");
        }

        entrada.close();
    }
}
