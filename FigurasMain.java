
package Figuras;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class FigurasMain {
    
    public static void main(String args[]){
        
        Scanner leer = new Scanner(System.in);
        
        boolean salida = true;

        while (salida){
            System.out.println("\n           CALCULADORA GEOMETRICA\n");
            System.out.println("Escoja la figura a la cual desea calcular el area y perimetro");
            System.out.println("1. Triangulo Rectangulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectangulo");
            System.out.println("4. Rombo");
            System.out.println("5. Circulo");
            System.out.println("6. Paralelogramo");
            System.out.println("Ingrese una opcion");
            int opcion = leer.nextInt();
            
            switch(opcion){
            case 1:
                System.out.println("\n           TRIANGULO RECTANGULO\n");
                System.out.print("Digite la base: ");
                double base = leer.nextDouble();
                System.out.print("Digite la altura: ");
                double altura = leer.nextDouble();
                System.out.print("Digite el lado a: ");
                double ladoa = leer.nextDouble();
                System.out.print("Digite el lado b: ");
                double ladob = leer.nextDouble();
                System.out.print("Digite el lado c: ");
                double ladoc = leer.nextDouble();
                Triangulo_Rec tri = new Triangulo_Rec(base, altura, ladoa, ladob, ladoc);
                tri.imprimir();
                break;
            case 2:
                System.out.println("\n           CUADRADO\n");
                System.out.print("Digite el lado: ");
                double lado = leer.nextDouble();
                cuadrado cua = new cuadrado(lado);
                cua.imprimir();
                break;
            case 3:
                System.out.println("\n           RECTANGULO\n");
                System.out.print("Digite la base: ");
                double base2 = leer.nextDouble();
                System.out.print("Digite la altura: ");
                double altura2 = leer.nextDouble();
                rectangulo rec = new rectangulo(base2, altura2);
                rec.imprimir();
                break;
            case 4:
                System.out.println("\n           ROMBO\n");
                System.out.print("Digite la diagonal mayor: ");
                double diagM = leer.nextDouble();
                System.out.print("Digite la diagonal menor: ");
                double diagm = leer.nextDouble();
                System.out.print("Digite el lado: ");
                double lado2 = leer.nextDouble();
                rombo rom = new rombo(diagM, diagm,lado2);
                rom.imprimir();
                break;
            case 5:
                System.out.println("\n           CIRCULO\n");
                System.out.print("Digite el radio: ");
                double radio = leer.nextDouble();
                circulo cir = new circulo(radio);
                cir.imprimir();
                break;
            case 6:
                System.out.println("\n           PARALELOGRAMO\n");
                System.out.print("Digite la base: ");
                double base3 = leer.nextDouble();
                System.out.print("Digite la altura: ");
                double altura3 = leer.nextDouble();
                System.out.print("Digite el lado a: ");
                double lado3 = leer.nextDouble();
                System.out.print("Digite el lado b: ");
                double lado4 = leer.nextDouble();
                paralelogramo par = new paralelogramo(base3,altura3,lado3,lado4);
                par.imprimir();
                break;
            default:
                System.out.println("Fin");
                salida = false;
                break;
            }
        }      
    }
}
