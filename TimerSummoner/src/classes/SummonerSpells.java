package classes;

public enum SummonerSpells {
	flash(300), purificar(210), barreira(210), exaustão(210), teleporte(360), fantasma(180), incendiar(210), curar(270);

	public int segundos;

	public int getSegundos() {
		return segundos;
	}

	SummonerSpells(int segundos) {
		this.segundos = segundos;
	}

	private String name;

	SummonerSpells(String name) {
		this.name = name();
	}

	public static SummonerSpells contains(String name) {
		for (SummonerSpells ss : SummonerSpells.values()) {
			if (ss.name.equalsIgnoreCase(name)) {
				System.out.println(name + " entrada "+ ss.name + " enum");
				return ss;
			}
		}
		throw new NullPointerException("Nome inválido");
	}
}
