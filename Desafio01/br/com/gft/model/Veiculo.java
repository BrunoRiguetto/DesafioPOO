package br.com.gft.model;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private Double preco;
	
	public Veiculo() {
	}

	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, Double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
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
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void acelerar() {
		 this.velocidade += 20;
		 System.out.println("O carro acelerou mais 20km/h. A velocidade atual e de: " + this.velocidade + " km/h.");
	}
	
	public void abastecer(int combustivel) {
		if(combustivel > 60 - this.litrosCombustivel) {
			int quantidadeAbastecida = (60 - this.litrosCombustivel);
			System.out.println("Nao foi possivel abastecer a quantidade total solicitada, a capacidade do tanque e de 60 litros. Foi possivel abastecer apenas " + quantidadeAbastecida + " litros.");
		}else {
			this.litrosCombustivel += combustivel;
			System.out.println("Abastecimento concluido, o tanque de combustivel tem: " + this.litrosCombustivel + " litros de combustivel.");
		}
	}
	
	public void frear() {
		if (velocidade > 0) {
			this.velocidade -= 20;
			System.out.println("Freio acionado, a velocidade atual do veiculo e de: " + this.velocidade + " km/h.");
		}else {
			System.out.println("Nao foi possivel frear, pois o veiculo ja esta parado.");
		}
	}
	
	public void pintar(String cor) {
		this.cor = cor;
		System.out.println("A cor do veiculo foi alterada para: " + this.cor + ".");
	}
	
	public void ligar() {
		if (isLigado == true) {
			System.out.println("O veiculo ja esta ligado!");
		}else {
			this.isLigado = true;
			System.out.println("Veiculo ligado.");
		}
	}
	
	public void desligar() {
		if(isLigado == true && velocidade == 0) {
			this.isLigado = false;
			System.out.println("O Veiculo foi desligado!");
		}else if(isLigado == true && velocidade > 0) {
			System.out.println("Veiculo em movimento, nao e possivel desliga-lo. Pare o veiculo primeiro.");
		}else if(isLigado == false) {
			System.out.println("Veiculo ja esta desligado.");
		}
	}
	
}
