package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Guerreiro;
import br.com.gft.model.Mago;
import br.com.gft.model.Personagem;

public class Main03 {

	public static void main(String[] args) {
			
		Mago m1 = new Mago("Gandalf o Branco", 1000, 80, 50f, 60, 80, 10, null);
		Mago m2 = new Mago("Radagast o Castanho", 1000, 60, 30f, 70, 50, 6, null);
		Mago m3 = new Mago("Saruman o Branco", 1000, 80, 50f, 90, 80, 9, null);
		
		Guerreiro g1 = new Guerreiro("Aragorn", 1000, 40, 30f, 50, 40, 6, null);
		Guerreiro g2 = new Guerreiro("Legolas", 1000, 50, 50f, 60, 50, 5, null);
		Guerreiro g3 = new Guerreiro("Gimli", 1000, 40, 20f, 40, 30, 4, null);

		
		List<Mago> magos = new ArrayList<>();
		magos.add(m1);
		magos.add(m2);
		magos.add(m3);
		
		List<Guerreiro> guerreiros = new ArrayList<>();
		guerreiros.add(g1);
		guerreiros.add(g2);
		guerreiros.add(g3);
		
		m1.lvlUp();
		g1.lvlUp();
		
		System.out.println(m1);
		System.out.println(g1);
		
		System.out.println("Total de personagens criados: " + Personagem.ProximoPersonagem());

	}
}
