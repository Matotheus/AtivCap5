import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalEspectadores = 15;
        int totalOtimo = 0;
        int totalRegular = 0;
        int totalBom = 0;
        int somaIdadesOtimo = 0;

        for (int i = 1; i <= totalEspectadores; i++) {
            System.out.print("Digite a idade do espectador " + i + ": ");
            int idade = entrada.nextInt();

            System.out.print("Digite a opinião do espectador " + i + " (ótimo=3, bom=2, regular=1): ");
            int opiniao = entrada.nextInt();

            if (opiniao == 3) {
                totalOtimo++;
                somaIdadesOtimo += idade;
            } else if (opiniao == 1) {
                totalRegular++;
            } else if (opiniao == 2) {
                totalBom++;
            }
        }

        double mediaIdadesOtimo = totalOtimo > 0 ? (double) somaIdadesOtimo / totalOtimo : 0;
        double percentagemBom = (double) (totalBom * 100) / totalEspectadores;

        System.out.println("Média de idades dos espectadores que responderam 'ótimo': " + mediaIdadesOtimo);
        System.out.println("Quantidade de espectadores que responderam 'regular': " + totalRegular);
        System.out.println("Percentagem de espectadores que responderam 'bom': " + percentagemBom + "%");

        entrada.close();
    }
}
