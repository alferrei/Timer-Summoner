package summoner;

import classes.Spells;

public class Heal extends Spells {
	private static final String NOME_SUMMONER = "Curar";
	private static final int TEMPO_SUMMONER = 270;

	@Override
	public String getNome() {
		return NOME_SUMMONER;
	}

	@Override
	public int getTempo() {
		return TEMPO_SUMMONER;
	}

}
