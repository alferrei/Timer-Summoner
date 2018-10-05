package testes;

import dao.SpellsDAO;
import summoner.*;

public class TestaCleanse {

	public static void main(String[] args) {
		SpellsDAO purificar = new SpellsDAO();
		{
/*			purificar.contagem(purificar.getTempo(), purificar.verificaNomeSpell("Flash"));
*/			purificar.getNomeSpell("flash");
		}

	}
}
