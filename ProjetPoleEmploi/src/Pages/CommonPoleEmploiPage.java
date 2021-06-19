package Pages;
import org.openqa.selenium.WebElement;

public class CommonPoleEmploiPage {
	
	public String UrlPoleEmploi = "https://www.pole-emploi.fr/accueil/";

	public static void VerificationElement (WebElement monElement) {
		
		boolean ResultatAffichage = monElement.isDisplayed() ;
		
		if (ResultatAffichage == true) {
			
		System.out.println("l'element" +monElement + "est bien Affiché"  );
		}
		else
		{
			System.out.println("l'element" +monElement + "n'est pas affiché"  );
		}
	}
	
     public boolean VerificationBeforeUseElement (WebElement monElement) {
		
		return monElement.isDisplayed();
	}


	}

