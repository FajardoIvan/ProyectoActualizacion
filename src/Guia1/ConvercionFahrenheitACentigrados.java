package Guia1;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanfajardo
 */
public class ConvercionFahrenheitACentigrados {
    
    
    public static void main(String[] args) {
    double grado,faren;
    
    try{        
        String input=(JOptionPane.showInputDialog("Ingrese Los Grados Fahrenheit"));
        faren=Double.parseDouble(input);
               
            if(input==null ||input.isEmpty()){
                JOptionPane.showMessageDialog(null,"Se cancelo");
                return;
                }
        
            grado= (faren-32)*5.0/9.0;
            JOptionPane.showMessageDialog(null,"los grados son:" + grado);
        }
    catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error Por favor ingrese un numero valido","Error de entrada",JOptionPane.ERROR_MESSAGE);
            System.out.println("se produjo un error de formato"+e.getMessage());
      
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,null,"Super Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    finally{
        
    }
    }
    
}
