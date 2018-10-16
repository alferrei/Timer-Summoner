package dao;

import java.util.concurrent.TimeUnit;
import classes.Countdown;
import classes.Spells;
import classes.SummonerSpells;

/**
 * <h1>Getting names of a spell</h1> The verifySpell method looks for a EnumSet
 * of spells and seconds given a name typed by the user
 * 
 * @author alferrei
 * @version 0.2
 * @since 2018-10-10
 */
public class SpellsDAO extends Spells {
/** constructors
 Included constructor that receives a enumType
 */
	SummonerSpells ss;
	
	public SpellsDAO(String nome, int tempo) {
		super(nome, tempo);
	}

	public SpellsDAO(SummonerSpells ss)
	{
		this.ss = ss;
	}
	public SpellsDAO(String nome) {
		super(nome);
	}

	public SpellsDAO() {
		super();
	}

	/**
	 * this method look for a spell who matches with a given spell name given in
	 * main
	 * 
	 * @param nome
	 * 
	 * @throws IllegalArgumentException
	 *             if the given name doesn't match NullPointerException if the given
	 *             name is actually null
	 * @return informations that are on the enum and that match
	 */
	
	public SpellsDAO toDao(SummonerSpells ss) {
		SpellsDAO spellConverted = new SpellsDAO(ss);
		return spellConverted;
	}

	public SpellsDAO verifySpell(String nome) throws IllegalArgumentException, NullPointerException {
		SummonerSpells spell = null;
		SpellsDAO spellSaida = new SpellsDAO();
		try {
			spell = SummonerSpells.forName(nome.toUpperCase().trim());
		} catch (IllegalArgumentException iex) {
			System.out.println(iex.toString());
		} catch (NullPointerException nex) {
			System.out.println(nex.toString());
		}
		spellSaida = spellSaida.toDao(spell);
		return spellSaida;

	}


	/**
	 * 
	 * @param tempo
	 * @param nome
	 * @return name and value of time of this spell
	 * 
	 */

	public String contagem(SummonerSpells spellToCount) {
		SpellsDAO spells = new SpellsDAO();
		SpellsDAO spell = spells.verifySpell(spellToCount.name());
		spells = spells.verifySpell(spell.name());
		return spellToCount.name() + spellToCount.getSegundos();
	}

	public void count(int secs) {
		Countdown count = new Countdown();
		count.CountdownToZero(secs);
	}
}
