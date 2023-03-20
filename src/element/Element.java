package element;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import singleton.SingletonBaseClass;

import java.time.Duration;

public class Element extends SingletonBaseClass {
    /*
    * This class is used to wrap the WebElement class and implement the fluent design pattern.
    * Every time we create an element from a Page Object Model class, we won't make any search until we perform an action on it.
     */

    private String locator;
    private String selector;

    public Element() {
    }

    public Element(String locator, String selector) {
        this.locator = locator;
        this.selector = selector;
    }

    public String getLocator() {
        return locator;
    }

    public String getSelector() {
        return selector;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String toString() {
        return "Locator: " + locator + " Selector: " + selector;
    }

    // Question 3. Return a web element with fluent wait
    public WebElement getElement() {
        Wait<WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        switch (selector) {
            case "id":
                return wait.until(driver -> driver.findElement(By.id(locator)));
            case "xpath":
                return wait.until(driver -> driver.findElement(By.xpath(locator)));
            case "css":
                return wait.until(driver -> driver.findElement(By.cssSelector(locator)));
            case "name":
                return wait.until(driver -> driver.findElement(By.name(locator)));
            case "linkText":
                return wait.until(driver -> driver.findElement(By.linkText(locator)));
            case "partialLinkText":
                return wait.until(driver -> driver.findElement(By.partialLinkText(locator)));
            case "tagName":
                return wait.until(driver -> driver.findElement(By.tagName(locator)));
            case "className":
                return wait.until(driver -> driver.findElement(By.className(locator)));
            default:
                return null;
        }
    }

    public Element click() {
        getElement().click();
        return this;
    }

    public Element sendKeys(String text) {
        getElement().sendKeys(text);
        return this;
    }

    public Element clear() {
        getElement().clear();
        return this;
    }

    public Element hover() {
        Actions action = new Actions(getDriver());
        action.moveToElement(getElement()).build().perform();
        return this;
    }

    public String getText() {
        return getElement().getText();
    }

    public String getAttribute(String attribute) {
        return getElement().getAttribute(attribute);
    }

    public boolean isDisplayed() {
        return getElement().isDisplayed();
    }

    public boolean isEnabled() {
        return getElement().isEnabled();
    }

    public boolean isSelected() {
        return getElement().isSelected();
    }

    public String getCssValue(String cssValue) {
        return getElement().getCssValue(cssValue);
    }

    public String getTagName() {
        return getElement().getTagName();
    }
}
