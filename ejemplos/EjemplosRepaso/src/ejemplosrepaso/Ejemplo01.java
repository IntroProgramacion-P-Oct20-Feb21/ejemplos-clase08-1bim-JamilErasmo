/*
 *  Las entradas son: ciudad Loja, pais Ecuador
    La salida del programa debe ser así:
    
    Loja, ciudad
    del país:
        Ecuador.
 */
package ejemplosrepaso;
import java.util.Locale;
import java.util.Scanner;

public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //
        Scanner entrada = new Scanner(System.in);
        String ciudad = null;
        String pais = null;
        System.out.printf("%s%s", ciudad, pais);
    }
    
}
