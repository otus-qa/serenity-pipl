package com.pipl.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://pipl.com")
public class SearchPage extends PageObject {

    @FindBy(name = "q") //css input[name='q']
    WebElementFacade searchInput;

    @FindBy(css = "div>input[type='submit']") //css: div>input[type='submit']
    WebElementFacade searchButton;

    public void search(String text) {
        searchInput.type(text);
        $("div>input[type='submit']").click();
//      alternative method:  searchButton.click();
    }

    public void inputToSearchField(String text) {
        searchInput.type(text);
    }

    public void clickOnInput() {
        searchInput.click();
    }

    public void clickOnSubmitButton() {
        searchButton.click();
    }
}
