package summoner;

public class Cleanse extends Spells {
	private static final String NOME_SUMMONER = "Purificar";
	private static final Integer TEMPO_SUMMONER = 210;

	@Override
	public String getNome() {
		return NOME_SUMMONER;
	}
	@Override
	public int getTempo() {
		return TEMPO_SUMMONER;
	}

}
