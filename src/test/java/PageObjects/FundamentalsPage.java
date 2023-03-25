package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundamentalsPage {

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]")
    private WebElement fundamentalsTitle;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement fundamentalsReadMore;

    public FundamentalsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getFundamentalsTitle() {
        return fundamentalsTitle;
    }

    public void clickOnFundamentalsReadMore() {
        this.fundamentalsReadMore.click();
    }
}





