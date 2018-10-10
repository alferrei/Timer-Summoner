package testes;

import classes.SummonerSpells;
import dao.SpellsDAO;

public class TestaCleanse {

	public static void main(String[] args) {
		// teste dos get nome
		String nome = "purificar";
		SummonerSpells spell = SpellsDAO.verifySpell(nome);
		System.out.println(spell.name().toLowerCase() + " segundos: " + spell.getSegundos());

		// teste do segundos e contador
		
	}
}
