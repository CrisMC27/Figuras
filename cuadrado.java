
package Figuras;

/**
 *
 * @author crist
 */
public class cuadrado {
    private double val1, resul,resul2;
    
    public cuadrado(double lado){
        
        this.val1 = lado;
    }
    public void area(){
        
        resul = val1*val1;
    }
    
    public void  perimetro(){
        resul2=4*val1;
    }
    public void imprimir(){
        
        area();
        System.out.println("El area del cuadrado es: "+resul);
        perimetro();
        System.out.println("El perimetro del cuadrado es: "+resul2);
    }
}