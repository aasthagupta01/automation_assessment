package newassignment.actions;

import newassignment.pages.checkoutform;
import org.openqa.selenium.WebDriver;

import java.net.PortUnreachableException;

public class checkoutimpl extends coreActions{

    public checkoutimpl(WebDriver bot){
        super(bot);
    }

    public void enterfname(String first){
        visibility(checkoutform.fname);
        entertext(checkoutform.fname,first);
        sleep(1);
    }

    public void enterlname(String last){
        visibility(checkoutform.lname);
        entertext(checkoutform.lname,last);
        sleep(1);
    }

    public void entercode(String code){
        visibility(checkoutform.zipcode);
        entertext(checkoutform.zipcode,code);
        sleep(1);
    }

    public void checkout(){
        click(checkoutform.continuebtn);
        sleep(1);
    }

    public void clickfinish(){
        click(checkoutform.finish);
    }

    public void clickback(){
        click(checkoutform.back);
    }
}
