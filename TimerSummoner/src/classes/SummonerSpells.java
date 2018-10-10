package classes;

public enum SummonerSpells {
	FLASH(300), 
	PURIFICAR(210), 
	BARREIRA(180), 
	EXAUSTÃO(210), 
	TELEPORTE(360), 
	FANTASMA(180), 
	INCENDIAR(210), 
	CURAR(270);

	private int segundos;
//CONSTRUTORES
	public int getSegundos() {
		return segundos;
	}
	
	SummonerSpells(int segundos) {
		this.segundos = segundos;
	}
//METODO QUE BUSCA UM VALOR DO ENUM
	public static SummonerSpells forName(String name) {
		return valueOf(name.toUpperCase());
	}
}
