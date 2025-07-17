package PildoraInformatica;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanfajardo
 */
public class UsoWhile1 {
    
    public static void main(String[] args) {
        String clave= "";//Declaro Variable String con la contraseña: Lunes
        String pass="";// aqui se guardara la contraseña que ingrese el ususario
        
        clave=JOptionPane.showInputDialog("Ingrese una Clave");
        
        while(clave.equals(pass)==false){ //siclo while donde comparamos si lo que ingreso el ususario 
                                         //es igual a lo que tenemos guardado. Es Falso xq no es lo mismo
                                        //La logica es: Mientras la comparacion de clave y pass sea false repite
                                        
            pass=JOptionPane.showInputDialog("Repita La Clave");
            
            if(clave.equals(pass)==false){ //Aqui vuelvo a comparar solo para mostrar el mensaje
                                          //Contraseña incorrecta Siempre y cuando sea false es resultado
                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta");
            }
            
        }
        
        JOptionPane.showMessageDialog(null,"Contraseña Correcta");
    }
    
}
