package summoner;

import classes.Spell;

public class Exhaust implements Spell {
	private String nome = "Exhaust";
	private int tempo = 210;

	@Override
	public String contagem(int tempo, String nome) {
		return (this.nome +" - "+this.tempo--);
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
		return "Exhaust - ";
	}

	@Override
	public int getTempo(int tempo) {
		return this.tempo;
	}

}
