package br.com.teste.primeiro;

public class Processador {

	/**
	 * Numeros que serão utilizados
	 */
	private Numbers numbers;

	
	/**
	 * Construtor padrão
	 */
	public Processador() {
	
	}
	
	
	/***
	 * 
	 * @param numbers - Dois números para a composiçao do terceiro
	 */
	public Processador(Numbers numbers) {
		setNumbers(numbers);
	}
	
	
	/**
	 * Cria um terceiro número de acordo:
	 * 
	 * - O primeiro número de C é o primeiro número de A;
	 * - O segundo número de C é o primeiro número de B;
	 * - O terceiro número de C é o segundo número de A;
	 * - O quarto número de C é o segundo número de B;
	 *  
	 *  E assim por diante.	
	 * @return
	 */
	public String getThirdNumber() {
		
		String value = null;
	
		try {
			
			validate();
			value = process(String.valueOf(getNumbers().getFirtNumber()), 
							String.valueOf(getNumbers().getSecondNumber()));
		
		} catch (Exception e) {
			 value = "-1";
		
		}		
		
		return value;
		
	}
	
	
	/**
	 * Realiza o processamento dos números para criar o terceiro
	 * @param a
	 * @param b
	 * @return
	 */
	private String process (String a, String b) {		
		int length = getNumberMaxLength(a, b);
		return createNumber(a, b, length);			
	
	}
	
	
	/**
	 * Retorna a quantidade de caracteres do maior número
	 * @param a
	 * @param b
	 * @return
	 */
	private int getNumberMaxLength(String a, String b) {
		int length = a.length();
		length = a.length() > b.length() ? a.length() : b.length();
		return length;
	}
	
	
	/**
	 * Verifica se a componsição do terceiro número será maior que 1.000.000 
	 * @throws Exception
	 */
	private void validate () throws Exception {
		int max = getMaxNumber(getNumbers().getFirtNumber(), getNumbers().getSecondNumber());
		int min = getMinNumber(getNumbers().getFirtNumber(), getNumbers().getSecondNumber());
		
		if (max > 999) {			
			if (min > 99) {
				throw new Exception("Number is bigger than 1.000.000.");
			}
		}
	}
	
	/**
	 * Retorna o maior número entre os parametros.
	 * @param a
	 * @param b
	 * @return
	 */
	private int getMaxNumber (Integer a, Integer b) {
		int max = a;
		max = a.compareTo(b) < 0 ? b : a;
		return max;
	}
	
	
	/**
	 * Retorna o menor número entre os parametros.
	 * @param a
	 * @param b
	 * @return
	 */
	private int getMinNumber (Integer a, Integer b) {
		int min = a;
		min = a.compareTo(b) < 0 ? a : b;
		return min;
	}
	
	
	/**
	 * Cria um número de acordo com o primeiro algarismo de cada um dos parametros;
	 * @param a
	 * @param b
	 * @param lenght
	 * @return
	 */
	private String createNumber(String a, String b, int lenght){
		StringBuilder third = new StringBuilder();
		
		for (int i = 0; i < lenght; i++) {			
			
			if (i < a.length()) {
				third.append(a.charAt(i));
			}
			
			if (i < b.length()) {
				third.append(b.charAt(i));
			}
			
		}
		
		return third.toString();
	}

	private Numbers getNumbers() {
		return numbers;
	}

	public void setNumbers(Numbers numbers) {
		this.numbers = numbers;
	}

}
