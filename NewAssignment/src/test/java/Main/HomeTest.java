package Main;

import newassignment.Bot;
import newassignment.actions.loginimpl;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class HomeTest {
    protected WebDriver bot;
    public static final String url="https://www.saucedemo.com/";

    protected loginimpl loginobj;
    @BeforeClass
    public void browser(){
        bot= new Bot().getBot();
        bot.get(url);
        loginobj = new loginimpl(bot);
    }

    public static void displaymsg(String display){
        Logger.step(display);

    }

    @AfterClass
    public void close(){
        bot.quit();
    }
}
