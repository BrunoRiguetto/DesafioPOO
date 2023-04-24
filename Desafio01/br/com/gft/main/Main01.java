package br.com.gft.main;

import br.com.gft.model.Veiculo;

public class Main01 {

	public static void main(String[] args) {
		
		String marca = "Ford";
		String modelo = "Fusion";
		String placa = "FDK-6754";
		String cor = "vermelho";
		float km = 0;
		boolean isLigado = true;
		int litrosCombustivel = 40;
		int velocidade = 0;
		Double preco = 110000.00;
		
		Veiculo veiculo1 = new Veiculo(marca,modelo,placa,cor,km,isLigado,litrosCombustivel,velocidade,preco);
		
		veiculo1.acelerar();
		veiculo1.frear();
		veiculo1.frear();
		veiculo1.abastecer(30);
		veiculo1.pintar(cor);
		veiculo1.ligar();
		veiculo1.acelerar();
		veiculo1.desligar();
		veiculo1.frear();
		veiculo1.desligar();
	}

}
