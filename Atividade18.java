import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double somaSalarios = 0;
        int quantidadePessoas = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int menorSalario = Integer.MAX_VALUE;
        int idadeMenorSalario = 0;
        char sexoMenorSalario = ' ';
        int mulheresSalarioAte200 = 0;

        while (true) {
            System.out.print("Digite a idade (ou idade negativa para encerrar): ");
            int idade = entrada.nextInt();

            if (idade < 0) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            char sexo = entrada.next().charAt(0);

            System.out.print("Digite o salário: R$ ");
            double salario = entrada.nextDouble();

            somaSalarios += salario;
            quantidadePessoas++;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (sexo == 'F' || sexo == 'f') {
                if (salario <= 200.00) {
                    mulheresSalarioAte200++;
                }
            }

            if (salario < menorSalario) {
                menorSalario = (int) salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }
        }

        if (quantidadePessoas > 0) {
            double mediaSalarios = somaSalarios / quantidadePessoas;

            System.out.println("Média dos salários do grupo: R$ " + mediaSalarios);
            System.out.println("Maior idade do grupo: " + maiorIdade + " anos");
            System.out.println("Menor idade do grupo: " + menorIdade + " anos");
            System.out.println("Quantidade de mulheres com salário até R$ 200,00: " + mulheresSalarioAte200);
            System.out.println("Idade e sexo da pessoa com o menor salário: " + idadeMenorSalario + " anos, " + sexoMenorSalario);
        } else {
            System.out.println("Nenhum dado válido foi fornecido.");
        }

        entrada.close();
    }
}
