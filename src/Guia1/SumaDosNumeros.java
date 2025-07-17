package Guia1;

import java.util.Scanner;

/**
 *
 * @author ivanfajardo
 */
public class SumaDosNumeros {
    
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Ingrese 1er Numero");
        int uno = entrada.nextInt();
        
        
        System.out.println("Ingrese 2do Numero");
        int dos = entrada.nextInt();
        
        int total;
        total = uno+dos;
        
        System.out.printf("La Suma es:"+total);
    }
    
}
