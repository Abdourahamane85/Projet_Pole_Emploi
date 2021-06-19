package Pages.Accueil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.CommonPoleEmploiPage;

public class BodyPage {
	
	 CommonPoleEmploiPage ObjetCommonPoleEmploi = new  CommonPoleEmploiPage ();
		
		WebDriver driver; 
		
		By xpathChampMetier = By.xpath("//INPUT[@id='keywords-selectized']");
		
		public  BodyPage (WebDriver driver)  {
			this.driver = driver ;
			
		}
		
public  void testChampMetier ()  throws InterruptedException {
			
			WebElement ChampMetier = driver.findElement(xpathChampMetier  );
		

			 ObjetCommonPoleEmploi.VerificationElement (ChampMetier );
			
			if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement(ChampMetier )) {
				
				ChampMetier.sendKeys(" Testeur");
			}
			else 
			{
				System.out.println("on ne peut pas utilier le lien ");
			}
			
			Thread.sleep(2000);
			
			driver.navigate().back();
		
			
	}
}
