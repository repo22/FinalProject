package PageObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentPage {
    public WebElement getEnrollmentTitle() {
        return enrollmentTitle;
    }

    @FindBy(xpath = "/html/body/section[1]/div/div/div/p")
    private  WebElement enrollmentTitle;

    public EnrollmentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private  WebElement enrollmentButton;

    public void clickOnEnrollmentButton() {
        this.enrollmentButton.click();
    }

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement writeFirstNameField;

    public void writeFirstNameField(String firstName) {
        this.writeFirstNameField.sendKeys(firstName);
    }

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement writeLastNameField;

    public void writeLastNameField(String lastName) {
        this.writeLastNameField.sendKeys(lastName);
    }

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement writeUsernameField;

    public void writeUsernameField(String username) {
        this.writeUsernameField.sendKeys(username);
    }

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement writePasswordField;

    public void writePasswordField(String password) {
        this.writePasswordField.sendKeys(password);
    }

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement writeSamePasswordField;

    public void writeSamePasswordField(String password) {
        this.writeSamePasswordField.sendKeys(password);
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;

    public void clickOnNextButton() {
        this.nextButton.click();
    }

    // Scenario: #13. Enrollment flow 2/5: Contact information:
    public void fillInPersonalInformationWithValidData() { // Method to fill in Enrollment flow 1/5
        writeFirstNameField("John");
        writeLastNameField("Doe");
        writeUsernameField("jdow");
        writePasswordField("JohnsP@ss");
        writeSamePasswordField("JohnsP@ss");
        clickOnNextButton();
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement writeEmailField;

    public void writeEmailField(String email) {
        this.writeEmailField.sendKeys(email);
    }

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement writePhoneField;

    public void writePhoneField(String phone) {
        this.writePhoneField.sendKeys(phone);
    }


    // 12. Enrollment flow 1/5:


}
