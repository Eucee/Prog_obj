
public class date 
{

	//Attributs
	private String jour;
	private String mois;
	private String annee;
	
	//Accesseurs
	public String getJour() {
		return jour;
	}

	public String getMois() {
		return mois;
	}

	public String getAnnee() {
		return annee;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public void setMois(String mois) {
		this.mois = mois;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	//Constructeurs
	public date(String jour, String mois, String annee)
	{
		this.jour=jour;
		this.mois=mois;
		this.annee=annee;
	}
	
	//Méthodes
	public void affiche()
	{
		System.out.println(this.jour+"/"+this.mois+"/"+this.annee);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
