package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;


@DefaultUrl("http://qa2.dev.evozon.com/customer/account/")
public class HeaderPage extends AbstractPage{

    @FindBy(css="p.welcome-msg")
    private WebElementFacade greetMessage;

    @FindBy(css="head > title")
    private WebElementFacade homeTitle;

    @FindBy(className = "logo")
    private WebElementFacade headerLogo;

    @FindBy(className = "skip-account")
    private WebElementFacade headerAccount;

    @FindBy(css = "#select-language > option")
    private List<WebElementFacade> headerLanguage;

    @FindBy(id="select-language")
    private WebElementFacade languageDropdown;

    @FindBy(id = "search")
    private WebElementFacade searchInput;

    @FindBy(css=".search-button")
    private  WebElementFacade searchButton;

    @FindBy(css = ".page-title")
    private WebElementFacade pageTitleString;

    public String getGreetMessage(){
        return greetMessage.getText();
    }

    public String getTitle() {
        return getDriver().getTitle();
    }

    public String getURL() {
        return getDriver().getCurrentUrl();
    }

    public boolean getLogo() {
        return headerLogo.isDisplayed();
    }

    public boolean getAccount() {
        return headerAccount.isDisplayed();
    }

    public String getAccountText() {
        return headerAccount.getText();
    }

    public void clickAccount() {
        headerAccount.click();
    }

    public int getListSize() {
        return headerLanguage.size();
    }

    public void changeDefaultLanguage() {
        languageDropdown.selectByVisibleText("French");
        Assert.assertThat(languageDropdown.getSelectedVisibleTextValue(), is("French"));
    }
    /*
        Search
     */

    public void getSearchInput() {
        searchInput.clear();
        searchInput.click();
    }

    public String searchForKeyword(String keyword) {
        searchInput.type(keyword);
        return searchInput.getText();
    }

    public void clickOnSearchBtn() {
        searchButton.click();
    }

    public String getTitleText() {
        return pageTitleString.getText().toLowerCase();
    }




}
