package dio.debug;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int a = scan.nextInt();
		System.out.println("Informe o segundo número: ");
		int b = scan.nextInt();
		int op;
		
		do{
			System.out.println("1-Soma \n2-Subtração \n3-Multiplicação \n4-Divisão " +
				               "\nInforme o número refente a operação desejada: ");
			op = scan.nextInt();
		}while(op < 1 || op > 4);
		
		switch(op) {
			case 1:
				System.out.println("Resultado da operação: " + soma(a, b));
				break;
			case 2:
				System.out.println("Resultado da operação: " + sub(a, b));
				break;
			case 3:
				System.out.println("Resultado da operação: " + mult(a, b));
				break;
			case 4:
				float a1 = a;
				float b1 = b;
				System.out.println("Resultado da operação: " + div(a1, b1));
				break;
			default:
				System.out.println("Operação inválida!");
				break;
		}
		
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int mult(int a, int b) {
		return a * b;
	}
	
	public static float div(float a, float b) {
		return a / b;
	}
	
}
