public class Atividade02 {
    public static void main(String[] args) {
        double valorIngresso;
        int qtdIngresso = 120;

        for (double valor = 5; valor >= 1;valor = valor - 0.50){
            valorIngresso = valor * qtdIngresso - 200;
            System.out.println("Lucro: "+valorIngresso + 
            "\nQuantidade ingresso vendido: "+qtdIngresso +
            "\nValor ingresso: ");
            qtdIngresso = qtdIngresso + 26;
        }
    }
}
