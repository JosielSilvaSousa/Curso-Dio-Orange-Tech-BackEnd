package Metodos.Retornos;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercicio quadrilatero");

        double areaQuareada = Quadrilatero.areaQuadrada(3);
        System.out.println("Area quadrada: " + areaQuareada);
       
        double areaRetangulo = Quadrilatero.areaRetangulo(3,3);
        System.out.println("Area quadrada: " + areaRetangulo);
        
        double areaTrapezio = Quadrilatero.areaTrapezio(7,3,9);
        System.out.println("Area quadrada: " + areaTrapezio);
        
        double areaLozango = Quadrilatero.areaLosango(7f,8f);
        System.out.println("Area quadrada: " + areaLozango);
      }
      
    
}
