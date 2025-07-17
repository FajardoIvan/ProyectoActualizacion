package Guia1;

import java.util.Scanner;

/**
 *
 * @author ivanfajardo
 */
public class CalculoDelArea {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        double radio,area;
        
        System.out.println("Ingrese el Area");
        radio= entrada.nextDouble();
        
        if (radio<0){
            System.out.println("El radio no puede ser menor a 0");
        }
        
        area= Math.PI*Math.pow(radio, 2);
        System.out.println("El Area es:" + area);
        entrada.close();        
    }
}
