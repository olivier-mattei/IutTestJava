package IutTestJava;

public class ClassePrincipale 
{
	SingleClass sg = SingleClass.Recupere();//on apelle la SingleClass et on prend la method recup
	public void AfficherTexte() 
	{
		System.out.println("je suis Classe Principal");
		System.out.println(sg.getText());
		
		
	}
	
}
