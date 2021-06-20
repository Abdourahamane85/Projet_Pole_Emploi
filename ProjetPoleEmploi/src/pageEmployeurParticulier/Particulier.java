package pageEmployeurParticulier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.CommonPoleEmploiPage;

public class Particulier {
	
	CommonPoleEmploiPage ObjetCommonPoleEmploi = new  CommonPoleEmploiPage ();
	
	WebDriver driver; 
	
	By xpathParticulier = By.xpath("//A[@title='Accéder au site particulier employeur']");
	By xpathRechercherDesProfils = By.xpath("//SPAN[@aria-hidden='true']");
	
	public  Particulier (WebDriver driver)  {
		this.driver = driver ;
		
	}
	
	public  void testParticulier ()  throws InterruptedException {
		
		WebElement LienParticulier = driver.findElement(xpathParticulier  );
	

		 ObjetCommonPoleEmploi.VerificationElement (LienParticulier );
		
		if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement(LienParticulier)) {
			
			LienParticulier.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		
   }
	
public  void testRechercheProfils ()  throws InterruptedException {
		
		WebElement LienRechercheProfils = driver.findElement(xpathRechercherDesProfils );
	

		 ObjetCommonPoleEmploi.VerificationElement (LienRechercheProfils);
		
		if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement(LienRechercheProfils)) {
			
			LienRechercheProfils.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		
   }
	
	
}
