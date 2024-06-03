
package Figuras;

/**
 *
 * @author crist
 */
public class Triangulo_Rec {
    
    private double val1, val2, val3, val4, val5, resul, resul2;
    
    public Triangulo_Rec(double base, double altura, double ladoa, double ladob, double ladoc){
        
        this.val1 = base;
        this.val2 = altura;
        this.val3 = ladoa;
        this.val4 = ladob;
        this.val5 = ladoc;
    }
    public void area(){
        
        resul = (val1 * val2)/2;
    }
    
    public void  perimetro(){
        
        resul2= val3+val4+val5;
    }
    public void imprimir(){
        
        area();
        System.out.println("El area del triangulo es: "+resul);
        perimetro();
        System.out.println("El perimetro del triangulo es: "+resul2);
    }
}