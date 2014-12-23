

/**
 * Napišite funkciju koja ima jedan cjelobrojni parametar. 
 * Funkcija treba da vrati kao rezultat logicku vrijednost “true” ukoliko je broj simetrican, 
 * odnosno ukoliko se isto cita sa obje strane (na primjer, broj 13431 je simetrican). 
 * U suprotnom, funkcija vraca kao rezultat logicku vrijednost “false”. 
 * Napisanu funkciju trebate demonstrirati u kratkom testnom programu na brojevima koji se unose sa tastature. 
 * Program za svaki uneseni broj treba da ispise da li je simetrican ili nije. 
 * Program treba da završi rad kada se kao broj unese 0.
 * @author nedimomerovic
 *
 */
public class ComparingStringSymetry {

	


	
	public static void main(String[] args) {
		
		System.out.println("Unesi broj clanova");
		int m=TextIO.getlnInt();	
		int[] number = new int [m];
		System.out.println("unesi clanove");
		for(int i=0;i<m;i++)
			number[i]=TextIO.getlnInt();
		
		
	}
		
		
	
}
