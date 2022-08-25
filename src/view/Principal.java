package view;

import java.util.Scanner;

import controller.numeroController;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero1 = scan.nextInt();
		if (numero1 < 10 || numero1 > 999999) {
			while (numero1 < 10 || numero1 > 999999) {
				System.out.println("Insira um numero entre 10 e 999999");
				numero1 = scan.nextInt();
			}
		}
		int numero2 = scan.nextInt();
		if (numero2 <= 0 || numero2 >= 9) {
			while (numero2 <= 0 || numero2 >= 9) {
				System.out.println("Insira um numero entre 0 e 10");
				numero2 = scan.nextInt();
			}
		}
		scan.close();
		
		numeroController numero = new numeroController();
		int resultado = numero.compara(numero1, numero2);
		System.out.println(resultado);
	}

}
