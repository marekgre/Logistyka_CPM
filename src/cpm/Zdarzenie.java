package cpm;

/**
 *
 * @author Marek
 */

class Zdarzenie
{
	String Nazwa;

	public int start_time;	//Czas poczatkowy
	public int end_time;	//Czas koncowy
	public int luz;			//koncowy-poczatkowy = luz

	/**
	 * Konstruktor przyjmujacy nazwe zdarzenia
	 * @param naz 
	 */
	Zdarzenie(String naz)
	{
		this.Nazwa = naz;
	}

}
