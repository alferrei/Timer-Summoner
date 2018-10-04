package classes;

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

	public void pegaNomeSpell(String nomeSpell) {
		// *String[] args = null;
		// String spell[] = args[0].toString().trim().split(" ");
		// String nomeSpell = spell[0];
		// System.out.println(nomeSpell);
		
		
	}

}
