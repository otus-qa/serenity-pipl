package com.pipl.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultPage extends PageObject {

    @FindBy(id="match_results")
    WebElementFacade results;

    public boolean resultsAreDisplayed() {
        results.waitUntilVisible();
        return results.isDisplayed();
    }

    public boolean titleIsDisplayed() {
        return $("#match_results .title-header").isDisplayed();
    }
}
