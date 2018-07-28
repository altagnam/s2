package br.com.teste.primeiro;

//Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes regras:

//- O primeiro número de C é o primeiro número de A;
//- O segundo número de C é o primeiro número de B;
//- O terceiro número de C é o segundo número de A;
//- O quarto número de C é o segundo número de B;

//Assim sucessivamente…

//- Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante
//dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.

//- Caso C seja maior que 1.000.000, retornar -1

public class Main {

	public static void main(String[] args) {		
		
		Processador processador = new Processador();
		processador.setNumbers(new Numbers(10256, 512));
		System.out.println(processador.getThirdNumber());
		
		processador.setNumbers(new Numbers(123, 456));
		System.out.println(processador.getThirdNumber());
		
		processador.setNumbers(new Numbers(9999, 999));
		System.out.println(processador.getThirdNumber());
		
		processador.setNumbers(new Numbers(9999, 88));
		System.out.println(processador.getThirdNumber());
		
		processador.setNumbers(new Numbers(12345, 7));
		System.out.println(processador.getThirdNumber());
		
		processador.setNumbers(new Numbers(1234, 67));
		System.out.println(processador.getThirdNumber());		
		
		processador.setNumbers(new Numbers(10, 9874));
		System.out.println(processador.getThirdNumber());		
		
		processador.setNumbers(new Numbers(100, 222));
		System.out.println(processador.getThirdNumber());
		
		processador.setNumbers(new Numbers(999, 999));
		System.out.println(processador.getThirdNumber());
	
	}

}
