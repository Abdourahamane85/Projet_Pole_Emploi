import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import Connexion.ConnexionPage;
import Pages.CommonPoleEmploiPage;
import Pages.Accueil.BodyPage;
import Pages.Accueil.FootPage;
import Pages.Accueil.HeadPage;
import pageEmployeurParticulier.Particulier;
import pageEntreprise.Entreprise;

import org.testng.annotations.AfterMethod;

public class PoleEmploiTNG {

WebDriver driver ;
	
	//ConnexionPage instanceConnexion ;
	HeadPage instanceHeadPage ;
	BodyPage instanceBodyPage ;
	FootPage instanceFootPage ;
	Particulier instanceParticulier ;
	Entreprise instanceEntreprise ;
	

	
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
	/*
	@Test(priority=2)
	public void testLogo () throws InterruptedException {
		
		 instanceHeadPage = new HeadPage ( driver);
		 instanceHeadPage.testLogo();
		
	
	}
	@Test(priority=1)
	public void testImgFrancaise () throws InterruptedException {
	
		 instanceHeadPage = new HeadPage ( driver);
		 instanceHeadPage.testImgRFrancaise();
		
	
	}
	@Test(priority=3)
	public void testMenu () throws InterruptedException {
		
		 instanceHeadPage = new HeadPage ( driver);
		 instanceHeadPage.testMenu();
		
	
	}
	
	@Test(priority=4)
	public void testGouv () throws InterruptedException {
		
		 instanceHeadPage = new HeadPage ( driver);
		 instanceHeadPage.testGouv();
		
	
	}
	
	@Test(priority=5)
	public void testConnexion () throws InterruptedException {
		
		 instanceHeadPage = new HeadPage ( driver);
		 instanceHeadPage.testConnexion();
		
  }
  // Body Page
	
	@Test(priority=5)
	public void testChampMetier () throws InterruptedException {
		
		instanceBodyPage = new BodyPage ( driver);
		 instanceBodyPage.testChampMetier();
   }
	
	@Test(priority=6)
	public void testChampLieuDeTravail () throws InterruptedException {
		
		instanceBodyPage = new BodyPage ( driver);
		 instanceBodyPage.testChampLieuDeTravail();
	
    }
	
	@Test(priority=7)
	public void testCreerMonDossier () throws InterruptedException {
		
		instanceBodyPage = new BodyPage ( driver);
		 instanceBodyPage.testCreerMonDossier();
   }
	
	// FootPage 
	
	@Test(priority=8)
	public void testActualiteEmploi () throws InterruptedException {
		
		instanceFootPage = new FootPage ( driver);
		 instanceFootPage.testActualiteEmploi();
   }
	*/
	// PageEmployeur Particulier
	
	@Test(priority=9)
	public void testParticulier () throws InterruptedException {
		
		instanceParticulier = new Particulier ( driver);
		instanceParticulier.testParticulier();
   }
	
	@Test(priority=10)
	public void testRechercheProfils () throws InterruptedException {
		
		instanceParticulier = new Particulier ( driver);
		instanceParticulier.testRechercheProfils();
   }
	
	// Page Entreprise
	
	@Test(priority=11)
	public void testEntreprise () throws InterruptedException {
		
		instanceEntreprise = new Entreprise ( driver);
		instanceEntreprise.testEntreprise();
   }
	
	@Test(priority=11)
	public void testPublierUneOffre () throws InterruptedException {
		
		instanceEntreprise = new Entreprise ( driver);
		instanceEntreprise.testPublierUneOffre();
   }
}
