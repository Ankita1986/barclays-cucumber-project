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
public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @FindBy(xpath ="//h2[contains(text(),'Register for Online Banking')]" )
    WebElement _welcomeText;

    @FindBy (xpath = "//body//div[2]//div[2]//button[1]")
    WebElement startButton;

    @FindBy(xpath = "//h4[contains(text(),'Your details')]")
    WebElement registerPageText;

    public String getWelcomeText() {
        Reporter.addStepLog("Getting text from : " + _welcomeText.toString());
        log.info("Getting text from " + _welcomeText.toString());
        return getTextFromElement(_welcomeText);

    }

    public void clickOnStartBtn(){
        Reporter.addStepLog("Clicking on start button : "+startButton.toString());
        clickOnElement(startButton);
        log.info("Clicking on start button : "+startButton.toString());
    }
    public String getRegisterPageText(){
        Reporter.addStepLog("Getting text from : " +registerPageText.toString());
        log.info("Getting text from : " +registerPageText.toString());
        return getTextFromElement(registerPageText);
    }

}
