package br.com.gft.model;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
	
	private List<String> Magia;
	
	Random random = new Random();
			
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		Magia = magia;
	}

	public List<String> getMagia() {
		return Magia;
	}

	public void setMagia(List<String> magia) {
		Magia = magia;
	}
	
	@Override
	public void lvlUp() {
		setVida(getVida() + 5);
		setMana(getMana() + 10);
		setXp(getXp() + 5);
		setInteligencia(getInteligencia() + 10);
		setForca(getForca() + 5);
		setLevel(getLevel() + 1);
	}
	
	public double attack() {
		int numero = random.nextInt(300);
		return this.getInteligencia() * this.getLevel() + numero;
	}
	
	public void aprenderMagia(String apd) {
		
	}
	
	@Override
	public String toString() {
		return "\nMago: " 
				+ this.getNome() 
				+ "\n Level: "
				+ this.getLevel() 
				+ "\n Vida: "
				+ this.getVida() 
				+ "\n Mana: " 
				+ this.getMana() 
				+ "\n XP :"
				+ this.getXp() 
				+ "\n Inteligencia: "
				+ this.getInteligencia() 
				+ "\n Força: "
				+ this.getForca() 
				+ "\n---------------------------------------------";
		}
		
}
