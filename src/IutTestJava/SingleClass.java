package IutTestJava;

public class SingleClass 
{
	private String text; // on d�clare text en public private pour pouvoir l'appel�
	public String getText() // m�thode en mode public pour r�cup le text
	{
	
		return text;
		
	}

	private static SingleClass sg; //d�claration de la variable sg en tant que objet priv�
	private SingleClass() //constructeur
	{
		text = "test 1 2 3"; //mon UUID
		
	}
	
	public static SingleClass Recupere() //on r�cup�re sg
	{
		if (sg == null) //si sg n'existe pas
		{
			sg = new SingleClass(); // cr�ation objet sg
			
		}
		return sg; //retourne sg
	}

}
