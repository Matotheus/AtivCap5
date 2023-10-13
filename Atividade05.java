public class Atividade05 {
    public static void main(String[] args) {
        for(int j = 1; j <= 10; j++){//DE FORA
            System.out.println("\nTabuada de "+j);
            for(int i = 0; i <= 10; i++){//DE DENTRO
                System.out.println(j + " x " + i + " = " + j*i);
            }

        }
        System.out.println();
    }
}
