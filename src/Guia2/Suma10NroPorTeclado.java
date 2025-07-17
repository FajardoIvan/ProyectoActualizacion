package Guia2;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanfajardo
 */
public class Suma10NroPorTeclado {
    public static void main(String[] args) {
        
        int suma=0,numero=0;
        for(int i=1; i<=10; i++){
        
            numero= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un nro"));
            suma= suma+numero;                    
    }
        JOptionPane.showMessageDialog(null,"La suma es:" +suma);
    }
    
}
