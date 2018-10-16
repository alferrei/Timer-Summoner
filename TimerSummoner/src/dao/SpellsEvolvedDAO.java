package dao;

import classes.SummonerSpells;

public class SpellsEvolvedDAO {
	String name;
	int secs;

	public SpellsEvolvedDAO verifyName(String nome) {
		SpellsEvolvedDAO spellSaida = new SpellsEvolvedDAO();
		SummonerSpells ss = SummonerSpells.forName(nome);
		// valores indo pra quem deve sair
		spellSaida.name = ss.name();
		spellSaida.secs = ss.getSegundos();
		// LOG PRA APARECER ALI
		System.out.println(ss.name());
		System.out.println(ss.getSegundos());
		System.out.println(spellSaida.name);
		System.out.println(spellSaida.secs);
		return spellSaida;

	}

	public String toString() {
		return (this.name + this.secs);
	}

}
