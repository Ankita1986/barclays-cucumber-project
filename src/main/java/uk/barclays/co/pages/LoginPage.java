package uk.barclays.co.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.barclays.co.utility.Utility;

/**
 * Created by Ankita
 */
public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy (xpath = "//strong[contains(text(),'Quick, safe and convenient')]")
    WebElement _welcomeText;

    @FindBy(xpath = "//input[@name='surname']")
    WebElement surName;

    @FindBy(xpath = "//button[contains(text(),'Next Step')]")
    WebElement nextStep;

    @FindBy(xpath = "//body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]")
    WebElement errorMessage;

    public String getWelcomeText(){
        Reporter.addStepLog("Getting text from : " + _welcomeText.toString());
        log.info("Getting text from " +_welcomeText.toString());
        return getTextFromElement(_welcomeText);
    }

    public void enterSurname(String surname){
        Reporter.addStepLog("Entering surname : " + surname + "to surname field: " + surName.toString());
        sendTextToElement(surName,surname);
        log.info("Entering surname : " + surname + "to surname field: " + surName.toString());
    }

    public void clickOnNextStepBtn(){
        Reporter.addStepLog("clicking on next step button : " +nextStep.toString());
        clickOnElement(nextStep);
        log.info("clicking on next step button : " +nextStep.toString());
    }

    public String getErrorMessage(){
        Reporter.addStepLog("Getting text from : " + errorMessage.toString());
        log.info("Getting text from " +errorMessage.toString());
        return getTextFromElement(errorMessage);
    }



}
