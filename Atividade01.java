import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, d, m1, m2, m3, m4;

        int grupo = 1;
        for(int i = 0;i <= 4; i++){
            System.out.println("Valores grupo "+ grupo);
            System.out.print("Informe o número A: ");
            a = entrada.nextDouble();
            System.out.print("Informe o número B: ");
            b = entrada.nextDouble();
            System.out.print("Informe o número C: ");
            c = entrada.nextDouble();
            System.out.print("Informe o número D: ");
            d = entrada.nextDouble();

            if(a > b && a > c && a > d){
                m1 = a;
                if (b > c && b > d){
                    m2 = b;
                    if(c > d) {
                        m3 = c;
                        m4 = d;
                    }else{
                        m3 = d;
                        m4 = c;
                    }
                }else if(c > b && c > d){
                    m2 = c;
                    if (b > d){
                        m3 = b;
                        m4 = d;
                    }else{
                        m3 = d;
                        m4 = b;
                    }
                }else {
                    m2 = d;
                    if(b > c){
                        m3 = b;
                        m4 = c;
                    }else{
                        m3 = c;
                        m4 = b;
                    }
                }


            }else if(b > a && b > c && b > d){
                m1 = b;
                if (a > c && a > d){
                    m2 = a;
                    if(c > d){
                        m3 = c;
                        m4 = d;
                    }else{
                        m3 = d;
                        m4 = c;
                    }
                }else if (c > a && c > d){
                    m2 = c;
                    if(a > d){
                        m3 = a;
                        m4 = d;
                    }else{
                        m3 = d;
                        m4 = a;
                    }
                }else{
                    m2 = d;
                    if(a > c){
                        m3 = a;
                        m4 = c;
                    }else{
                        m3 = c;
                        m4 = a;
                    }
                }
            }else if (c > a && c > b && c > d){
                m1 = c;
                if(a > b && a > d){
                    m2 = a;
                    if(b > d){
                        m3 = b;
                        m4 = d;
                    }else{
                        m3 = d;
                        m4 = b;
                    }
                }else if (b > a && b > d){
                    m2 = b;
                    if(a > d){
                        m3 = a;
                        m4 = d;                        
                    }else{
                        m3 = d;
                        m4 = a;
                    }
                }else{
                    m2 = d;
                    if(a > b){
                        m3 = a;
                        m4 = b;                        
                    }else{
                        m3 = b;
                        m4 = a;
                    }
                }
            }else{
                m1 = d;
                if(a > b && a > c){
                    m2 = a;
                    if (b > c){
                        m3 = b;
                        m4 = c;
                    }else{
                        m3 = c;
                        m4 = b;
                    }
                }else if (b > a && b > c){
                    m2 = b;
                    if(a > c){
                        m3 = a;
                        m4 = c;
                    }else{
                        m3 = c;
                        m4 = a;
                    }
                }else{
                    m2 = c;
                    if(a > b){
                        m3 = a;
                        m4 = b;
                    }else{
                        m3 = b;
                        m4 = a;
                    }
                }
            }

            System.out.println(
                "Ordem crescente: "+ m4 + ", "+ m3 +", "+m2 + ", "+m1+".");
            System.out.println(
                "Ordem decrescente: "+ m1 + ", "+ m2 + ", "+m3+", "+ m4+".");

            grupo = grupo + 1;
        }
        entrada.close();

    }

}