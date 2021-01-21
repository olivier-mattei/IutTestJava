package IutTestJava;

public class SingleClass 
{
	private String text; // on déclare text en public private pour pouvoir l'appelé
	public String getText() // méthode en mode public pour récup le text
	{
	
		return text;
		
	}

	private static SingleClass sg; //déclaration de la variable sg en tant que objet privé
	private SingleClass() //constructeur
	{
		text = "test 1 2 3"; //mon UUID
		
	}
	
	public static SingleClass Recupere() //on récupére sg
	{
		if (sg == null) //si sg n'existe pas
		{
			sg = new SingleClass(); // création objet sg
			
		}
		return sg; //retourne sg
	}

}
