package classes;

public enum SummonerSpells {
	flash(300), purificar(210), barreira(210), exaustão(210), teleporte(360), fantasma(180), incendiar(210), curar(270);

	public int segundos;
	public String spell;

	public int getSegundos() {
		return segundos;
	}

	public String getSpell() {
		return spell;
	}

	SummonerSpells(int segundos) {
		this.segundos = segundos;
	}

	SummonerSpells(String spell) {
		this.spell = spell;
	}

	public boolean contains(String spell) {
		boolean flag = false;

		for (SummonerSpells ss : SummonerSpells.values()) {
			if (spell.equalsIgnoreCase(ss.spell)) {
				flag = true;
			} else {
				flag = false;
			}
		}
		if (flag == true) {
			return true;

		} else {
			return false;
		}
	}
}
