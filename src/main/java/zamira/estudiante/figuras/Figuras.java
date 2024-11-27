

package zamira.estudiante.figuras;

import zamira.estudiante.figuras.Clase1.Circulo;
import zamira.estudiante.figuras.Clase2.Rectangulo;


/**
 *
 * @author user
 */
public class Figuras {

 
     public static void main(String[] args) {
        
        Circulo objCirculo = new Circulo (3.4);
        
        double Area = objCirculo.calcularAreaCirculo();
        System.out.println("El area del Circulo es :" + Area);
        
        double Perimetro = objCirculo.calcularPerimetroCirculo();
        System.out.println("El perimetro del Circulo es :" + Perimetro);
        
        
        Rectangulo objRectangulo = new Rectangulo (5,2);
        double area = objRectangulo.calcularArea();
        System.out.println("El area del rectangulo es " + area);
        
        double perimetro = objRectangulo.calcularPerimetro();
        System.out.println("El perimetro del Circulo es :" + perimetro);
      
    
    }
}
