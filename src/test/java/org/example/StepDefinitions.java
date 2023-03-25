package org.example;
import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import java.util.List;

public class StepDefinitions {
    WebDriver driver;
    private MainPage mainPage;
    private VirtualPage virtualPage;
    private HybridPage hybridPage;
    private InPersonPage inpersonPage;
    private FundamentalsPage fundamentalsPage;
    private EnrollmentPage enrollmentPage;
    private List<WebElement> subscription;
    private List<WebElement> subscriptionFailed;
    private String xpath;

    public StepDefinitions() {
        System.setProperty("webdriver.gecko.driver", "C:/Users/repo22/IdeaProjects/FinalProject/geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        virtualPage = new VirtualPage(driver);
        hybridPage = new HybridPage(driver);
        inpersonPage = new InPersonPage(driver);
        fundamentalsPage = new FundamentalsPage(driver);
        enrollmentPage = new EnrollmentPage(driver);
    }

    // Main page:
    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        driver.get("file:///C:/Users/repo22/IdeaProjects/AdProjfromGIT_Testing_ENV/Testing-Env/index.html");
    }

    // Add an email address:
    @When("I write the email address of {string}")
    public void i_write_the_email_address_of(String string) {
        mainPage.writeEmailToEmailField(string);
        Utils.waitForElementToLoadMillis(500);
    }

    // Click on submit button:
    @When("I click the submit button")
    public void i_click_the_submit_button() {
        mainPage.clickOnSubmitButton();
        Utils.waitForElementToLoadSeconds(3);
    }

    // Confirmation:
    @Then("The confirmation pop-up appears")
    public void theConfirmationPopUpAppear() {
        driver.switchTo().alert().accept();
        Utils.waitForElementToLoadSeconds(3);
    }

    // Failed susbcription & red margins on the email field:
    @Then("Subscription fails and the email field gets red margins")
    public void subscriptionFailsAndTheEmailFieldGetsRedMargins() {
        // Remove the extra single quote after the closing square bracket
        List<WebElement> subscriptionFailed = driver.findElements(By.xpath("//input[@type='email']//following-sibling::p[contains(text(), 'error')]"));
        Utils.waitForElementToLoadMillis(500);
    }

    // Virtual page:
    @When("I select the read more button - Virtual")
    public void iSelectVirtualReadmoreButton() {
        Utils.scrollToElement(driver, virtualPage.getVirtualTitle());
        virtualPage.clickOnVirtualReadMore();
        Utils.waitForElementToLoadMillis(500);
    }

    @Then("Virtual page opens")
    public void virtualPageOpens() {
        driver.get("file:///C:/Users/repo22/IdeaProjects/AdProjfromGIT_Testing_ENV/Testing-Env/routes/virtual.html");
    }

    // Hybrid page:
    @When("I select the read more button - Hybrid")
    public void iSelectHybridReadmoreButton() {
        Utils.scrollToElement(driver, hybridPage.getHybridTitle());
        hybridPage.clickOnHybridReadMore();
        Utils.waitForElementToLoadMillis(500);
    }

    @Then("Hybrid page opens")
    public void hybridPageOpens() {
        driver.get("file:///C:/Users/repo22/IdeaProjects/AdProjfromGIT_Testing_ENV/Testing-Env/routes/hybrid.html");
    }

    // InPerson page:
    @When("I select the read more button - InPerson")
    public void iSelectInpersonReadmoreButton() {
        Utils.scrollToElement(driver, inpersonPage.getInpersonTitle());
        inpersonPage.clickOnInpersonReadMore();
        Utils.waitForElementToLoadMillis(500);
    }

    @Then("InPerson page opens")
    public void inpersonPageOpens() {
        driver.get("file:///C:/Users/repo22/IdeaProjects/AdProjfromGIT_Testing_ENV/Testing-Env/routes/in_person.html");
    }

    // 7. Find by text - "What You'll Learn":
    @When("I click on the What You'll Learn button")
    public void iClickTheLearnButton() {
        mainPage.clickOnLearnButton();
        Utils.waitForElementToLoadMillis(500);
    }

    @Then("Page navigates to Learn The Fundamentals")
    public void thePageNavigatesToWhatYoullLearn() {
    }

    // 8. Find by text - "Frequently Asked Questions":
    @When("I click on the Questions button")
    public void iClickTheQuestionButton() {
        mainPage.clickOnQuestionButton();
        Utils.waitForElementToLoadMillis(500);
    }

    @Then("Page navigates to Faq")
    public void thePageNavigatesToFaq() {
        Assert.assertEquals(mainPage.getFaqHeader(), "Frequently Asked Questions");
    }

    // 9. Find by text - "Instructors":
    @When("I click on the Instructors button")
    public void iClickTheInstructorsButton() {
        mainPage.clickOnInstructorsButton();
        Utils.waitForElementToLoadMillis(500);
    }

    @Then("Page navigates to Our Instructors")
    public void thePageNavigatesToInstructors() {
        Assert.assertEquals(mainPage.getInstructorsHeader(), "Our Instructors");
    }

    // 10. Fundamentals page:
    @And("Page scrolls to Learn The Fundamentals")
    public void iSelectFundamentalsReadmoreButton() {
        Utils.scrollToElement(driver, fundamentalsPage.getFundamentalsTitle());
    }

    @When("I select the read more button - Fundamentals")
    public void iClickFundamentalsReadmoreButton() {
        fundamentalsPage.clickOnFundamentalsReadMore();
        Utils.waitForElementToLoadMillis(500);
    }

    @Then("Fundamentals page opens")
    public void fundamentalsPageOpens() {
        Assert.assertEquals(driver.getTitle(), "Fundamentals");
    }

    // 11. Enrollment page:
    @When("I select Start The Enrollment button")
    public void iSelectEnrollmentButton() {
        Utils.scrollToElement(driver, enrollmentPage.getEnrollmentTitle());
        enrollmentPage.clickOnEnrollmentButton();
    }

    @Then("Enrollment page opens")
    public void enrollmentPageOpens() {
        driver.get("file:///C:/Users/repo22/IdeaProjects/AdProjfromGIT_Testing_ENV/Testing-Env/routes/enrollment.html");
    }

    // Enrollment page:
    @Given("I am on the Enrollment page")
    public void iAmOnTheEnrollmentPage() {
        driver.get("file:///C:/Users/repo22/IdeaProjects/AdProjfromGIT_Testing_ENV/Testing-Env/routes/enrollment.html");
    }

    // 12. Enrollment flow 1/5:
    @When("I write the first name {string}")
    public void i_write_the_first_name_of(String string) {
        enrollmentPage.writeFirstNameField(string);
        Utils.waitForElementToLoadMillis(500);
    }

    @And("I write the last name {string}")
    public void i_write_the_last_name_of(String string) {
        enrollmentPage.writeLastNameField(string);
        Utils.waitForElementToLoadMillis(500);
    }

    @And("I write the username {string}")
    public void i_write_the_username_of(String string) {
        enrollmentPage.writeUsernameField(string);
        Utils.waitForElementToLoadMillis(500);
    }

    @And("I write the password {string}")
    public void i_write_the_password_of(String string) {
        enrollmentPage.writePasswordField(string);
        Utils.waitForElementToLoadMillis(500);
    }

    @And("I write the same password {string} for confirmation")
    public void i_write_the_same_password_of(String string) {
        enrollmentPage.writeSamePasswordField(string);
        Utils.waitForElementToLoadMillis(500);
    }

    @And("I click the next button")
    public void i_click_the_next_button() {
        enrollmentPage.clickOnNextButton();
        Utils.waitForElementToLoadMillis(500);
    }

    @Then("Contact information page opens")
    public void contactInformationPageOpens() {
        Assert.assertEquals(driver.getTitle(), "Contact information");
    }

    // Scenario: #13. Enrollment flow 2/5: Contact information:
    @Given("I am on the contact information page") // To fill in Enrollment flow 1/5
    public void iAmOnTheContactInformationPage() {
        driver.get("file:///C:/Users/repo22/IdeaProjects/AdProjfromGIT_Testing_ENV/Testing-Env/routes/enrollment.html");
        enrollmentPage.fillInPersonalInformationWithValidData();
    }

    @When("I write the email {string}")
    public void i_write_the_email_of(String string) {
        enrollmentPage.writeEmailField(string);
        Utils.waitForElementToLoadMillis(500);
    }

    @And("I write the phone {string}")
    public void i_write_the_phone_of(String string) {
        enrollmentPage.writePhoneField(string);
        Utils.waitForElementToLoadMillis(500);
    }


    /*
        // Close browser after each scenario run:
    @After
    public void cleanUp() {
        driver.quit();
    }
     */
}