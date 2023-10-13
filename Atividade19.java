import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lucroTotalEmpresa = 0;
        int acoesLucroSuperior1000 = 0;
        int acoesLucroInferior200 = 0;

        while (true) {
            System.out.print("Digite o tipo da ação (ou 'F' para finalizar): ");
            char tipoAcao = entrada.next().charAt(0);

            if (tipoAcao == 'F') {
                break;
            }

            System.out.print("Digite o preço de compra da ação: R$ ");
            double precoCompra = entrada.nextDouble();

            System.out.print("Digite o preço de venda da ação: R$ ");
            double precoVenda = entrada.nextDouble();

            double lucroAcao = precoVenda - precoCompra;
            lucroTotalEmpresa += lucroAcao;

            System.out.println("Lucro da ação: R$ " + lucroAcao);

            if (lucroAcao > 1000) {
                acoesLucroSuperior1000++;
            } else if (lucroAcao < 200) {
                acoesLucroInferior200++;
            }
        }

        System.out.println("Quantidade de ações com lucro superior a R$ 1.000,00: " + acoesLucroSuperior1000);
        System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: " + acoesLucroInferior200);
        System.out.println("Lucro total da empresa: R$ " + lucroTotalEmpresa);

        entrada.close();
    }
}
