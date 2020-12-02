/*
    El siguiente programa muestra la siguiente salida:
    10 + 1 = 11
    10 * 1 = 10
    10 + 2 = 12
    10 * 2 = 20
    10 + 3 = 13
    10 * 3 = 30
    10 + 4 = 14
    10 * 4 = 40
    10 + 5 = 15
    10 * 5 = 50
    
    Modificar el código para obtener la siguiente salida:
    10 + 1 = 11
    10 + 2 = 12
    10 + 3 = 13
    10 + 4 = 14
    10 + 5 = 15

    10 * 1 = 10
    10 * 2 = 20
    10 * 3 = 30
    10 * 4 = 40
    10 * 5 = 50
    
 */
package ejemplosrepaso;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {
    public static void main(String[] args) {
        
        int operacion01;
        int operacion02;
        int tabla = 10;
        String cadena01 = "";
        for (int i = 1; i <= 5; i++) {
            operacion01 = tabla + i;
            operacion02 = tabla * i;
            cadena01 = String.format("%s%d + %d = %d\n", cadena01, 
                    tabla, i, operacion01);
            cadena01 = String.format("%s%d * %d = %d\n", cadena01, 
                    tabla, i, operacion02);
        }
        
        System.out.printf("%s\n", cadena01);
    }
}
