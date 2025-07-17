package PildoraInformatica;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanfajardo
 */
public class UsoDelFor {

    public static void main(String[] args) {
        String correo;
        int arroba=0;
        boolean punto=false;
        
        correo= JOptionPane.showInputDialog("Ingrese un Correo");
        
             for(int i=0;i<correo.length(); i++){
                 
             if(correo.charAt(i)=='@') arroba++;
             
             if(correo.charAt(i)=='.') punto=true;
             
         }
             if(arroba==1 && punto==true) JOptionPane.showMessageDialog(null,"Correo Correcto");
             else JOptionPane.showMessageDialog(null,"Correo Incorrecto");
        
    }

}
