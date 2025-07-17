package PildoraInformatica;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanfajardo
 */
public class UsoDoWhile {
    
    public static void main(String[] args) {
        
        String sexo="";
        int estatura;
        int pesoIdeal=0;
        
        do{
            
            sexo=JOptionPane.showInputDialog("Ingrese su Sexo M = Masculino / F = Femenino");
            
        }while(sexo.equalsIgnoreCase("M")==false && sexo.equalsIgnoreCase("F")==false);
       
        estatura= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Estatura"));
        
        
        if(sexo.equalsIgnoreCase("M")) pesoIdeal= estatura - 110;
        else if(sexo.equalsIgnoreCase("F")) pesoIdeal= estatura - 120;
        
        JOptionPane.showMessageDialog(null,"Su Peso Ideal es:" +pesoIdeal);
    }
    
}
