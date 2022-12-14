package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.HomePage;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends TestBase{

    //private ChromeDriver driver = Hooks.getDriver();
    //private WebDriver driver = Hooks.getDriver();

    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void El_usuario_se_encuentra_en_la_pagina_Home_de_imalittletester() throws Throwable {
        //System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.get("https://imalittletester.com/");
        //driver.manage().window().maximize();
        //String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        Assert.assertTrue(homePage.homePageisDisplayed());
    }

    @When("^Hace click sobre el texto THE LITTLE TESTER COMICIS$")
    public void Hace_click_sobre_el_texto_THE_LITTLE_TESTER_COMICS() throws Throwable {
        //WebElement titleComicsLocator = driver.findElement(homePage.getTitleComicsLocator());
        //titleComicsLocator.click();
        homePage.clickOnTitleComics();
    }

    @Then("^Se debe redireccionar a la pantalla Comics$")
    public void Se_debe_redireccionar_a_la_pantalla_Comics() throws Throwable {
        //WebElement pageTitleLocator = driver.findElement(comicsPage.getPageTitleLocator());
        Assert.assertTrue ("No se redirecciono correctamente a la pagina de Comics", comicsPage.isTitleComicsDisplayed());
        //assert de JUnit la condicion tiene que ser verdadeta , si no el test falla
        //Assert.assertEquals(comicsPage.getTitlePage(),pageTitleLocator.getText());
        //driver.quit();
    }

}
