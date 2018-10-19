package testes;

import dao.SpellsDAO;

public class TestaFlash {

	public static void main(String[] args) {
		String nome = "flash";
		SpellsDAO spell = new SpellsDAO();
		spell = spell.getSpell(nome);
		System.out.println(spell);
		spell.untilZero(spell);

	}
}
