package classes;

import summoner.Barrier;

public interface Spell {
	static void getNome(String Nome) {
		Nome = Nome;
	}

	static void getTempo(int tempo) {
		tempo = tempo;
	}

	public static String contagem(int tempo, String nome) {
		for (int segundos = tempo; segundos != 0; segundos--) {
			tempo = segundos;
			System.out.println(nome + " - " + tempo);
		}
		return nome + tempo;
	}
}
