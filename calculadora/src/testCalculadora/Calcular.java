package testCalculadora;

import java.util.Scanner;

public class Calcular {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int n1;
		int n2;
		
		String  operacao = "";
		int control=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a opera��o desejada (+, -, *, /): ");
		operacao = entrada.nextLine();
		
		System.out.println("Digite o primeiro valor: ");
		n1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite digite o segundo valor: ");
		n2 = Integer.parseInt(entrada.next());
		
		if(operacao.equals("+")) {
			System.out.println("O resultado da soma �: " +(n1 + n2));
			control++;			
		}
		
		if(operacao.equals("-")) {
			System.out.println("O resultado da subtra��o �: " +(n1 - n2));
			control++;		
		}
		
		if(operacao.equals("*")) {
			System.out.println("O resultado da multiplica��o �: " +(n1 * n2));
			control++;			
		}
		
		if(operacao.equals("/")) {
			System.out.println("O resultado da divis�o �: " +(n1 / n2));
			control++;			
		}
		
		if(control == 0) {
			System.out.println("Oopra��o inv�lida, Tente novamente!");
						
		}
		
	}
}
