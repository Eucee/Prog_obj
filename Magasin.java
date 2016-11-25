import java.util.ArrayList;

public class Magasin{

    //Attributs
    //private ArrayList <Client> listeClients;
    private ArrayList <Article> listeArticles;

	//Accesseurs
    
    
   	public ArrayList<Article> getListeArticles() {
   		return listeArticles;
   	}


   	public void setListeArticles(ArrayList<Article> listeArticles) {
   		this.listeArticles = listeArticles;
   	}
   	
    //Getters
    //Setters
    
    //Constructeurs
    
    public Magasin() {
		//listeClients = new ArrayList<Client>();
		listeArticles = new ArrayList<Article>();
	}
    

    //Methodes
	
	public void afficheLocationEnCours(){
		if(!listeArticles.isEmpty()){
			for (Article a : listeArticles){
				a.affiche();
				System.out.println("
			}
		}else{
			System.out.println("Liste vide");//erreur à gerer
		}
	}
	
	public void enregistreLocation(Article a){
	//ajout controle appartenance à classe article?
		listeArticles.add(a);
	}
	
	public void restitutueLocation(Article a){
	//ajout controle appartenance à classe article?
		if(listeArticles.contains(a)){
		listeArticles.remove(a);
		}else{//erreur à gerer
		System.out.println("Objet inexistant");
		}
	}

	/*public void afficheArticlesALouer(){
		
	}
	
	public void afficheClients(){
		
	}
	
	public void calculMontant(){
		
	}*/
	
	
	//Main
	public static void main(String[] args) {
		Article a1 = new Article("X2504", "EtienneCorp(C)", "ChaudVanille", 12.06, 3);
		Article a2 = new Article("X356", "EliséCorp(C)", "VertPoule", 20.01, 7);
		Magasin m = new Magasin();
		m.enregistreLocation(a1);
		m.enregistreLocation(a2);
		m.afficheLocationEnCours();
		m.restitutueLocation(a2);
		m.afficheLocationEnCours();

	}

	

}//fin classe
