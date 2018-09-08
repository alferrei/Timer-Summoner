package testes;

import summoner.*;

public class TestaBarrier {

	public static void main(String[] args) {
		Barrier barreira = new Barrier();
		{
			barreira.contagem(barreira.getTempo(), barreira.getNome());
		}
	}
}
