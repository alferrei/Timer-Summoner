package dao;

import classes.Spells;
import classes.SummonerSpells;

public class SpellsDAO extends Spells {

	public SpellsDAO(String nome, int tempo) {
		super(nome, tempo);
	}

	public SpellsDAO(String nome) {
		super(nome);
	}

	public static void verifyNomeSpell(String nome) {
		try {
			SummonerSpells.contains(nome);	
		} catch(NullPointerException e){
			System.out.println("Parâmetro inválido, erro capturado" + e );
		}
		
		System.out.println(nome);
	}

	public String contagem(int tempo, String nome) {
		for (int segundos = tempo; segundos != 0; segundos--) {
			tempo = segundos;
			System.out.println(nome + " - " + tempo);
		}
		return nome + tempo;
	}

}
