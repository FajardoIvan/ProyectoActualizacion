package Guia1;

import java.util.Scanner;

/**
 *
 * @author ivanfajardo
 */
public class SueldoTrabajador {
            
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese Las Horas Trabajadas");
        int hora = entrada.nextInt();
        
        System.out.println("Ingrese el Precio de la Hora");
        int precio= entrada.nextInt();
        
        int sueldo= (hora*precio);
        
        System.out.println("El Sueldo es:"+ sueldo);
        
    }
    
}
