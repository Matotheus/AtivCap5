import java.util.Scanner;

public class Atividade08 {

     public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int idade = 0, qtdIdadeMaior50EPesoMenor60 = 0, qtdIdadeAlturaMenor150 = 0;
        int olhosAzuis = 0, ruivasSemOlhosAzuis = 0;
        double peso = 0, altura = 0, somaIdadeAlturaMenor150 = 0, mediaIdades = 0;
        double perOlhos = 0;
        char olhos = ' ', cabelos =' ';

        for(int i = 0; i < 6; i++){
            System.out.print("Informe sua idade: ");
            idade = entrada.nextInt();
            System.out.print("Informe seu peso: ");
            peso = entrada.nextDouble();
            System.out.print("Informe sua altura: ");
            altura = entrada.nextDouble();
            System.out.print(
                "(A — azul; P — preto; V — verde; e C — castanho)"
                + "\nCor dos olhos: ");
            olhos = entrada.next().charAt(0);
            System.out.print(
                "(P — preto; C — castanho; L — louro; e R — ruivo)"
                +"\nCor dos cabelos: ");
            cabelos = entrada.next().charAt(0);

            if(idade > 50 && peso < 60){
                qtdIdadeMaior50EPesoMenor60++;
            }
            if(altura < 1.50){
                qtdIdadeAlturaMenor150++;
                somaIdadeAlturaMenor150 += idade;
            }
            if((olhos == 'A') || (olhos == 'a')){
                olhosAzuis++;                
            }
            if(((cabelos == 'R') || (cabelos == 'r') ) && ((olhos != 'A') || (olhos != 'a'))){
                ruivasSemOlhosAzuis++;
            }
        }

        mediaIdades = somaIdadeAlturaMenor150 / qtdIdadeAlturaMenor150;
        perOlhos = (olhosAzuis / 6.0)*100;

        System.out.println("Quantidade de pessoas com idade superior a 50 anos "
        +"e peso inferior a 60 kg: " + qtdIdadeMaior50EPesoMenor60);
        System.out.println(
            "Média das idades das pessoas com altura inferior a 1,50 m: "+
            mediaIdades);
        System.out.println("Porcentagem de pessoas com olhos azuis: "+ perOlhos+"%");
        System.out.println("Ruivas e que não possuem olhos azuis: "+ ruivasSemOlhosAzuis);

        entrada.close();
     }
}