
package com.mycompany.atividade6;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);

        System.out.println("Informe o cumprimento do lado 1 do triangulo: ");
        double lado1 = ler.nextDouble();

        System.out.println("Informe o cumprimento do lado 2 do triangulo: ");
        double lado2 = ler.nextDouble();

        System.out.println("Informe o cumprimento do lado 3 do triangulo: ");
        double lado3 = ler.nextDouble();
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        String tipo = triangulo.tipoTriangulo();
        System.out.println("Esse é um triangulo: " + tipo );
        
        System.out.println("A área é: " + triangulo.area());
        System.out.println("O perímetro é: " + triangulo.perimetro());
    }
}
