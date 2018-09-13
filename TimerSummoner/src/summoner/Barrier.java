package summoner;

import classes.Spells;

public class Barrier extends Spells {
	private static final String NOME_SUMMONER = "Barreira";
	private static final Integer TEMPO_SUMMONER = 180;

	@Override
	public String getNome() {
		return NOME_SUMMONER;
	}

	@Override
	public int getTempo() {
		return TEMPO_SUMMONER;
	}

}
