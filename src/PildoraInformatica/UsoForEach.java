package PildoraInformatica;


/*
 *
 * @author ivanfajardo
 */
public class UsoForEach {
    
    public static void main(String[] args) {
        int [] numeros= new int[50];
        
        for(int i=0; i<numeros.length; i++){
            numeros[i]=(int)(Math.random()*100);
        }
        
        for(int elemento:numeros)System.out.print(elemento+ " ");
    
    } 
}
