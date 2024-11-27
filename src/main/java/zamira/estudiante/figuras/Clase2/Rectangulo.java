
package zamira.estudiante.figuras.Clase2;

/**
 *
 * @author anthony
 */
public class Rectangulo {
    
    public double base;   
    public double altura; 
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura; 
    }

   
    public double calcularPerimetro() {
        return 2 * (base + altura); 
    }
    
}
