
package Figuras;

/**
 *
 * @author crist
 */
public class circulo {
    private double val1, resul,resul2;
    
    public circulo(double radio){
        
        this.val1 = radio;
    }
    public void area(){
        
        resul = 3.141592*(val1*val1);
    }
    
    public void  perimetro(){
        resul2=2*3.141592*val1;
    }
    public void imprimir(){
        
        area();
        System.out.println("El area del circulo es: "+resul);
        perimetro();
        System.out.println("El perimetro del circulo es: "+resul2);
    }
}
