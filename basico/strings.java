package basico;

import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
	
		
		String nome ;
		int idade;
		double altura;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leitor.nextLine();
		
		System.out.println("Qual a sua idade: ");
		idade= leitor.nextInt();
		
		System.out.println("Qual a sua altura: ");
		altura = leitor.nextDouble();
		
		
		
		System.out.println("Nome: "+nome);
		System.out.println("Altura: "+altura);
		System.out.println("Idade: "+idade);
		
		
		
		
		
		
	}

}
