package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Pessoa;

public class Main04 {

	public static void main(String[] args) {

		 Pessoa p1 = new Pessoa("João", 15);
		 Pessoa p2 = new Pessoa("Leandro", 21);
		 Pessoa p3 = new Pessoa("Paulo", 17);
		 Pessoa p4 = new Pessoa("Jessica", 18);
		 
		
		 List<Pessoa> pessoas = new ArrayList<>();
		 pessoas.add(p1);
		 pessoas.add(p2);
		 pessoas.add(p3);
		 pessoas.add(p4);		 
		
		 int maisVelha = 0;
		 String nomeMaisVelha = null;
		 
		 for(Pessoa pessoa : pessoas) {
			 if(pessoa.getIdade() > maisVelha) {
				 maisVelha = pessoa.getIdade();
				 nomeMaisVelha = pessoa.getNome();
			 }
		 }
		 System.out.println("Desafia 04: ");
		 System.out.println();
		 System.out.println("A pessoa mais velha é o(a): " + nomeMaisVelha);
		 
		 System.out.println("----------------------------------------------");
		 
		 System.out.println("Desafio 05: ");
		 System.out.println();
		 System.out.println("Lista atual:");
		 pessoas.forEach(System.out::print);
		 
		 pessoas.removeIf(pessoa -> pessoa.getIdade() < 18);
		 
		 System.out.println("----------------------------------------------");		 
		 System.out.println("Pessoas maiores de 18 anos: ");
		 pessoas.forEach(System.out::print);
		 
		 System.out.println("----------------------------------------------");		 
		 System.out.println("Desafia 06: ");
		 System.out.println();
		 
		 for(Pessoa pessoa : pessoas) {
			 if(pessoa.getNome().equals("Jessica")) {
				 System.out.println(pessoa.getNome() + ", " + pessoa.getIdade() + ".");
			 }
		 }		 
	}
	
}
