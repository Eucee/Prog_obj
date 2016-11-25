public class Article{

    //Attributs
    protected String reference;
    protected String marque;
    protected String modele;
    protected double prixParJourLocation;
    protected int nbStock;

    //Accesseurs
    //Getters
  

    public String getReference() {
		return reference;
	}


	public String getMarque() {
		return marque;
	}


	public String getModele() {
		return modele;
	}


	public double getPrixParJourLocation() {
		return prixParJourLocation;
	}


	public int getnbStock() {
		return nbStock;
	}

	//Setters

	public void setReference(String reference) {
		this.reference = reference;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	public void setPrixParJourLocation(double prixParJourLocation) {
		this.prixParJourLocation = prixParJourLocation;
	}


	public void setnbStock(int nbStock) {
		this.nbStock = nbStock;
	}


	//Constructeurs
 	
	public Article(String reference, String marque, String modele,
			double prixParJourLocation, int nbStock) {
		this.reference = reference;
		this.marque = marque;
		this.modele = modele;
		this.prixParJourLocation = prixParJourLocation;
		this.nbStock = nbStock;
	}


    //Methodes
 
	public void affiche(){
		System.out.println("L'article a les caracteristiques suivantes:\nRéférence: " + this.reference + "\nMarque: " + this.marque +  "\nModèle: " + this.modele +  "\nPrix par jour de location: " + this.prixParJourLocation +  "\nNombre d'articles en stock: " + this.nbStock);
	}
	
    
	//Main
	public static void main(String[] args) {
		Article article1 = new Article("X2504", "EtienneCorp(C)", "ChaudVanille", 12.06, 3);
		article1.affiche();

	}

	

}//fin classe
