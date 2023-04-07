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

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement writeCountryField;

    public void writeCountryField(String country) {
        this.writeCountryField.sendKeys(country);
    }

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement writeCityField;

    public void writeCityField(String city) {
        this.writeCityField.sendKeys(city);
    }

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement writePostCodeField;

    public void writePostCodeField(String postCode) {
        this.writePostCodeField.sendKeys(postCode);
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement secondNextButton;

    public void clickOnSecondNextButton() {
        this.secondNextButton.click();
    }

    //Scenario: #14. Enrollment flow 3/5: Course options:
    public void fillInContactInformationWithValidData() { // Method to fill in Enrollment flow 2/5
        writeEmailField("jdoe@yahoo.com");
        writePhoneField("+40744311223");
        writeCountryField("Sweden");
        writeCityField("Malmo");
        writePostCodeField("500168");
        clickOnSecondNextButton();
    }

    @FindBy(xpath = "//*[@id=\"flexRadioButton3\"]")
    private WebElement thirdCourseButton;

    public void selectTheThirdCourseButton() {
        this.thirdCourseButton.click();
    }

    @FindBy(xpath = "//*[@id=\"flexRadioButton4\"]")
    private WebElement forthCourseButton;

    public void selectTheForthCourseButton() {
        this.forthCourseButton.click();
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement thirdNextButton;

    public void clickTheThirdNextButton() {
        this.thirdNextButton.click();
    }

    //Scenario: #15. Enrollment flow 4/5: Payment information:
    public void fillInCourseOptionsWithValidData() { // Method to fill in Enrollment flow 3/5
        selectTheThirdCourseButton();
        selectTheForthCourseButton();
        clickTheThirdNextButton();
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement writecardHolderField;

    public void writecardHolderField(String cardHolder) {
        this.writecardHolderField.sendKeys(cardHolder);
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement writecardNumberField;

    public void writecardNumberField(String cardNumber) {
        this.writecardNumberField.sendKeys(cardNumber);
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement writecvcField;

    public void writecvcField(String cvc) {
        this.writecvcField.sendKeys(cvc);
    }

    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement monthButton;

    public void clickTheMonthButton() {
        this.monthButton.click();
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/div/div[2]/select[1]/option[10]")
    private WebElement septemberButton;

    public void selectTheSeptemberButton() {
        this.septemberButton.click();
    }

    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement yearButton;

    public void clickTheYearButton() {
        this.yearButton.click();
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/div/div[2]/select[2]/option[5]")
    private WebElement forthYearButton;

    public void selectTheForthYearButton() {
        this.forthYearButton.click();
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement forthNextButton;

    public void clickTheForthNextButton() {
        this.forthNextButton.click();
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement returnToHomepageButton;

    public void selectTheReturnToHomepageButton() {
        this.returnToHomepageButton.click();
    }

    //Scenario: #17. Enrollment flow - bug on second step:
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement writeWrongEmailField;

    public void writeWrongEmailField(String email) {
        this.writeEmailField.sendKeys(email);
    }

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement writeWrongPhoneField;

    public void writeWrongPhoneField(String phone) {
        this.writePhoneField.sendKeys(phone);
    }

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement writeWrongPostCodeField;

    public void writeWrongPostCodeField(String postCode) {
        this.writePostCodeField.sendKeys(postCode);
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentInformationHeader;

    public String getPaymentInformationHeader() {
        return paymentInformationHeader.getText();
    }

}
