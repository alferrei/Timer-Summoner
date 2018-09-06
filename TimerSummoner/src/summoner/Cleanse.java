package summoner;

import classes.Spell;

public class Cleanse implements Spell {
	private static final String NOME_SUMMONER = "Purificar";
	private static final Integer TEMPO_SUMMONER = 210;

	public String contagem(int TEMPO_SUMMONER, String NOME_SUMMONER) {
		for (int segundos = TEMPO_SUMMONER; segundos != 0; segundos--) {
			TEMPO_SUMMONER = segundos;
			System.out.println(Cleanse.NOME_SUMMONER + " - " + TEMPO_SUMMONER);
		}
		return NOME_SUMMONER + TEMPO_SUMMONER;
	}

	public static String getNomeSummoner() {
		return NOME_SUMMONER;
	}

	public static Integer getTempoSummoner() {
		return TEMPO_SUMMONER;
	}

}
