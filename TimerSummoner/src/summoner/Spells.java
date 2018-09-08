package summoner;

import classes.Spell;

public abstract class Spells implements Spell {
	String nome;
	int tempo;
	public String contagem(int tempo, String nome) {
		for (int segundos = tempo; segundos != 0; segundos--) {
			tempo = segundos;
			System.out.println(nome + " - " + tempo);
		}
		return nome + tempo;
	}
	
	protected String getNome() {
		return this.nome;
	}
	protected int getTempo() {
		return this.tempo;
	}
}
