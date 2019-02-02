
//Saila Kivela

import java.util.ArrayList;

public class Rakennus {
	private double pintaAla;
	private int huoneidenLkm;
	private Asukas asukas;
	private ArrayList<Asukas> asukkaat = new ArrayList<Asukas>();
	
	public Rakennus(double pintaAla, int huoneidenLkm){
		if (pintaAla > 0) {
			this.pintaAla = pintaAla;
		}
		this.huoneidenLkm = huoneidenLkm;
		this.asukkaat = new ArrayList<>();
	}
	
	/*public Rakennus(Rakennus talo) {
		this.pintaAla = 0;
		this.huoneidenLkm = 0;
		this.asukkaat = null;
	}*/

	public void setPintaAla(double pintaAla){
		if (pintaAla > 0) {
			this.pintaAla = pintaAla;
		}
	}
	
	public double getPintaAla(){
		return this.pintaAla;
	}
	
	public void setHuoneidenLkm(int huoneidenLkm){
		this.huoneidenLkm = huoneidenLkm;
	}
	
	public int getHuoneidenLkm(){
		return this.huoneidenLkm;
	}
	
	public void lisaaAsukas(String nimi, String syntymaAika){
		Asukas uusi = new Asukas (nimi, syntymaAika);
		asukkaat.add(uusi);
	}
	
	public void listaaAsukkaat(){
		for (Asukas asukas: asukkaat) {
			asukas.tulostaAsukas();
		}
	}
	
	public String toString() {
		return "\npinta-ala: " + this.pintaAla + "\nhuoneet: " + this.huoneidenLkm + "\n\nasukkaat: " ;//+ listaaAsukkaat();
	}
		
}