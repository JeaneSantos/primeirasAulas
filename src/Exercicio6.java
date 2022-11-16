public class Exercicio6 {
    public static void main(String[] args) {
        double comprimento = 10;
        double largura = 20;
        double profundidadeInicial = 1.2;
        double profundidadeFinal = 1.8;

        double profundidadeMedia = (profundidadeInicial + profundidadeFinal)/ 2;
        double volume = comprimento*largura * profundidadeMedia;
        double capacidadeEmLitros = volume * 1000;

        System.out.printf("As dimensões da piscina são %.2F m x %.2F m", largura, comprimento);
        System.out.printf("Essa piscina comporta 360000.0 litros de água.");
    }
}
