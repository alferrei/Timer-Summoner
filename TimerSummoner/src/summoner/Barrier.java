package summoner;

import classes.Spell;

public class Barrier implements Spell {
	public String nome = "Barreira";
	public Integer tempo = 180;

	@Override
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

	@Override
	public String contagem(int segundos, String nome) {
		// TODO Auto-generated method stub
		return null;
	}


}
