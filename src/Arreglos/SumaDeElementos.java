package Arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanfajardo
 */
public class SumaDeElementos {
    
    public static void main(String[] args) {
        int numeros[];     // Se declara un arreglo tipo int   
        int cantidad=0, suma=0;// Variable cantidad para saber cuantos numeros desea ingresar
        
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cuantos Numeros desea ingresar"));
        
        numeros= new int[cantidad];// aqui Inicializo el arreglo y le doy su dimension
                    
        for(int i=0; i<cantidad; i++){
            
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"+ i+1));
            
        }
        
        for(int i:numeros)suma+=i;// uso del for each
        
        JOptionPane.showMessageDialog(null,"La Suma Es: "+suma);
                
    }    
}
