package PageObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage {
    public WebElement getSeleniumTitle() {
        return seleniumTitle;
    }

    @FindBy(xpath = "/html/body/section[5]/div/div/div[1]")
    private  WebElement seleniumTitle;

    public SeleniumPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement seleniumReadMore;

    public void clickOnSeleniumReadMore() {
        this.seleniumReadMore.click();
    }

    @FindBy(xpath = "/html/body/section[5]/div/div/div[1]/a")
    private WebElement seleniumReadMoreButton;

    public void selectTheSeleniumReadMoreButton() {
        this.seleniumReadMoreButton.click();
    }
}
