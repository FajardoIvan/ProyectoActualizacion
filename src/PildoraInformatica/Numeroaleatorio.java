package PildoraInformatica;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanfajardo
 */
public class Numeroaleatorio {
    
    public static void main(String[] args) {
        int num, numUsuario=0, intentos=0;
        
        num= (int)(Math.random()*100)+1;
        System.out.println(num);       
        
        while(num != numUsuario){
            
             numUsuario= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 100"));
             
            if (numUsuario < num){
                JOptionPane.showMessageDialog(null,"Numero Bajo, Ingrese uno mas alto");
            }
            if(numUsuario>num){
                JOptionPane.showMessageDialog(null,"Numero Alto, Ingrese uno mas Bajo");
            }
            intentos++;
        }
        
            JOptionPane.showMessageDialog(null,"Felicidades has logrado encontrar el numero en:"
                    + intentos+ " Intentos");
    }
    
}
