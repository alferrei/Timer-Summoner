package dao;

import classes.Countdown;
import classes.SummonerSpells;

/**
 * <h1>Getting names of a spell</h1> The verifySpell method looks for a EnumSet
 * of spells and seconds given a name typed by the user
 * 
 * @author alferrei
 * @version 1
 * @since 2018-10-10
 */
public class SpellsDAO {
	/**
	 * constructors Included constructor that receives a enumType
	 */
	SummonerSpells ss;
	private String name;
	private int secs;

	public SpellsDAO(String name, int secs) {
		this.name = name;
		this.secs = secs;
	}

	public SpellsDAO(SummonerSpells ss) {
		this.ss = ss;
	}

	public SpellsDAO(String name) {
		this.name = name;
	}

	public SpellsDAO() {

	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return (this.name + " " +this.secs);
	}

	public int getSecs() {
		return secs;
	}

	public void setSecs(int secs) {
		this.secs = secs;
	}

	public void setName(String name) {
		this.name = name;
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

	@SuppressWarnings("finally")
	public SpellsDAO getSpell(String name) {
		SummonerSpells ss = null;
		SpellsDAO spellSaida = new SpellsDAO();
		try {
			ss = SummonerSpells.forName(name.toUpperCase().trim());
		} catch (IllegalArgumentException iex) {
			System.out.println(iex.toString());
		} catch (NullPointerException nex) {
			System.out.println(nex.toString());
		} finally {
			spellSaida = spellSaida.toDAO(ss);
			return spellSaida;
		}
	}

	public SpellsDAO toDAO(SummonerSpells ss) {
		SpellsDAO spell = new SpellsDAO();
		spell.name = ss.name().substring(0, 1);
		spell.secs = ss.getSegundos();
		return spell;
	}

	/**
	 * 
	 * @param tempo
	 * @param nome
	 * @return name and value of time of this spell
	 * 
	 */

	public void count(SpellsDAO spell) {
		Countdown count = new Countdown();
		count.CountdownToZero(spell.getName(), spell.getSecs());
	}

	public void untilZero(SpellsDAO spell) {
		spell.count(spell);
	}

}
