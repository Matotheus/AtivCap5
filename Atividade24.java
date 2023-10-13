import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um valor inteiro positivo (ou 0 para encerrar): ");
            int valor = entrada.nextInt();

            if (valor == 0) {
                break;
            } else if (valor <= 0) {
                System.out.println("Valor inválido. Digite novamente.");
            } else {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        }

        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum valor válido foi digitado.");
        } else {
            System.out.println("Maior valor do conjunto: " + maior);
            System.out.println("Menor valor do conjunto: " + menor);
        }

        entrada.close();
    }
}
