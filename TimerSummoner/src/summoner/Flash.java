package summoner;

import classes.Spell;

public class Flash implements Spell {
	private String nome = "Flash";
	private Integer tempo = 300;

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
