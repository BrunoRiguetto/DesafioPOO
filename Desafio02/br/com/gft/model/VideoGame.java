package br.com.gft.model;

public class VideoGame extends Produto{
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public VideoGame() {
	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	public void calculaImposto() {
		if(this.isUsado == true) {
			double valorImposto = this.getPreco() * 0.25;
			System.out.println("Imposto " + this.getNome() + " " + this.getModelo() +" usado, R$ " + valorImposto + ".");
		}else {
			double valorImposto = this.getPreco() * 0.45;
			System.out.println("Imposto " + this.getNome() + " " + this.getModelo() + " R$ " + valorImposto + ".");
		}
		
	}
	
	@Override
	public String toString() {
		return "Video-game: " 
			+ this.getNome()
			+ " "
			+ this.getModelo()
			+ " , preço: "
			+ this.getPreco()
			+ " , quantidade: "
			+ this.getQtd()
			+ " em estoque.\n";
	}
	
	
}

