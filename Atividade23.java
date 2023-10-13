import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Menu de opções:");
            System.out.println("1. Novo salário");
            System.out.println("2. Férias");
            System.out.println("3. Décimo terceiro");
            System.out.println("4. Sair");
            System.out.print("Digite a opção desejada: ");
            int opcao = entrada.nextInt();

            if (opcao == 4) {
                System.out.println("Saindo do programa. Obrigado!");
                break; // Encerra o programa
            }

            double salario;
            double resultado = 0;

            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Digite o salário do funcionário: R$ ");
                salario = entrada.nextDouble();

                if (opcao == 1) {
                    if (salario <= 210.00) {
                        resultado = salario * 1.15;
                    } else if (salario <= 600.00) {
                        resultado = salario * 1.10;
                    } else {
                        resultado = salario * 1.05;
                    }
                } else if (opcao == 2) {
                    resultado = salario + (salario / 3);
                } else if (opcao == 3) {
                    System.out.print("Digite o número de meses de trabalho na empresa (no máximo 12): ");
                    int mesesTrabalhados = entrada.nextInt();
                    resultado = (salario * mesesTrabalhados) / 12;
                }

                System.out.println("Resultado: R$ " + resultado);
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        entrada.close();
    }
}
