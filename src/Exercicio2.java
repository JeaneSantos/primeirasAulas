public class Exercicio2 {
    //2. Calcular a quantidade de pessoas que cabem em uma sala de cinema

    public static void main(String[] args) {
        System.out.println("Calcular a quantidade de pessoas que cabem em uma sala de cinema ");
        int cadeirasEmcadaFileira = 8;
        int fileiras = 10;



        System.out.println(cadeirasEmcadaFileira*fileiras);
        System.out.println("Reservado para deficiente:");
        System.out.println((cadeirasEmcadaFileira*fileiras)*10/100);


    }
}