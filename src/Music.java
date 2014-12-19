/**
 * 1. Napraviti klasu Song sa sljedećim atributima: title (tipa String), artist (tipa String) i length (tipa integer — trajanje u sekundama).
2. Tražiti od korisnika da unese atribute za tri pjesme.
3. Ispisati ukupno trajanje sve tri pjesme
4. Ispisati trajanje i naziv najduže pjesme (bonus)

Napomene:
* Zadatak se može riješiti bez korištenja nizova i petlji (ako želite, slobodni ste da ih koristite)
* Kako bi znali najdužu pjesmu, moramo pratiti ne samo najveći broj, već objekat s najdužim trajanjem

 * @author nedimomerovic
 *
 */


public class Music {
	private String title;
	private String artist;
	private double length; 

	public Music(String t,String a,double l) {
		title=t;
		artist=a;
		length=l;
	}
	
	public String getTitle(){
		return title;
	}

	public void setTitle(String t){
		title=t;
	}
	
	public String getArtist(){
		return artist;
	}

	public void setArtist(String a){
	 artist=a;
	}
	
	public double getLength(){
		return length;
	}

	public void setLength(double l){
	 length=l;
	}
	
}