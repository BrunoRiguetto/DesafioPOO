package br.com.gft.model;

public class Livro extends Produto{
	private String autor;
	private String tema;
	private int qtdPag;
	
	public Livro() {
	}

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	public void calculaImposto() {
		if(this.tema.equalsIgnoreCase("educativo")) {
			System.out.println("Livro educativo não tem imposto: " + this.getNome() + ".");
		}else {
			double valorImposto = this.getPreco() * 0.1;
			System.out.println("R$ " + valorImposto + " de impostos sobre o livro " + this.getNome() + ".");
		}		
	}

	@Override
	public String toString() {
		return "Titulo: " 
			+ this.getNome()
			+ " , preço: "
			+ this.getPreco()
			+ " , quantidade: "
			+ this.getQtd()
			+ " em estoque.\n";
	}
	
	
	
}
