package Arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanfajardo
 */
public class NumeroMayoryMenor {
    public static void main(String[] args) {
        int numero[];
        int mayor=0,menor=Integer.MAX_VALUE,cantidad;
        
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cuantos nros Desea Evaluar"));
        numero=new int[cantidad];
        
        for(int i=0; i<numero.length; i++){
            numero[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero positivo"));
            
            if(numero[i]>mayor){
                mayor=numero[i];
              } if(numero[i]<menor){
                  menor=numero[i];
              }
                            
        }
        
        JOptionPane.showMessageDialog(null,"El Numero Mayor es: "+mayor+" Y el Menor es: " +menor+"");
        
        
    }
 
}
