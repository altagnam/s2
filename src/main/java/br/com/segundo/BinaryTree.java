package br.com.segundo;

public class BinaryTree {

	private int valor = 0;
	private BinaryTree left;
	private BinaryTree right;
	
	
	public BinaryTree(int value) {
		this.valor = value;
		
	}
	
	
	/**
	 * Adiciona uma nodo a arvore
	 * 
	 * @param raiz
	 * @param tree
	 */
	public void add(BinaryTree raiz, BinaryTree tree) {	
		
		
		if (tree.getValor() > raiz.getValor()) {
			if (raiz.getRight() == null) {
				raiz.setRight(tree);
			
			}else {
				add(raiz.getRight(), tree);
				
			}
		
		}else {
			if (raiz.getLeft() == null) {
				raiz.setLeft(tree);
			
			}else {
				add(raiz.getLeft(), tree);
			}
		}
	}
	
	
	/**
	 * Soma todos os nodos
	 * @param tree
	 * @return
	 */
	public int sum (BinaryTree tree) {
		
		if (tree == null) {
			return 0;
		}
		
		int totalLeft = sum(tree.getLeft()); 
		int totalRigth = sum(tree.getRight());
		return tree.getValor() + totalLeft + totalRigth;
	}
	
	
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public BinaryTree getLeft() {
		return left;
	}
	
	public void setLeft(BinaryTree left) {
		this.left = left;
	}
	
	public BinaryTree getRight() {
		return right;
	}
	
	public void setRight(BinaryTree right) {
		this.right = right;
	}
	

	@Override
	public String toString() {
		return String.valueOf(valor);
	}
			
}
