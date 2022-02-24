package newassignment.actions;

import io.qameta.allure.Step;
import newassignment.pages.loginpage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginimpl extends coreActions {
    public loginimpl(WebDriver bot) {
        super(bot);
    }

    @Step("Verify that correct site is opened")
    public void verifySite(){
        sleep(2);
        Assert.assertEquals(bot.getTitle(),"Swag Labs","verified site");
        }

    @Step("enter username")
    public void enterUsername(String uname) {
        visibility(loginpage.username);
        entertext(loginpage.username, uname);
    }

    @Step("enter password")
    public void enterPassword(String pass) {
        visibility(loginpage.password);
        entertext(loginpage.password, pass);
    }

    @Step("click login")
    public productimpl login() {
        visibility(loginpage.loginbtn);
        click(loginpage.loginbtn);
        sleep(1);
        return new productimpl(bot);
    }

}

