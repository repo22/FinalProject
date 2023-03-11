package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundamentalsPage {
    private WebElement WhatYoullLearnReadMore;

    public void clickOnWhatYoullLearnReadmore() {
        this.WhatYoullLearnReadMore.click();
    }

    public WebElement getWhatYoullLearnTitle() {
        return fundamentalsTitle;
    }

    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/h2")
    private  WebElement fundamentalsTitle;

    public FundamentalsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/a")
    private  WebElement whatyoulllearnReadMore;
}



