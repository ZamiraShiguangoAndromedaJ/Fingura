

package zamira.estudiante.figuras;


import zamira.estudiante.figuras.clases.Triangulo;
import zamira.estudiante.figuras.clases4.Cuadrado;

import zamira.estudiante.figuras.Clase1.Circulo;
import zamira.estudiante.figuras.Clase2.Rectangulo;



/**
 *
 * @author user
 */
public class Figuras {


    public static void main(String[] args) {
     
        
        System.out.println("hola con la clase cuadrado jiji");
        
        Cuadrado objCuadrado = new Cuadrado(9);
        //objCuadrado.imprimir(); *si lo queremos mostrar los valores al usuario
        
        
        //hola
        
        double area=objCuadrado.calcularAreaCuadrado();
        System.out.println("el area del Cuadrado es:"+area);
        
        double perimetro=objCuadrado.calcularPerimetroCuadrado();
        System.out.println("el perimetro Cuadrado es: "+perimetro);
        
        
        
        
        System.out.println("Hola con la clase Triangulo Rectangulo jjeje");
        
        Triangulo objTrianguloRectangulo = new Triangulo(5,8);
        
        double area1=objTrianguloRectangulo.calcularAreaTrianguloRectangulo();
        System.out.println("El area del Triangulo Rectangulo es: " + area1);
        
        //double hipotenunsa=objTrianguloRectangulo.
        
        double hipotenunsa=objTrianguloRectangulo.calcularHipotenunsaTrianguloRectangulo();
        System.out.println("La Hipotenunsa de un Triangulo Rectangulo es: " + hipotenunsa);
        
        
        double perimetro1=objTrianguloRectangulo.calcularPerimetroTrianguloRectangulo();
        System.out.println("El perimetro del Triangulo Rectangulo es: " + perimetro1);
        
        System.out.println("El tipo de Triángulo es: " + objTrianguloRectangulo.tipoTriangulo);
      
        
        Circulo objCirculo = new Circulo (3.4);
        
        double Area = objCirculo.calcularAreaCirculo();
        System.out.println("El area del Circulo es :" + Area);
        
        double Perimetro = objCirculo.calcularPerimetroCirculo();
        System.out.println("El perimetro del Circulo es :" + Perimetro);
        
        
        Rectangulo objRectangulo = new Rectangulo (5,2);
        double area2 = objRectangulo.calcularArea();
        System.out.println("El area del rectangulo es " + area2);
        
        double perimetro2 = objRectangulo.calcularPerimetro();
        System.out.println("El perimetro del Circulo es :" + perimetro2);
      
    

    }
}
