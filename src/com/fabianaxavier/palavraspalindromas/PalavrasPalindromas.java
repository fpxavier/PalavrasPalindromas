package com.fabianaxavier.palavraspalindromas;

import java.util.Scanner;

public class PalavrasPalindromas {

	private static Scanner teclado;

	public static void main(String[] args) {
		// entrada será utilizado para receber o que for digitado no teclado		
		teclado = new Scanner(System.in);
		String palavra =" ";
		String palavraResultado = "";
		
		System.out.println("Digite uma palavra:");
		
		palavra = teclado.next();
		
		
		//Laço vai percorrer a palavra digitada
		for( int i=palavra.length()-1; i>=0; i--) {
			//Resultado da palavra inverida de trás para frente
			palavraResultado+= palavra.charAt(i);
			
		}
		
			System.out.println("A palavra invertida é: " +palavraResultado);
		
		//verifica se palavra resultado é igual palavra invertida
		if(palavraResultado.equals(palavra)) {
			System.out.println("A palavra " +palavra+ " é um palindromo");
		} else {
			System.out.println("A palavra " +palavra+ " não é um palindromo");
		}
	}

}


