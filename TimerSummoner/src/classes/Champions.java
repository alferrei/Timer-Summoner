package classes;

public enum Champions {
	AHRI, 
	BLITZCRANK, 
	VEIGAR;

//CONSTRUTORES
	//METODO QUE BUSCA UM VALOR DO ENUM
	public static Champions byName(String name) {
		return valueOf(name.toUpperCase());
	}
}
