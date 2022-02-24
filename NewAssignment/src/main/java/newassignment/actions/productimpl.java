package newassignment.actions;

import newassignment.pages.products;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class productimpl extends coreActions {

    public productimpl(WebDriver bot){
        super(bot);
    }

    public selectproductimpl selectProduct() {
        sleep(2);
        visibility(products.prod);
        click(products.selected_Product);
        return new selectproductimpl(bot);
    }

    public void addtocart(){
        sleep(1);
        visibility(products.addtocartbtn);
        click(products.addtocartbtn);
    }

    public cartimpl opencart() {
        sleep(1);
        visibility(products.cart);
        click(products.cart);
        return new cartimpl(bot);
    }
}
