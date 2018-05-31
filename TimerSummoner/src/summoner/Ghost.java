package summoner;

import classes.Spell;

public class Ghost implements Spell {
	private String nome = "Ghost";
	private int tempo = 180;

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
		return "Ghost - ";
	}

	@Override
	public int getTempo(int tempo) {
		return this.tempo;
	}

}
