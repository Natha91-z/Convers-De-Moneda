import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion != 9){
            System.out.println("--------------------\n" +
                    "Bienvenido Al Conversor de Monedas\n\n"+
                    "Selecciona la opcion que vas a convertir\n\n"+
                    "1.Dolar a Peso Colombiano \n" +
                    "2.Peso Colombiano a Dolar \n" +
                    "3.Dolar a Peso Argentino\n" +
                    "4.Peso Argentino a Dolar \n" +
                    "5.Dolar a Real Brasilero \n" +
                    "6.Real Brasilero a Dolar \n" +
                    "7.Dolar a Soles Peruanos\n" +
                    "8.Soles Peruanos a Dolar \n" +
                    "9. Salir...");

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir( "USD","COP", consulta, lectura);
                    break;

                case 2:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;

                case 3:
                    ConvertirMoneda.convertir("USD","ARS", consulta, lectura);
                    break;

                case 4:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;

                case 5:
                    ConvertirMoneda.convertir("USD","BRL", consulta, lectura);
                    break;

                case 6:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;

                case 7:
                    ConvertirMoneda.convertir("USD","PEN", consulta, lectura);
                    break;

                case 8:
                    ConvertirMoneda.convertir("PEN", "USD", consulta, lectura);
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Esta Opcion no es Valida");
                    break;

            }
        }
    }
}
