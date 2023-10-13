import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeNumerosPrimos = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.print("Digite um número inteiro: ");
            int numero = entrada.nextInt();

            boolean ehPrimo = true;

            if (numero <= 1) {
                ehPrimo = false;
            } else {
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }

            if (ehPrimo) {
                quantidadeNumerosPrimos++;
            }

            contador++;
        }

        System.out.println("A quantidade de números primos digitados é: " + quantidadeNumerosPrimos);

        entrada.close();
    }
}
