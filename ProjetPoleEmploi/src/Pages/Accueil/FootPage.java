package Pages.Accueil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.CommonPoleEmploiPage;

public class FootPage {
	
	 CommonPoleEmploiPage ObjetCommonPoleEmploi = new  CommonPoleEmploiPage ();
	 
	 WebDriver driver; 
	 
	 By xpathActualiteEmploi = By.xpath("//A[@href='https://www.pole-emploi.fr/actualites/']");

	 public  FootPage (WebDriver driver)  {
			this.driver = driver ;
			
		}
	 public  void testActualiteEmploi ()  throws InterruptedException {
			
			WebElement ActualiteEmploi = driver.findElement(xpathActualiteEmploi );
		

			 ObjetCommonPoleEmploi.VerificationElement (ActualiteEmploi );
			
			if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement(ActualiteEmploi )) {
				
				ActualiteEmploi.click();
			}
			else 
			{
				System.out.println("on ne peut pas utilier le lien ");
			}
			
			Thread.sleep(2000);
			
			driver.navigate().back();
		
			
	}
}
