package summoner;

import classes.Spell;

public class Barrier implements Spell {
	 public static final String NOME_SUMMONER = "Barreira";
	 public static final Integer TEMPO_SUMMONER = 180;

	public String contagem(int TEMPO_SUMMONER) {
		return NOME_SUMMONER + TEMPO_SUMMONER;
	}

	public String getNome(String NOME_SUMMONER) {
		return Barrier.NOME_SUMMONER + " - ";
	}

	public int getTempo(int TEMPO_SUMMONER) {
		return Barrier.TEMPO_SUMMONER;
	}

}
