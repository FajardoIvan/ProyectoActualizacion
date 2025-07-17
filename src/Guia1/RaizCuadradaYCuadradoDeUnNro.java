package Guia1;

import java.util.Scanner;

/**
 *
 * @author ivanfajardo
 */
public class RaizCuadradaYCuadradoDeUnNro {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un Numero");
        int numero= entrada.nextInt();
        
        double raiz= Math.sqrt(numero);
        System.out.println("La raiz del nro es:"+ raiz);
        
        System.out.println("El Cuadrado del nro es:" + numero*numero);
    }
    
}
