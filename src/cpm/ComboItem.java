package cpm;


import cpm.Czynnosc;
import cpm.Zdarzenie;

/**
 *
 * @author Marek
 */

public class ComboItem
{

	public String key;			//Wyswietlana nazwa w GUI
	public Zdarzenie value;		//Obiekt klasy zdarzenie
	public Czynnosc val;		//Obiekt klasy Czynnosc

	public ComboItem(String key, Zdarzenie value)
	{
		this.key = key;
		this.value = value;
	}

	public ComboItem(String key, Czynnosc value)
	{
		this.key = key;
		this.val = value;
	}

	@Override
	public String toString()
	{
		return key;
	}

	public Zdarzenie getZdarzenie()
	{
		return value;
	}

	public Czynnosc getCzynnosc()
	{
		return val;
	}
}
