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

	public void pegaNomeSpell(String nomeSpell) {
		// *String[] args = null;
		// String spell[] = args[0].toString().trim().split(" ");
		// String nomeSpell = spell[0];
		// System.out.println(nomeSpell);
		
		
	}

}
