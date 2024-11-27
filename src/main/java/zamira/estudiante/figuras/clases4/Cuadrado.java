/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamira.estudiante.figuras.clases4;

/**
 *
 * @author user
 */
public class Cuadrado {
    
     public double longitudLadoCentimetro;
    
    public Cuadrado(){
        
    }

    public Cuadrado(double logitudLadoCentimetro) {
        this.longitudLadoCentimetro = logitudLadoCentimetro;

    }

    public double calcularAreaCuadrado() {
        
        return longitudLadoCentimetro*longitudLadoCentimetro;

    }
    
    public double calcularPerimetroCuadrado(){
        
        return longitudLadoCentimetro*4;
    }
}
