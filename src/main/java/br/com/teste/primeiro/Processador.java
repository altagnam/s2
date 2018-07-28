package br.com.teste.primeiro;

public class Processador {

	/**
	 * Numeros que ser�o utilizados
	 */
	private Numbers numbers;

	
	/**
	 * Construtor padr�o
	 */
	public Processador() {
	
	}
	
	
	/***
	 * 
	 * @param numbers - Dois n�meros para a composi�ao do terceiro
	 */
	public Processador(Numbers numbers) {
		setNumbers(numbers);
	}
	
	
	/**
	 * Cria um terceiro n�mero de acordo:
	 * 
	 * - O primeiro n�mero de C � o primeiro n�mero de A;
	 * - O segundo n�mero de C � o primeiro n�mero de B;
	 * - O terceiro n�mero de C � o segundo n�mero de A;
	 * - O quarto n�mero de C � o segundo n�mero de B;
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
	 * Realiza o processamento dos n�meros para criar o terceiro
	 * @param a
	 * @param b
	 * @return
	 */
	private String process (String a, String b) {		
		int length = getNumberMaxLength(a, b);
		return createNumber(a, b, length);			
	
	}
	
	
	/**
	 * Retorna a quantidade de caracteres do maior n�mero
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
	 * Verifica se a componsi��o do terceiro n�mero ser� maior que 1.000.000 
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
	 * Retorna o maior n�mero entre os parametros.
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
	 * Retorna o menor n�mero entre os parametros.
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
	 * Cria um n�mero de acordo com o primeiro algarismo de cada um dos parametros;
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
