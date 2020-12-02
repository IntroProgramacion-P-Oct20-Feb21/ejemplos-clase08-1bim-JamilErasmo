/*
    El siguiente tiene algunos inconvenientes. 
    Modificar el código para ingresar la información por cada iteración sin
    problema.
    
 */
package ejemplosrepaso;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        double sueldo;
        String ciudad;
        int contador = 1;
        String cadena01 = "";

        while (contador <= 5) {
            System.out.println("Ingrese el nombre del trabajador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el sueldo del trabajador");
            sueldo = entrada.nextDouble();
            System.out.println("Ingrese la ciudad del trabajador");
            ciudad = entrada.nextLine();

            cadena01 = String.format("%s (%.2f) -%s-\n",
                    nombre,
                    sueldo,
                    ciudad);

        }
        System.out.printf("%s\n", cadena01);
    }
}
