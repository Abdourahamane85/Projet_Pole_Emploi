package Pages.Accueil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.CommonPoleEmploiPage;

public class HeadPage {

	 CommonPoleEmploiPage ObjetCommonPoleEmploi = new  CommonPoleEmploiPage ();
		
		WebDriver driver; 
		
		By xpathImgRFrancaise = By.xpath("//IMG[@src='https://www.pole-emploi.fr/files/live/sites/PE/files/images/Logos/header-logo2021-marianne.svg']");
		By xpathLogo = By.xpath("//IMG[@alt='Pôle emploi']");
		By xpathMenu = By.xpath("//SPAN[@aria-hidden='true']");
		By xpathGouv = By.xpath("//IMG[@src='https://www.pole-emploi.fr/files/live/sites/PE/files/bannieres/2021/Banniere-Tenir-Ensemble.gif']");
		By xpathconnexion = By.xpath("//SPAN[text()='Connexion']");
		
		public  HeadPage (WebDriver driver)  {
			this.driver = driver ;
			
		}

	public  void testImgRFrancaise ()  throws InterruptedException {
			
			WebElement ImgRFrancaise = driver.findElement(xpathImgRFrancaise );
		

			 ObjetCommonPoleEmploi.VerificationElement (ImgRFrancaise );
			
			if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement(ImgRFrancaise )) {
				
				ImgRFrancaise.click();
			}
			else 
			{
				System.out.println("on ne peut pas utilier le lien ");
			}
			
			Thread.sleep(2000);
			
			driver.navigate().back();
		
			
	}
	
	public  void testLogo()  throws InterruptedException {
		
		WebElement Logo = driver.findElement(xpathLogo );
	

		 ObjetCommonPoleEmploi.VerificationElement(Logo );
		
		if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement(Logo )) {
			
			Logo.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		
    }
	public  void testMenu ()  throws InterruptedException {
		
		WebElement Menu = driver.findElement(xpathMenu );
	

		 ObjetCommonPoleEmploi.VerificationElement(Menu );
		
		if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement(Menu )) {
			
			Menu.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		
  }
	
  public  void testGouv ()  throws InterruptedException {
		
		WebElement Gouv = driver.findElement(xpathGouv );
	

		 ObjetCommonPoleEmploi.VerificationElement( Gouv);
		
		if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement( Gouv )) {
			
			Gouv.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		
   }
	
   public  void testConnexion ()  throws InterruptedException {
	
	WebElement lienConnexion = driver.findElement(xpathconnexion );


	 ObjetCommonPoleEmploi.VerificationElement(lienConnexion  );
	
	if ( ObjetCommonPoleEmploi.VerificationBeforeUseElement(lienConnexion  )) {
		
		lienConnexion  .click();
	}
	else 
	{
		System.out.println("on ne peut pas utilier le lien ");
	}
	
	Thread.sleep(2000);
	
	driver.navigate().back();

	
}
}
