import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fx01 = 0, fx02 = 0, fx03 = 0, fx04 = 0, fx05 = 0, idade = 0;

        for (int i = 0; i <= 7; i++){
            System.out.println("Informe sua idade: ");
            idade = entrada.nextInt();

            if (idade <= 15) {
                fx01++;
            }else if (idade >= 16 && idade <= 30){
                fx02++; // fx02 = fx02 + 1
            }else if (idade >= 31 && idade <= 45){
                fx03++;
            }else if (idade >= 46 && idade <= 60){
                fx04++;
            }else {
                fx05++;
            }
        }
        System.out.println("Quantidade de pessoas por faixa etária: ");
        System.out.println("Faixa01: " + fx01);
        System.out.println("Faixa02: " + fx02);
        System.out.println("Faixa03: " + fx03);
        System.out.println("Faixa04: " + fx04);
        System.out.println("Faixa05: " + fx05);

        double porcfx01 = fx01/0.08;
        double porcfx05 = fx05/0.08;

        System.out.println("A porcentagem de pessoas na primeira faixa etária com relação ao total de pessoas: "+porcfx01+"%");

        System.out.println("A porcentagem de pessoas na ultima faixa etária com relação ao total de pessoas: "+porcfx05+"%");
        
        entrada.close();
    }
}
