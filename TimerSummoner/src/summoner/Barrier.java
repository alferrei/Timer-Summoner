package summoner;

import classes.Spell;

public class Barrier implements Spell {
	static final String NOME_SUMMONER = "Barreira";
	static final Integer TEMPO_SUMMONER = 180;

	@Override
	public String contagem(int TEMPO_SUMMONER) {
		for (int segundos = TEMPO_SUMMONER; segundos != 0; segundos--) {
			TEMPO_SUMMONER = segundos;
			System.out.println(Barrier.NOME_SUMMONER + " - " + TEMPO_SUMMONER);
		}
		return NOME_SUMMONER + TEMPO_SUMMONER;
	}

	@Override
	public boolean isZerado(boolean zero) {
		return false;
	}

	@Override
	public boolean taContando(boolean conta) {
		return false;
	}

	@Override
	public String getNome(String NOME_SUMMONER) {
		return Barrier.NOME_SUMMONER + " - ";
	}

	@Override
	public int getTempo(int TEMPO_SUMMONER) {
		return Barrier.TEMPO_SUMMONER;
	}

}
