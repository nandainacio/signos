package zodiaco;

import java.util.Scanner;

public class signos {

	

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("####### Descobrindo seu signo #######");
		System.out.println(" ");
		
		System.out.println("Digite o dia do seu nascimento: ");
		int dia = scan.nextInt();
		
		System.out.println("Digite o m�s do seu nascimento: ");
		int mes = scan.nextInt();
		
		System.out.println("Sua data de nascimento �: " + dia +"/"+ mes);
		
		if (dia >= 21 && dia <=31 && mes == 3 || dia >= 1 && dia <=20 && mes == 4) {
			System.out.println("Seu signo � �RIES");
		}else if (dia >= 21 && dia <= 30 && mes == 4 || dia >= 1 && dia <= 20 && mes == 5) {
			System.out.println("Seu signo � TOURO");
		}else if (dia >= 21 && dia <= 31 && mes == 5 || dia >= 1 && dia <= 20 && mes == 6) {
			System.out.println("Seu signo � G�MEOS");
		}else if (dia >= 21 && dia <= 30 && mes == 6 || dia >= 1 && dia <= 21 && mes == 7) {
			System.out.println("Seu sogno � C�NCER");
		}else if (dia >= 22 && dia <= 31 && mes == 7 || dia >= 1 && dia <= 22 && mes == 8) {
			System.out.println("Seu signo � LE�O");
		}else if (dia >= 23 && dia <= 31 && mes == 8 || dia >= 1 && dia <= 30 && mes == 9) {
			System.out.println("Seu signo � VIRGEM");
		}else if (dia >= 23 && dia <= 30 && mes == 9 || dia >= 1 && dia <= 22 && mes == 10) {
			System.out.println("Seu signo � LIBRA");
		}else if (dia >= 23 && dia <= 31 && mes == 10 || dia >= 1 && dia <= 21 && mes == 11) {
			System.out.println("Seu signo � ESCORPI�O");
		}else if (dia >= 22 && dia <= 30 && mes == 11 || dia >= 1 && dia <= 21 && mes == 12) {
			System.out.println("Seu signo � SAGIT�RIO");
		}else if (dia >= 22 && dia <= 31 && mes == 12 || dia >= 1 && dia <= 20 && mes == 1) {
			System.out.println("Seu signo � CAPRIC�RNIO");
		}else if (dia >= 21 && dia <= 31 && mes == 1 || dia >= 1 && dia <= 19 && mes == 2) {
			System.out.println("Seu signo � AQU�RIO");
		}else if (dia >= 20 && dia <= 29 && mes == 2 || dia >= 1 && dia <= 20 && mes == 3) {
			System.out.println("Seu signo � PEIXES");
		}
	}

}
