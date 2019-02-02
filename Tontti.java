
// Saila Kivela

public class Tontti{
	private String nimi;
	private String leveyspiiri;
	private String pituuspiiri;
	private double pintaAla;
	private Rakennus talo;
	
	public Tontti(String nimi, String leveyspiiri, String pituuspiiri, double pintaAla){
		this.nimi = nimi;
		this.leveyspiiri = leveyspiiri;
		this.pituuspiiri = pituuspiiri;
		if (pintaAla > 0) {
			this.pintaAla = pintaAla;
		}
	}
	
	public void setNimi(String nimi){
		this.nimi = nimi;
	}
	
	public String getNimi(){
		return this.nimi;
	}
	
	public void setLeveyspiiri(String leveyspiiri){
		this.leveyspiiri = leveyspiiri;
	}
	
	public void setPituuspiiri(String pituuspiiri){
		this.pituuspiiri = pituuspiiri;
	}
	
	public String getSijainti(){
		return "leveys: " + this.leveyspiiri + ", pituus: " + this.pituuspiiri;
	}
	
	public void setPintaAla(double pintaAla){
		if (pintaAla > 0) {
			this.pintaAla = pintaAla;
		}
	}
	
	public double getPintaAla(){
		return this.pintaAla;
	}
		
	public void lisaaRakennus(double pintaAla, int huoneidenLkm){
		this.talo = new Rakennus (pintaAla, huoneidenLkm);
	}
	
	public String toString() {
		return this.nimi + "\nleveys: " + this.leveyspiiri + "\npituus: " + this.pituuspiiri + "\npinta-ala: " + this.pintaAla + "\n\ntalo: " + this.talo;
	}
}