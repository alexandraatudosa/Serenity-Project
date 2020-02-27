package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.HeaderSteps;

@RunWith(SerenityRunner.class)
public class HeaderTest extends BaseTest {
    @Steps
    HeaderSteps headerSteps;

    @Test
    public void checkTitle() {
        headerSteps.verifyHeaderTitle("Madison Island");
    }

    @Test
    public void checkURL() {
        headerSteps.verifyURL("http://qa2.dev.evozon.com/");
    }

    @Test
    public void checkLogo() {
        headerSteps.verifyLogo();
    }

    @Test
    public void checkAccount() {
        headerSteps.verifyAccountExistance();
        headerSteps.verifyAccountText("ACCOUNT");
    }

    @Test
    public void checkNumberOfLanguages() {
        headerSteps.verifyLanguageNo(3);
        headerSteps.changeDefaultLanguage();
    }

    @Test
    public void clearSearchInput() {
        headerSteps.verifySearchInput();
    }

    @Test
    public void searchForKeyword() {
        headerSteps.writeSearchForKeyword("woman");
    }

}
