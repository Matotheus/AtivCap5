import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //var ent = new Scanner(System.in);
        int idade = 0, idadeMaior50 = 0, qtdAlturaIdade10E20 = 0;
        double altura = 0, peso = 0, somaAlturaIdade10E20 = 0, pesoMenor40 = 0, mediaAltura = 0, perPeso = 0, somaPeso = 0;

        for(int i = 0; i < 5 ; i++){
            System.out.println("Informe sua idade: ");
            idade = entrada.nextInt();
            System.out.println("Informe seu peso: ");
            peso = entrada.nextInt();
            System.out.println("Informe sua altura: ");
            altura = entrada.nextInt();

            if(idade > 50){
                idadeMaior50++;
                //idadeMaior50 = IdadeMaior50 + 1
            }
            if((idade >= 10) && (idade <= 20)){
                qtdAlturaIdade10E20++;
                somaAlturaIdade10E20 += altura;
                //somaAlturaIdade10E20 = somaAlturaIdade10E20 + altura
            }
            if(peso < 40){
                pesoMenor40 += peso;

                mediaAltura = somaAlturaIdade10E20 / qtdAlturaIdade10E20;
                perPeso = (pesoMenor40 / somaPeso)*100;
            }
        }    
            System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + idadeMaior50);
            System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAltura);
            System.out.println("Porcentagem de pessoas com peso inferior a 40 Kg: " + perPeso);




        entrada.close();
    }
}
