package com.mycompany.triangulo;

import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Triangulo {

     double lado1;
     double lado2;
     double lado3;
    
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String tipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o cumprimento do lado 1 do triangulo: ");
        double lado1 = ler.nextDouble();

        System.out.println("Informe o cumprimento do lado 2 do triangulo: ");
        double lado2 = ler.nextDouble();

        System.out.println("Informe o cumprimento do lado 3 do triangulo: ");
        double lado3 = ler.nextDouble();
//JOptionPane.showInputDialog(ler, lado3)
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        String tipo = triangulo.tipoTriangulo();
        System.out.println("Esse é um triangulo: " + tipo );
    }
}
