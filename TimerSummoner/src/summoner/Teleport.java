package summoner;

import classes.Spell;

public class Teleport implements Spell {
	private String nome = "Teleporte";
	private Integer tempo = 300;

	@Override
	public String contagem(int tempo, String nome) {
		return (this.nome + " - " + this.tempo--);
	}

	@Override
	public boolean isZerado(boolean zero) {
		return false;
	}

	@Override
	public boolean taContando(boolean conta) {
		return false;
	}

	@Override
	public String getNome(String Nome) {
		return this.nome + " - ";
	}

	@Override
	public int getTempo(int tempo) {
		return this.tempo;
	}

}
