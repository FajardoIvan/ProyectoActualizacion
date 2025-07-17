package Guia2;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanfajardo
 */
public class Promedio12NrosPorTeclado {
    
    public static void main(String[] args) {
        int promedio,suma=0,numero, acumulador=0;
        for(int i=1; i<=3;i++){
        numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nro"));
        suma= suma+numero;
        acumulador= acumulador +1;            
        }
        
        promedio= suma/acumulador;
        System.out.println("el Promedio es" +promedio);
    }
    
}
