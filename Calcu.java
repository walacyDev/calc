package calcu;

import java.util.Scanner;

public class Calcu {

	public static void main(String[] args) {
		int n1, n2;
		float res;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		n1 = scanner.nextInt();

		System.out.println("Digite o segundo número:");
		n2 = scanner.nextInt();

		System.out.println("Digite qual operação matemática deseja fazer (+, -, x, /):");
		String operacao = scanner.next();

		switch (operacao) {
		case "+":
			res = n1 + n2;
			break;
		case "-":
			res = n1 - n2;
			break;
		case "x":
			res = n1 * n2;
			break;
		case "/":
			res = n1 / n2;
			break;
		default:
			System.out.println("Erro. Não corresponde a nenhuma das opções!");
			return;
		}

		System.out.printf("Resultado:%.2f%n", res);
		
		System.out.println("Fim do Programa!");
		
	}
}