package br.com.gft.model;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{
	
	private List<String> habilidade;
	
	Random random = new Random();
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level,
			List<String> habilidade) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.habilidade = habilidade;
	}

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}
	
	@Override
	public void lvlUp() {
		setVida(getVida() + 10);
		setMana(getMana() + 5);
		setXp(getXp() + 5);
		setInteligencia(getInteligencia() + 5);
		setForca(getForca() + 10);
		setLevel(getLevel() + 1);
	}

	public double attack() {
		int numero = random.nextInt(300);
		return this.getForca() * this.getLevel() + numero;
	}
	
	public void aprenderHabilidade(String apd) {
		
	}
	
	@Override
	public String toString() {
		return "\nGuerreiro: " 
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
