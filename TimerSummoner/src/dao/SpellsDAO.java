package dao;

import classes.SummonerSpells;

public class SpellsDAO {

	public static boolean verificaNomeSpell(String nome) {
		SummonerSpells[] summoners = SummonerSpells.values();
		for (SummonerSpells summoner : summoners)
			if (summoner.contains(nome)) {
				return true;
			}
		return false;
	}

	public SummonerSpells getNomeSpell(String nome) {
		SummonerSpells spellPrincipal = null;
		SpellsDAO.verificaNomeSpell(nome);
		if (verificaNomeSpell("") == true) {
			System.out.println(nome);
			return spellPrincipal;
		} else {
			System.out.println("Nome não válido");
		}
		return spellPrincipal;
	}

	public String contagem(int tempo, String nome) {
		for (int segundos = tempo; segundos != 0; segundos--) {
			tempo = segundos;
			System.out.println(nome + " - " + tempo);
		}
		return nome + tempo;
	}

}
