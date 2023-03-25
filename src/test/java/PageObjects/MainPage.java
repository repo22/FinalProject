package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSubmitButton() {
        this.submitButton.click();
    }

    public void writeEmailToEmailField(String email){
        this.emailField.sendKeys(email);
    }

    // 7. Find by text - "What You'll Learn":
    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement learnHeader;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement learnButton;

    public void clickOnLearnButton() {
        this.learnButton.click();
    }

    public String getLearnHeader() {
        return this.learnHeader.getText();
    }

    // 8. Find by text - "Frequently Asked Questions":
    @FindBy(xpath = "//*[@id='questions']/div/h2")
    private WebElement faqHeader;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement questionsButton;

    public void clickOnQuestionButton() {
        this.questionsButton.click();
    }

    public String getFaqHeader() {
        return this.faqHeader.getText();
    }

    // 9. Find by text - "Instructors":
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement instructorsHeader;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorsButton;

    public void clickOnInstructorsButton() {
        this.instructorsButton.click();
    }

    public String getInstructorsHeader() {
        return this.instructorsHeader.getText();
    }
}