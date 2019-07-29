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
		
		System.out.println("Digite o mês do seu nascimento: ");
		int mes = scan.nextInt();
		
		System.out.println("Sua data de nascimento é: " + dia +"/"+ mes);
		
		if (dia >= 21 && dia <=31 && mes == 3 || dia >= 1 && dia <=20 && mes == 4) {
			System.out.println("Seu signo é ÁRIES");
		}else if (dia >= 21 && dia <= 30 && mes == 4 || dia >= 1 && dia <= 20 && mes == 5) {
			System.out.println("Seu signo é TOURO");
		}else if (dia >= 21 && dia <= 31 && mes == 5 || dia >= 1 && dia <= 20 && mes == 6) {
			System.out.println("Seu signo é GÊMEOS");
		}else if (dia >= 21 && dia <= 30 && mes == 6 || dia >= 1 && dia <= 21 && mes == 7) {
			System.out.println("Seu sogno é CÂNCER");
		}else if (dia >= 22 && dia <= 31 && mes == 7 || dia >= 1 && dia <= 22 && mes == 8) {
			System.out.println("Seu signo é LEÃO");
		}else if (dia >= 23 && dia <= 31 && mes == 8 || dia >= 1 && dia <= 30 && mes == 9) {
			System.out.println("Seu signo é VIRGEM");
		}else if (dia >= 23 && dia <= 30 && mes == 9 || dia >= 1 && dia <= 22 && mes == 10) {
			System.out.println("Seu signo é LIBRA");
		}else if (dia >= 23 && dia <= 31 && mes == 10 || dia >= 1 && dia <= 21 && mes == 11) {
			System.out.println("Seu signo é ESCORPIÃO");
		}else if (dia >= 22 && dia <= 30 && mes == 11 || dia >= 1 && dia <= 21 && mes == 12) {
			System.out.println("Seu signo é SAGITÁRIO");
		}else if (dia >= 22 && dia <= 31 && mes == 12 || dia >= 1 && dia <= 20 && mes == 1) {
			System.out.println("Seu signo é CAPRICÓRNIO");
		}else if (dia >= 21 && dia <= 31 && mes == 1 || dia >= 1 && dia <= 19 && mes == 2) {
			System.out.println("Seu signo é AQUÁRIO");
		}else if (dia >= 20 && dia <= 29 && mes == 2 || dia >= 1 && dia <= 20 && mes == 3) {
			System.out.println("Seu signo é PEIXES");
		}
	}

}
