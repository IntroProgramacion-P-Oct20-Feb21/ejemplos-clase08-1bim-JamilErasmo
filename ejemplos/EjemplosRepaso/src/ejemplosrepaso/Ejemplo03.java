/*
 *  Ejecutar el siguiente código.
    Cuando el usuario ingrese un valor diferente de 1,2,3,4 debe salir un
    mensaje que diga: 
    Error, no existe región.
    
 */
package ejemplosrepaso;

import java.util.Scanner;


public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String ciudad;
        String pais;
        String region = "";
        int tipoRegion;
        System.out.println("Ingrese el tipo los siguientes datos para imprimir "
                + "la región del Ecuador.\n"
                + "1 para Región Sierra\n"
                + "2 para Región Costa\n"
                + "3 para Región Amazónica\n"
                + "4 para Región Insular");
        tipoRegion = entrada.nextInt();
        
        if(tipoRegion==1){
            region = "Región Sierra";
        }else{
            if (tipoRegion==2) {
                region = "Región Costa";
            }else{
                if (tipoRegion==3) {
                    region = "Región Amazónica";
                }else{
                    if (tipoRegion==4) {
                        region = "Región Insular";
                    }
                }
            }
        }
        
        System.out.printf("Usted seleccionó: %s\n", region);
    }
    
}
