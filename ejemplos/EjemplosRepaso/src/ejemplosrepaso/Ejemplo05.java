/*
    El siguiente programa muestra de forma infinita la frase:
    Usted está en el ciclo

    Modificar el código para que el usuario decida si quiere seguir en el ciclo
    El usuario podrá salir con las siguiente opciones:
    SI
    Si
    SI
    si
    sI
    S
    s
 */
package ejemplosrepaso;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        boolean bandera = true;
        while (bandera) {
            System.out.println("Usted está en el ciclo");
        }
    }
}
