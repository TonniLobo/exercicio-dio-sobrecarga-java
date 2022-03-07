package br.com.dio;

public class Main {
    public static void main(String[] args){
        System.out.println("Exercício Retornos");

        double areaQuadrado= Quadrilatero.area(3);
        double areaRetangulo= Quadrilatero.area(5,5);
        double areaTrapezio= Quadrilatero.area(7,8,9);
        System.out.println("Área do Quadrado: "+areaQuadrado);
        System.out.println("Área do Retângulo: "+areaRetangulo);
        System.out.println("Área do Trapézio: "+areaTrapezio);
    }
}
