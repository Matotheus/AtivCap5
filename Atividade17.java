import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalAudienciaTotal = 0;
        int audienciaCanal4 = 0;
        int audienciaCanal5 = 0;
        int audienciaCanal7 = 0;
        int audienciaCanal12 = 0;

        while (true) {
            System.out.print("Digite o número do canal (4, 5, 7, 12) ou 0 para encerrar: ");
            int canal = entrada.nextInt();

            if (canal == 0) {
                break; // Encerra a entrada de dados
            } else if (canal == 4 || canal == 5 || canal == 7 || canal == 12) {
                System.out.print("Digite o número de pessoas assistindo ao canal " + canal + ": ");
                int audiencia = entrada.nextInt();

                totalAudienciaTotal += audiencia;

                if (canal == 4) {
                    audienciaCanal4 += audiencia;
                } else if (canal == 5) {
                    audienciaCanal5 += audiencia;
                } else if (canal == 7) {
                    audienciaCanal7 += audiencia;
                } else if (canal == 12) {
                    audienciaCanal12 += audiencia;
                }
            } else {
                System.out.println("Canal inválido. Digite novamente.");
            }
        }

        if (totalAudienciaTotal > 0) {
            double porcentagemCanal4 = (double) (audienciaCanal4 * 100) / totalAudienciaTotal;
            double porcentagemCanal5 = (double) (audienciaCanal5 * 100) / totalAudienciaTotal;
            double porcentagemCanal7 = (double) (audienciaCanal7 * 100) / totalAudienciaTotal;
            double porcentagemCanal12 = (double) (audienciaCanal12 * 100) / totalAudienciaTotal;

            System.out.println("Porcentagem de audiência do canal 4: " + porcentagemCanal4 + "%");
            System.out.println("Porcentagem de audiência do canal 5: " + porcentagemCanal5 + "%");
            System.out.println("Porcentagem de audiência do canal 7: " + porcentagemCanal7 + "%");
            System.out.println("Porcentagem de audiência do canal 12: " + porcentagemCanal12 + "%");
        } else {
            System.out.println("Nenhos dados de audiência foram fornecidos.");
        }

        entrada.close();
    }
}
