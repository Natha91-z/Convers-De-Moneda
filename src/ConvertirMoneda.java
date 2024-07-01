import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consultar, Scanner lectura) {
        double cantidad;
        double cantiadaConvertida;

        Monedas monedas = consultar.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("Tasa de conversion del dia de hoy\n1 "+monedaBase+ "=" +monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingresa la cantidad de " +monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantiadaConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+ " "+monedaBase+ "=" +cantiadaConvertida+ "" +monedas.target_code());
    }
}
