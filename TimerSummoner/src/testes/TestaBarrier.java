package testes;

import summoner.*;

public class TestaBarrier {

	public static void main(String[] args) {
		Barrier barreira = new Barrier();
		Cleanse purificar = new Cleanse();	{
			barreira.contagem(barreira.TEMPO_SUMMONER);
			purificar.contagem(purificar.getTempoSummoner(), purificar.getNomeSummoner());
		}
	}
}
