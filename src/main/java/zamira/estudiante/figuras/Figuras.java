/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zamira.estudiante.figuras;

import zamira.estudiante.figuras.clases.Triangulo;
import zamira.estudiante.figuras.clases4.Cuadrado;

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
        
    }
}
