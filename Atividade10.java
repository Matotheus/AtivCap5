import java.util.Scanner;

public class Atividade10 {

     public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int num, somaPar = 0, somaPrimo = 0, primo = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i+1) +"º número: ");
            num = entrada.nextInt();
            if (num % 2 == 0){
                somaPar += num;
            }

            for (int j = 2; j <= num; j++) {
                if (num % j == 0) {
                    primo++;
                }
            }
            if(primo == 1){
                somaPrimo += num;                
            }
            primo = 0;
        }

        System.out.println("Soma pares: "+ somaPar);
        System.out.println("Soma primos: "+ somaPrimo);

        entrada.close();
     }
}