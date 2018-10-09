package testes;

import dao.SpellsDAO;
import summoner.*;

public class TestaCleanse {

	public static void main(String[] args) {
		SpellsDAO purificar = new SpellsDAO("purificar");
		{
			purificar.verifyNomeSpell("purificar");
		}
	}
}
