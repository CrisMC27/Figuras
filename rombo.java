
package Figuras;

/**
 *
 * @author crist
 */
public class rombo {
    
    private double val1, val2, val3, resul,resul2;
    
    public rombo(double diagM, double diagm, double lado2){
        
        this.val1 = diagM;
        this.val2 = diagm;
        this.val3 = lado2;
    }
    public void area(){
        
        resul = (val1*val2)/2;
    }
    
    public void  perimetro(){
        resul2=val3*4;
    }
    public void imprimir(){
        
        area();
        System.out.println("El area del rombo es: "+resul);
        perimetro();
        System.out.println("El perimetro del rombo es: "+resul2);
    }
}