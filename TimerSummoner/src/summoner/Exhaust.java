package summoner;

import classes.Spell;

public class Exhaust extends Spells {
	private static final String NOME_SUMMONER = "Exaustão";
	private static final int TEMPO_SUMMONER = 210;

	@Override
	public String getNome() {
		return NOME_SUMMONER;
	}

	@Override
	public int getTempo() {
		return TEMPO_SUMMONER;
	}

}
