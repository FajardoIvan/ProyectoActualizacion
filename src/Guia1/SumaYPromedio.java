package Guia1;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanfajardo
 */
public class SumaYPromedio {
    
    public static void main(String[] args) {
        int num1,num2,num3,suma;
        
        num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        num2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        num3= Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        
        suma= (num1+num2+num3);
        double promedio= (suma/3);
        
        JOptionPane.showMessageDialog(null,"La suma de los 3 numeros es:" +suma);
        
        JOptionPane.showMessageDialog(null,"El Promedio 3 numeros es:" +promedio);
    }
    
}
