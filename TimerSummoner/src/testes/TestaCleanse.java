package testes;

import dao.SpellsDAO;

public class TestaCleanse {

	public static void main(String[] args) {
		String nome = "purificar";
		SpellsDAO spell = new SpellsDAO();
		spell = spell.getSpell(nome);
		System.out.println(spell);
		spell.untilZero(spell);
		
		
		/*
		SpellsEvolvedDAO spell1 = new SpellsEvolvedDAO();
		spell1 = spell1.verifyName(nome);
		System.out.println(spell1);*/
	
	}
}
