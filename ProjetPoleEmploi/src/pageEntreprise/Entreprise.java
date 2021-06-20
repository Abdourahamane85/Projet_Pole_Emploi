package pageEntreprise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.CommonPoleEmploiPage;

public class Entreprise {
	
CommonPoleEmploiPage ObjetCommonPoleEmploi = new  CommonPoleEmploiPage ();
	
	WebDriver driver; 
	
	By xpathEntreprise = By.xpath("//A[@title='Accéder au site entreprise']");
	By xpathPublierUneOffre = By.xpath("//SPAN[@aria-hidden='true']");
	
	public  Entreprise (WebDriver driver)  {
		this.driver = driver ;
		
	}
	
public  void testEntreprise ()  throws InterruptedException {
		
		WebElement LienEntreprise = driver.findElement( xpathEntreprise);
	

		 ObjetCommonPoleEmploi.VerificationElement ( LienEntreprise);
		
		if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement( LienEntreprise)) {
			
			 LienEntreprise.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		
   }
	
public  void testPublierUneOffre ()  throws InterruptedException {
	
	WebElement LienPublierOffre = driver.findElement( xpathPublierUneOffre);


	 ObjetCommonPoleEmploi.VerificationElement ( LienPublierOffre);
	
	if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement( LienPublierOffre)) {
		
		LienPublierOffre.click();
	}
	else 
	{
		System.out.println("on ne peut pas utilier le lien ");
	}
	
	Thread.sleep(2000);
	
	driver.navigate().back();

	
   }

}
