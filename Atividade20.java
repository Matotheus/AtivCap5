import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.print("Digite a primeira nota: ");
                double nota1 = entrada.nextDouble();
                System.out.print("Digite a segunda nota: ");
                double nota2 = entrada.nextDouble();
                double mediaAritmetica = (nota1 + nota2) / 2;
                System.out.println("Média aritmética: " + mediaAritmetica);
            } else if (opcao == 2) {
                System.out.print("Digite a primeira nota: ");
                double nota1 = entrada.nextDouble();
                System.out.print("Digite o peso da primeira nota: ");
                double peso1 = entrada.nextDouble();
                System.out.print("Digite a segunda nota: ");
                double nota2 = entrada.nextDouble();
                System.out.print("Digite o peso da segunda nota: ");
                double peso2 = entrada.nextDouble();
                System.out.print("Digite a terceira nota: ");
                double nota3 = entrada.nextDouble();
                System.out.print("Digite o peso da terceira nota: ");
                double peso3 = entrada.nextDouble();
                double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
                System.out.println("Média ponderada: " + mediaPonderada);
            } else if (opcao == 3) {
                System.out.println("Saindo do programa. Obrigado!");
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 3);

        entrada.close();
    }
}
