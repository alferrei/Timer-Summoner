package summoner;

import classes.Spells;

public class Ignite extends Spells {
	private static final String NOME_SUMMONER = "Incendiar";
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
