public class Excondicionais2 {
    public static void main(String[] args) {


         double temperaturaCelsius = 30;
         double temperaturaFarenheit = (temperaturaCelsius*1.8+32);
         String grau = "C";

        System.out.println("2. Conversor Celsius / Farenheit (revisitado)");
        System.out.println("Exemplo 1");

        if (grau == "C"){
            System.out.println("Celsius");
        } else {
            System.out.println("Farenheit");
        }


        System.out.println("A temperatura informada foi " + temperaturaCelsius + "ºC");
        System.out.print("Ela equivale a ");
        System.out.print(temperaturaCelsius*1.8+32 + "ºF");






    }



}
