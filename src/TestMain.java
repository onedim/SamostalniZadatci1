/**
 * test klasa za music
 * @author nedimomerovic
 *
 */
public class TestMain {

	public static void main(String[] args) {
/**
 * unos imena,umjetnika i duzine pjesme kroz TextIO klasu
 */
		System.out.println("Unesite naslov prve pjesme: ");
		String name1 = TextIO.getlnString();
		System.out.println("Unesite ime umjetnika: ");
		String artist1 = TextIO.getlnString();
		System.out.println("Unesite duzinu pjesme: ");
		double length1 = TextIO.getlnDouble();
		Music song1 = new Music(name1, artist1, length1);

		System.out.println("Unesite naslov druge pjesme: ");
		name1 = TextIO.getlnString();
		System.out.println("Unesite ime umjetnika: ");
		artist1 = TextIO.getlnString();
		System.out.println("Unesite duzinu pjesme: ");
		length1 = TextIO.getlnDouble();
		Music song2 = new Music(name1, artist1, length1);

		System.out.println("Unesite naslov trece pjesme: ");
		name1 = TextIO.getlnString();
		System.out.println("Unesite ime umjetnika: ");
		artist1 = TextIO.getlnString();
		System.out.println("Unesite duzinu pjesme: ");
		length1 = TextIO.getlnDouble();
		Music song3 = new Music(name1, artist1, length1);

		double sum = SumOfSongs(song1, song2, song3);
		System.out.println("Duzina sve tri pjesme je " + sum + "s.");
		LongestSong(song1, song2, song3);
	}
/**
 * Zbraja sve tri pjesme
 * @param song1
 * @param song2
 * @param song3
 * @return
 */
	public static double SumOfSongs(Music song1, Music song2,Music song3) {
		double sum = song1.getLength() + song2.getLength() + song3.getLength();
		return sum;
	}
	
	/**
	 * Metoda uzima max duzinu od sve tri pjesme, i izbacuje najduzu na terminal
	 * @param song1
	 * @param song2
	 * @param song3
	 */

	public static void LongestSong(Music song1, Music song2,Music song3) {
		double max = Math.max(song1.getLength(), song2.getLength());//max funkcija uzima najvecu vrijednost od song1 i song2
		Math.max(max, song3.getLength());//uporedjuje max dobiven iz gornje komande i poredi sa song3
		if (song1.getLength() == max)
			System.out.println("Najduza pjesma je:" + song1.getArtist() + " - "	+ song1.getTitle() + " " + song1.getLength() + "s");
		if (song2.getLength() == max)
			System.out.println("Najduza pjesma je:" + song2.getArtist() + " - "	+ song2.getTitle() + " " + song2.getLength() + "s");
		if (song3.getLength() == max)
			System.out.println("Najduza pjesma je:" + song3.getArtist() + " - "	+ song3.getTitle() + " " + song3.getLength() + "s");
	}

}