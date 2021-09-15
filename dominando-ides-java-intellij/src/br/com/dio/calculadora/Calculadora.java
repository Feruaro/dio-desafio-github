package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int a = scan.nextInt();
        float a1 = (float)a;
        System.out.print("Informe o segundo número: ");
        int b = scan.nextInt();
        float b1 = (float)b;

        System.out.println("Soma: " + soma(a, b) +
                           "\nSubtração: " + sub(a, b) +
                           "\nMultiplicação: " + mult(a, b) +
                           "\nDivisão: " + div(a1, b1) +
                           "\nResto: " + resto(a, b));

    }

    public static int soma(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mult(int a, int b){
        return a * b;
    }
    public static float div(float a, float b){
        return a / b;
    }
    public static int resto(int a, int b){
        return a % b;
    }
}
