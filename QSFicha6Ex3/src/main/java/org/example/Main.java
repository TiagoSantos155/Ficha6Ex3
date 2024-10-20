package org.example;


public class Main {

    public int area(int base, int altura) {
        return base * altura;
    }

    public int perimetro(int base, int altura) {
        return 2 * (base + altura);
    }

    public int isTriangle(int a, int b, int c) {
        // Verifica se a soma de dois lados é sempre maior que o terceiro
        if (a < b + c && b < a + c && c < a + b) {
            return 1; // Triângulo válido
        } else {
            return 0; // Não é um triângulo
        }
    }
}