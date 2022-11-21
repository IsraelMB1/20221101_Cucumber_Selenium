package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    private By titleComicsLocator = By.id("menu-item-2008");


    //public String getTitleHomePage() {
    //    return titleHomePage;
    //}
    //public By getTitleComicsLocator() {
    //    return titleComicsLocator;
    //}

    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean homePageisDisplayed() throws Exception{
        return this.getTitle().equals(titleHomePage);
    }

    public void clickOnTitleComics() throws Exception {
        this.click(titleComicsLocator);
    }


}
