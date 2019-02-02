	
// Saila Kivela
// Olio-ohjelmointi -kurssin harjoitustehtava 2.
// Asukkaiden listausta taloihin ja talojen sijoittelua tonteille. 

import java.util.Scanner;
import java.lang.NumberFormatException;

public class Vkoteht2 {

	public static void main(String[] args) throws NumberFormatException {		

		Scanner lukija = new Scanner(System.in);

		System.out.println("Anna tontin nimi: ");
		String tontinNimi = lukija.nextLine();
				
		System.out.println("Anna leveyspiiri: ");
		String leveyspiiri = lukija.nextLine();
				
		System.out.println("Anna pituuspiiri: ");
		String pituuspiiri = lukija.nextLine();
		
		
		System.out.println("Anna tontin ala: ");
		double pintaAla = Double.parseDouble(lukija.nextLine());
		
		if (pintaAla < 0) {
			System.out.println("Et voi antaa negatiivista pinta-alaa.");
		} else {
			Tontti tontti = new Tontti (tontinNimi, leveyspiiri, pituuspiiri, pintaAla);
				
			System.out.println("Anna talon pinta-ala: ");
			double talonPintaAla = Double.parseDouble(lukija.nextLine());
		
			if (talonPintaAla < 0) {
				System.out.println("Et voi antaa negatiivista pinta-alaa.");
			} else {
				System.out.println("Anna huoneiden lukumaara: ");
				int huoneidenLkm = Integer.parseInt(lukija.nextLine());
		
				if (huoneidenLkm < 0) {
					System.out.println("Et voi antaa negatiivista huoneiden lukumaaraa.");
				} else {
					Rakennus talo = new Rakennus (talonPintaAla, huoneidenLkm);
					tontti.lisaaRakennus(talonPintaAla, huoneidenLkm);
		
					System.out.println("Seuraavaksi voit lisata asukkaita. Tyhja syote lopettaa.");

					while (true) {
						System.out.println("Anna asukkaan nimi: ");
						String asukkaanNimi = lukija.nextLine();
						if (asukkaanNimi.isEmpty()){
							break;
						}
						
						System.out.println("Anna asukkaan syntyma-aika: ");
						String syntymaAika = lukija.nextLine();
						talo.lisaaAsukas(asukkaanNimi, syntymaAika);
					}
		
		
					System.out.println(tontti);
					//System.out.println(talo);
					talo.listaaAsukkaat();
		
				}
			}
		}
	}	
}
