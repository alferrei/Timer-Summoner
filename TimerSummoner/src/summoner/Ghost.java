package summoner;

import classes.Spells;

public class Ghost extends Spells {
	private static final String NOME_SUMMONER = "Fantasma";
	private static final int TEMPO_SUMMONER = 180;

	@Override
	public String getNome() {
		return NOME_SUMMONER;
	}

	@Override
	public int getTempo() {
		return TEMPO_SUMMONER;
	}

}
