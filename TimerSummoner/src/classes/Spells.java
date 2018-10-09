package classes;

public abstract class Spells implements Spell {
	String nome;
	int tempo;

	protected String getNome() {
		return this.nome;
	}

	protected int getTempo() {
		return this.tempo;
	}

	protected Spells(String nome) {

	}

	protected Spells(String nome, int tempo) {

	}

}
