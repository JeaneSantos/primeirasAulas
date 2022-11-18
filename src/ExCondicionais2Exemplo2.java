public class ExCondicionais2Exemplo2 {
            public static void main(String[] args) {


                double temperaturaFarenheit = 50;
                double conta1 = temperaturaFarenheit - 32;
                double temperaturaCelsius = conta1 / 1.8;
                String grau = "F";

                System.out.println("2. Conversor Celsius / Farenheit (revisitado)");
                System.out.println("Exemplo 2");

                if (grau == "C") {
                    System.out.println("Celsius");
                } else {
                    System.out.println("Farenheit");
                }


                System.out.println("A temperatura informada foi " + temperaturaFarenheit + "ºF");
                System.out.print("Ela equivale a ");
                System.out.print (temperaturaCelsius);
                System.out.print (" Celsius");


            }
        }
