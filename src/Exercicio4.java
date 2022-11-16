public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("Converter de reais para diversas moedas");

           double reais = 1.00;
           double valorRecebido = reais*10.00;
           double dolares = 0.18814218;
           double euros = 0.18079595;
           double libras = 0.15819786;
           double pesosArgentinos = 30.602414;
           double coroaTchecas = 4.4056762;



        System.out.println("O valor recebido é " + reais*10.00 + "reais.");
        System.out.println("Isso equivale a:");

        System.out.println(valorRecebido*dolares + " dólares");
        System.out.println(valorRecebido*euros + " euros");
        System.out.println(valorRecebido*libras + " libras");
        System.out.println(valorRecebido*pesosArgentinos + " pesos argentinos");
        System.out.println(valorRecebido*coroaTchecas + " coroas tchecas");


        System.out.println("Desafio extra: Limite para 2 a quantidade de casas decimais.");

    }
}
