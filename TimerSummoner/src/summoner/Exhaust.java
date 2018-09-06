package summoner;

import classes.Spell;

public class Exhaust implements Spell {
	private String nome = "Exaustão";
	private int tempo = 210;

	public String contagem(int tempo) {
		// taContando(true);
		for (int segundos = tempo; segundos != 0; segundos--) {
			tempo = segundos;
			System.out.println(nome + " - " + tempo);
		}
		// taContando(false);
		// isZerado(true);
		;
		return nome + tempo;
	}

	public String getNome(String Nome) {
		return this.nome + " - ";
	}

	public int getTempo(int tempo) {
		return this.tempo;
	}

}
