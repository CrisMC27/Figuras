
package Figuras;

/**
 *
 * @author crist
 */
public class rectangulo {
    
    private double val1, val2, resul,resul2;
    
    public rectangulo(double base2, double altura2){
        
        this.val1 = base2;
        this.val2 = altura2;
    }
    public void area(){
        
        resul = val1*val2;
    }
    
    public void  perimetro(){
        resul2=(2*val1)+(2*val2);
    }
    public void imprimir(){
        
        area();
        System.out.println("El area del rectangulo es: "+resul);
        perimetro();
        System.out.println("El perimetro del rectangulo es: "+resul2);
    }
}
