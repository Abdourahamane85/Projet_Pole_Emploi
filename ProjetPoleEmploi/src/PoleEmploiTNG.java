import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import Connexion.ConnexionPage;
import Pages.CommonPoleEmploiPage;
import Pages.Accueil.BodyPage;
import Pages.Accueil.HeadPage;

import org.testng.annotations.AfterMethod;

public class PoleEmploiTNG {

WebDriver driver ;
	
	//ConnexionPage instanceConnexion ;
	HeadPage instanceHeadPage ;
	BodyPage instanceBodyPage ;
	

	
	@BeforeMethod 
	
	public void PoleEmploi () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdou Rahmane\\Documents\\chromedriver.exe");
		 driver  = new ChromeDriver();
		 
	        driver.manage().window().maximize();

	        CommonPoleEmploiPage ObjetCommonPoleEmploi = new CommonPoleEmploiPage ();
	       driver.get(ObjetCommonPoleEmploi.UrlPoleEmploi);
	       driver.findElement(By.xpath("/html/body/div/div/div[2]/button[2]")).click();
	       

}
	/*@Test
	public void testConnexion () throws InterruptedException {
		
		 instanceConnexion = new ConnexionPage ( driver);
		 instanceConnexion.testConnexion();
		
	
	}
	*/
	@Test
	public void testLogo () throws InterruptedException {
		
		 instanceHeadPage = new HeadPage ( driver);
		 instanceHeadPage.testLogo();
		
	
	}
	@Test
	public void testImgFrancaise () throws InterruptedException {
	
		 instanceHeadPage = new HeadPage ( driver);
		 instanceHeadPage.testImgRFrancaise();
		
	
	}
	@Test
	public void testMenu () throws InterruptedException {
		
		 instanceHeadPage = new HeadPage ( driver);
		 instanceHeadPage.testMenu();
		
	
	}
	
	@Test
	public void testGouv () throws InterruptedException {
		
		 instanceHeadPage = new HeadPage ( driver);
		 instanceHeadPage.testGouv();
		
	
	}
	
	@Test
	public void testConnexion () throws InterruptedException {
		
		 instanceHeadPage = new HeadPage ( driver);
		 instanceHeadPage.testConnexion();
		
  }

	@Test
	public void testChampMetier () throws InterruptedException {
		
		instanceBodyPage = new BodyPage ( driver);
		 instanceBodyPage.testChampMetier();
}
}
