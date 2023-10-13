import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalPessoas = 0;
        double somaAlturas = 0;

        while (true) {
            System.out.print("Digite a idade da pessoa (ou idade menor ou igual a zero para encerrar): ");
            int idade = entrada.nextInt();

            if (idade <= 0) {
                break;
            }

            System.out.print("Digite a altura da pessoa (em metros): ");
            double altura = entrada.nextDouble();

            if (idade > 50) {
                totalPessoas++;
                somaAlturas += altura;
            }
        }

        if (totalPessoas > 0) {
            double mediaAlturas = somaAlturas / totalPessoas;
            System.out.println("A média das alturas das pessoas com mais de 50 anos é: " + mediaAlturas + " metros");
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi considerada na média.");
        }
        
        entrada.close();
    }
}
