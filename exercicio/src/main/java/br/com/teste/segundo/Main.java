package br.com.teste.segundo;

//public class BinaryTree {
//	int valor;
//	BinaryTree left;
//	BinaryTree right;
//}

//Desenvolva um método que dado um nó da árvore calcule a soma de todos os nós/subsequentes.
public class Main {

	public static void main(String[] args) {
	
		BinaryTree raiz = new BinaryTree(10);		
		raiz.add(raiz, new BinaryTree(5));
		raiz.add(raiz, new BinaryTree(9));
		raiz.add(raiz, new BinaryTree(16));
		raiz.add(raiz, new BinaryTree(13));
		raiz.add(raiz, new BinaryTree(14));
		raiz.add(raiz, new BinaryTree(12));
		raiz.add(raiz, new BinaryTree(8));
		raiz.add(raiz, new BinaryTree(7));
		raiz.add(raiz, new BinaryTree(6));
		
		System.out.println(raiz.sum(raiz));
		
	}

}
