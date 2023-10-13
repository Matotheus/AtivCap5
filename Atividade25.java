import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double totalInvestido = 0;
        double totalJurosPagos = 0;

        while (true) {
            System.out.print("Digite o código do cliente (ou código menor ou igual a 0 para encerrar): ");
            int codigoCliente = entrada.nextInt();

            if (codigoCliente <= 0) {
                break;
            }

            System.out.print("Digite o tipo do investimento (1 - Poupança, 2 - Poupança plus, 3 - Fundos de renda fixa): ");
            int tipoInvestimento = entrada.nextInt();

            System.out.print("Digite o valor investido: R$ ");
            double valorInvestido = entrada.nextDouble();

            double rendimentoMensal = 0;

            if (tipoInvestimento == 1) {
                rendimentoMensal = valorInvestido * 0.015;
            } else if (tipoInvestimento == 2) {
                rendimentoMensal = valorInvestido * 0.02;
            } else if (tipoInvestimento == 3) {
                rendimentoMensal = valorInvestido * 0.04;
            } else {
                System.out.println("Tipo de investimento inválido. Nenhum rendimento calculado.");
            }

            totalInvestido += valorInvestido;
            totalJurosPagos += rendimentoMensal;

            System.out.println("Rendimento mensal: R$ " + rendimentoMensal);
        }

        System.out.println("Total investido: R$ " + totalInvestido);
        System.out.println("Total de juros pagos: R$ " + totalJurosPagos);

        entrada.close();
    }
}
