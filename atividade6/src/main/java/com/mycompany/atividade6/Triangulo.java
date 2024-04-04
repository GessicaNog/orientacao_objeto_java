package com.mycompany.atividade6;

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

    public double area() {
        double semiPerimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
        return area;
    }

    public double perimetro() {
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
}
