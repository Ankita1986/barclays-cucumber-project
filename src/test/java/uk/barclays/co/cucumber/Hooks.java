package uk.barclays.co.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.barclays.co.basepage.BasePage;
import uk.barclays.co.browserselector.BrowserSelector;
import uk.barclays.co.loadproperty.LoadProperty;
import uk.barclays.co.utility.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ankita
 */
public class Hooks  extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");

    String browser = loadProperty.getProperty("browser");

    @Before
    public void openBrowser(){
        browserSelector.selectorBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        Reporter.assignAuthor("Prime Testing", "Ankita Kaswala");
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        driver.quit();
    }

}
