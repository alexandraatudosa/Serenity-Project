package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import page.HeaderPage;

public class HeaderSteps {
    HeaderPage headerPage;

    @Step
    public void verifyHeaderTitle(String title) {
        Assert.assertEquals(title, headerPage.getTitle());
    }

    @Step
    public void verifyURL(String url) {
        Assert.assertEquals(url, headerPage.getURL());
    }

    @Step
    public void verifyLogo() {
        Assert.assertTrue(headerPage.getLogo());
    }

    @Step
    public void verifyAccountExistance() {
        Assert.assertTrue(headerPage.getAccount());
        headerPage.clickAccount();
    }

    @Step
    public void verifyAccountText(String accountText) {
        Assert.assertEquals(accountText, headerPage.getAccountText());
    }

    @Step
    public void verifyLanguageNo(int languageNo) {
        Assert.assertEquals(headerPage.getListSize(), languageNo);
    }

    @Step
    public void changeDefaultLanguage() {
        headerPage.changeDefaultLanguage();
    }


    @Step
    public void verifySearchInput(){
        headerPage.getSearchInput();
    }

    @Step
    public void writeSearchForKeyword(String key) {
        headerPage.searchForKeyword(key);
        headerPage.clickOnSearchBtn();
        headerPage.getTitleText();
        Assert.assertTrue(headerPage.getTitleText().contains(headerPage.searchForKeyword(key)));
    }


}
