package summoner;

import classes.Spell;
import classes.Spells;

public class Flash extends Spells {
	private static final String NOME_SUMMONER = "Flash";
	private static final int TEMPO_SUMMONER = 300;

	@Override
	public String getNome() {
		return NOME_SUMMONER;
	}

	@Override
	public int getTempo() {
		return TEMPO_SUMMONER;
	}


}
