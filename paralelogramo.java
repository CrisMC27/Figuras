
package Figuras;

/**
 *
 * @author crist
 */
public class paralelogramo {
    private double val1, val2, val3, val4, resul,resul2;
    
    public paralelogramo(double base3, double altura3, double lado, double lado2){
        
        this.val1 = base3;
        this.val2 = altura3;
        this.val3 = lado;
        this.val4 = lado2;
    }
    public void area(){
        
        resul = val1*val2;
    }
    
    public void  perimetro(){
        resul2=2*(val3+val4);
    }
    public void imprimir(){
        
        area();
        System.out.println("El area del paralelogramo es: "+resul);
        perimetro();
        System.out.println("El perimetro del paralelogramo es: "+resul2);
    }
}
