import java.util.Scanner;

public class Atividade09 {

     public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int idade = 0, qtdPesoMaior90EAlturaMenor150 = 0, qtdIdadeEntre10E30EAlturaMaior190 = 0;
        double peso = 0, altura = 0, mediaIdades = 0, perIdade10E30Maior190 = 0, somaIdades = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Informe sua idade: ");
            idade = entrada.nextInt();
            System.out.print("Informe seu peso: ");
            peso = entrada.nextDouble();
            System.out.print("Informe sua altura: ");
            altura = entrada.nextDouble();

            somaIdades += idade;

            if((peso > 90) && (altura < 1.50)){
                qtdPesoMaior90EAlturaMenor150++;
            }

            if (((idade >= 10) && (idade <= 30)) && (altura > 1.90)) {
                qtdIdadeEntre10E30EAlturaMaior190++;
            }
        }

        mediaIdades = somaIdades / 10;
        perIdade10E30Maior190 = (qtdIdadeEntre10E30EAlturaMaior190/10)*100;
        
        System.out.println("Média das idades das dez pessoas: "+mediaIdades);
        System.out.println("Peso superior a 90 kg e altura inferior a 1,50 m: " + qtdPesoMaior90EAlturaMenor150);
        System.out.println("Idade entre 10 e 30 anos entre mais de 1,90 m: " + perIdade10E30Maior190);
        
        entrada.close();

     }
}