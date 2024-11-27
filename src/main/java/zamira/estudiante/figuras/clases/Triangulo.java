package zamira.estudiante.figuras.clases;

import zamira.estudiante.figuras.enumeraciones.TipoTriangulo;

public class Triangulo {
    
     public double baseCentimetro;
    public double alturaCentimetro;
    public TipoTriangulo tipoTriangulo;

    public Triangulo(double baseCentimetro, double alturaCentimetro) {
        this.baseCentimetro = baseCentimetro;
        this.alturaCentimetro = alturaCentimetro;
        this.tipoTriangulo = tipoTriangulo();
    }

   /* public void imprimir() {
        System.out.println(" baseCentimetro: " + baseCentimetro);
        System.out.println("alturaCentimetro: " + alturaCentimetro);

    }*/

    public double calcularAreaTrianguloRectangulo() {

        return (baseCentimetro * alturaCentimetro) / 2;

    }

    public double calcularHipotenunsaTrianguloRectangulo() {
        
           

        return Math.sqrt(Math.pow(baseCentimetro, 2) + Math.pow(alturaCentimetro, 2));

    }

    public double  calcularPerimetroTrianguloRectangulo() {

        return baseCentimetro + alturaCentimetro + calcularHipotenunsaTrianguloRectangulo();

    }
    
    public TipoTriangulo tipoTriangulo() {
        double hipotenusa = calcularHipotenunsaTrianguloRectangulo();
        double lado1 = baseCentimetro;
        double lado2 = alturaCentimetro;

        if (lado1 == lado2 && lado2 == hipotenusa) {
            return TipoTriangulo.EQUILATERO;  
        } else if (lado1 == lado2 || lado2 == hipotenusa || lado1 == hipotenusa) {
            return TipoTriangulo.ISOCELES;  
        } else {
            return TipoTriangulo.ESCALENO;  
    }
       

}
    
}
