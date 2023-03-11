package org.example;
import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Assert;
import java.util.List;

public class StepDefinitions {
    WebDriver driver;
    private MainPage mainPage;
    private VirtualPage virtualPage;
    private HybridPage hybridPage;
    private InPersonPage inpersonPage;
    private FundamentalsPage;
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
    }

    // Click on submit button:
    @When("I click the submit button")
    public void i_click_the_submit_button() {
        mainPage.clickOnSubmitButton();
    }

    // Confirmation:
    @Then("The confirmation pop-up appears")
    public void theConfirmationPopUpAppear() {
        driver.switchTo().alert().accept();
    }

    // Failed susbcription & red margins on the email field:
    @Then("Subscription fails and the email field gets red margins")
    public void subscriptionFailsAndTheEmailFieldGetsRedMargins() {
    // Remove the extra single quote after the closing square bracket
        List<WebElement> subscriptionFailed = driver.findElements(By.xpath("//input[@type='email']//following-sibling::p[contains(text(), 'error')]"));
    }

    // Virtual page:
    @When("I select the read more button - Virtual")
    public void iSelectVirtualReadmoreButton() {
        Utils.scrollToElement(driver, virtualPage.getVirtualTitle());
        virtualPage.clickOnVirtualReadMore();
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
    }

    @Then("InPerson page opens")
    public void inpersonPageOpens() {
        driver.get("file:///C:/Users/repo22/IdeaProjects/AdProjfromGIT_Testing_ENV/Testing-Env/routes/in_person.html");
    }

    // 8. Find by text - "What You'll Learn":
    @When("I click on the What You'll Learn button")
    public void iClickTheLearnButton() {mainPage.clickOnLearnButton();}

    @Then("Page navigates to Learn The Fundamentals")
    public void thePageNavigatesToLearn() {
        Assert.assertEquals(mainPage.getLearnHeader(),"Learn The Fundamentals");
    }

    // 9. Find by text - "Frequently Asked Questions":
    @When("I click on the Questions button")
    public void iClickTheQuestionButton() {mainPage.clickOnQuestionButton();}

    @Then("Page navigates to Faq")
    public void thePageNavigatesToFaq() {
        Assert.assertEquals(mainPage.getFaqHeader(),"Frequently Asked Questions");
    }

    // 10. Find by text - "Instructors":
    @When("I click on the Instructors button")
    public void iClickTheInstructorsButton() {mainPage.clickOnInstructorsButton();}

    @Then("Page navigates to Our Instructors")
    public void thePageNavigatesToInstructors() {
        Assert.assertEquals(mainPage.getInstructorsHeader(),"Our Instructors");
    }

    // 11. Fundamentals page:
    @When("I select the read more button - What You'll Learn")
    public void iSelectWhatYoullLearnReadmoreButton() {
        Utils.scrollToElement(driver, FundamentalsPage.getWhatYoullLearnTitle());
        FundamentalsPage.clickOnWhatYoullLearnReadmore();
    }

    @Then("Fundamentals page opens")
    public void fundamentalsPageOpens() {
        driver.get("file:///C:/Users/repo22/IdeaProjects/AdProjfromGIT_Testing_ENV/Testing-Env/routes/fundamentals.html");
    }

    // Close browser after each scenario run:
    /*
    @After
    public void cleanUp() {
        driver.quit();
    }
    */
}