package Guia2;

/**
 *
 * @author ivanfajardo
 */
public class SumaPrimeros50Numeros {
    
    public static void main(String[] args) {
        int contador=0 ,suma=0;
        
        for(int i=1; i<=50; i++){
            suma=suma+i;
        }
        System.out.println("La suma es:" +suma);
    }
    
}
