package newassignment.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class coreActions {

    public final WebDriver bot;
    protected final WebDriverWait wait;

    protected coreActions(WebDriver bot) {

        this.bot = bot;
        this.wait = new WebDriverWait(bot, 10);
    }

    protected boolean visibility(By element) {
        boolean visible = true;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (TimeoutException te) {
            visible = false;
        }
        return visible;
    }

    protected boolean verifyProductRemoval(By element) {
        boolean isProdVisible = false;
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (TimeoutException to) {
            isProdVisible = true;
        }
        return isProdVisible;
    }


    protected void entertext(By element, String text) {
        bot.findElement(element).sendKeys(text);
    }

    protected void click(By element) {
        bot.findElement(element).click();
    }

    protected String gettext(By element) {
        return bot.findElement(element).getText();
    }

    public void sleep(double sec) {
        try {
            Thread.sleep((long) sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
