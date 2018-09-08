package summoner;

public class Teleport extends Spells {
	private static final String NOME_SUMMONER = "Teleporte";
	private static final Integer TEMPO_SUMMONER = 360;

	@Override
	public String getNome() {
		return NOME_SUMMONER;
	}

	@Override
	public int getTempo() {
		return TEMPO_SUMMONER;
	}

}
