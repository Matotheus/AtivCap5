import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalEntrevistados = 10;
        int simTotal = 0;
        int naoTotal = 0;
        int mulheresSim = 0;
        int homensTotal = 0;
        int homensNao = 0;

        for (int i = 1; i <= totalEntrevistados; i++) {
            System.out.print("Digite o sexo do entrevistado " + i + " (M para mulher ou H para homem): ");
            char sexo = entrada.next().charAt(0);
            System.out.print("Digite a resposta do entrevistado " + i + " (S para sim ou N para não): ");
            char resposta = entrada.next().charAt(0);

            if (resposta == 'S' || resposta == 's') {
                simTotal++;
                if (sexo == 'M' || sexo == 'm') {
                    mulheresSim++;
                }
            } else if (resposta == 'N' || resposta == 'n') {
                naoTotal++;
                if (sexo == 'H' || sexo == 'h') {
                    homensTotal++;
                }
            }
        }

        double percentagemHomensNao = homensTotal > 0 ? (double) (homensNao * 100) / homensTotal : 0;

        System.out.println("Número de pessoas que responderam 'sim': " + simTotal);
        System.out.println("Número de pessoas que responderam 'não': " + naoTotal);
        System.out.println("Número de mulheres que responderam 'sim': " + mulheresSim);
        System.out.println("Percentagem de homens que responderam 'não': " + percentagemHomensNao + "%");

        entrada.close();
    }
}
