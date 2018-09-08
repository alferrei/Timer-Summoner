package classes;

public interface Spell {

	public static String contagem(int tempo, String nome) {
		for (int segundos = tempo; segundos != 0; segundos--) {
			tempo = segundos;
			System.out.println(nome + " - " + tempo);
		}
		return nome + tempo;
	}
}
