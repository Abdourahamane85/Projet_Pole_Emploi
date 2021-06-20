package Pages.Accueil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.CommonPoleEmploiPage;

public class BodyPage {
	
	 CommonPoleEmploiPage ObjetCommonPoleEmploi = new  CommonPoleEmploiPage ();
		
		WebDriver driver; 
		
		By xpathChampMetier = By.xpath("//INPUT[@id='keywords-selectized']");
		By xpathChampLieuDeTravail = By.xpath("//INPUT[@id='location1-selectized']");
		By xpathCreerMonDossier = By.xpath("//SPAN[@aria-hidden='true']");
		
		public  BodyPage (WebDriver driver)  {
			this.driver = driver ;
			
		}
		
public  void testChampMetier ()  throws InterruptedException {
			
			WebElement ChampMetier = driver.findElement(xpathChampMetier  );
		

			 ObjetCommonPoleEmploi.VerificationElement (ChampMetier );
			
			if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement(ChampMetier )) {
				
				ChampMetier.sendKeys(" Testeur",Keys.ENTER);
				
				 
			}
			else 
			{
				System.out.println("on ne peut pas utilier le lien ");
			}
			
			Thread.sleep(2000);
			
			driver.navigate().back();
		
			
	}
	
   public  void testChampLieuDeTravail ()  throws InterruptedException {
	
	WebElement ChampLieuDeTravail = driver.findElement(xpathChampLieuDeTravail  );


	 ObjetCommonPoleEmploi.VerificationElement (ChampLieuDeTravail);
	
	if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement(ChampLieuDeTravail )) {
		
		ChampLieuDeTravail.sendKeys(" ile-de-france",Keys.ENTER);
		
		 
	}
	else 
	{
		System.out.println("on ne peut pas utilier le lien ");
	}
	
	Thread.sleep(2000);
	
	driver.navigate().back();

	
   }
   
   public  void testCreerMonDossier ()  throws InterruptedException {
		
		WebElement CreerMonDossier = driver.findElement(xpathCreerMonDossier );


		 ObjetCommonPoleEmploi.VerificationElement (CreerMonDossier );
		
		if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement(CreerMonDossier  )) {
			
			CreerMonDossier .sendKeys(" ile-de-france",Keys.ENTER);
			
			 
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		
		Thread.sleep(2000);
		
		driver.navigate().back();

		
	   }
}
