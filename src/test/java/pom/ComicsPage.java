package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComicsPage extends BasePage{


    private By pageTitleLocator = By.className("page-title");
    private String titlePage = "Category: comics";

    //public By getPageTitleLocator() {
    //    return pageTitleLocator;
    //}
    //public String getTitlePage() {
    //    return titlePage;
    //}

    public ComicsPage(WebDriver driver){
        super(driver);
    }
    public boolean isTitleComicsDisplayed() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);
    }

}
