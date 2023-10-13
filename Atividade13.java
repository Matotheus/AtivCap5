import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalPessoas = 15;
        int totalIdade10 = 0, totalIdade20 = 0, totalIdade30 = 0, totalIdadeMais30 = 0;
        double somaPeso10 = 0, somaPeso20 = 0, somaPeso30 = 0, somaPesoMais30 = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();

            System.out.print("Digite o peso da pessoa " + i + ": ");
            double peso = entrada.nextDouble();

            if (idade >= 1 && idade <= 10) {
                totalIdade10++;
                somaPeso10 += peso;
            } else if (idade >= 11 && idade <= 20) {
                totalIdade20++;
                somaPeso20 += peso;
            } else if (idade >= 21 && idade <= 30) {
                totalIdade30++;
                somaPeso30 += peso;
            } else {
                totalIdadeMais30++;
                somaPesoMais30 += peso;
            }
        }

        System.out.println("Média de peso para pessoas de 1 a 10 anos: " + (somaPeso10 / totalIdade10));
        System.out.println("Média de peso para pessoas de 11 a 20 anos: " + (somaPeso20 / totalIdade20));
        System.out.println("Média de peso para pessoas de 21 a 30 anos: " + (somaPeso30 / totalIdade30));
        System.out.println("Média de peso para pessoas com mais de 30 anos: " + (somaPesoMais30 / totalIdadeMais30));

        entrada.close();
    }
}
