package Guia2;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanfajardo
 */
public class Operaciones50Numeros {
    public static void main(String[] args) {
        int cposi=0,sposi=0,cpar=0,spar=0, cimpar=0,simpar=0,numero;
        
        for(int i=1; i<=5; i++){
            numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
            
            if (numero>0){
                cposi=cposi+1;
                sposi= sposi+numero;
            
            } if (numero %2 == 0){
                JOptionPane.showMessageDialog(null,"Es un numero Par");
                cpar=cpar+1;
                spar=spar+numero;
            } else{
                JOptionPane.showMessageDialog(null,"Es Impar");
                cimpar=cimpar+1;     
                simpar=simpar+numero;
            }
        }
            JOptionPane.showMessageDialog(null,"Total nros positivos:"+cposi+"total nros Pares"+ cpar+
                "Total nros impares"+cimpar+"La suma de los positivos es:"+sposi+"y de los pares es:"+spar+
                "y de los inpares"+simpar);
    }
 
}
