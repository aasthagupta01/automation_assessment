package newassignment.actions;

import newassignment.pages.cart;
import newassignment.pages.products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class cartimpl extends coreActions {

    public cartimpl(WebDriver bot) {
        super(bot);
    }

    public void verifyProductName(){
        System.out.println("verifying name");
        cart.pname = gettext(cart.cartproductname);
       Assert.assertEquals(cart.productname, cart.pname);
       System.out.println("name verified");
    }
    public void verifyPrice(){
        System.out.println("verifying price");
        cart.pprice = gettext(cart.cartproductprice);
        Assert.assertEquals(cart.productprice,cart.pprice);
        System.out.println("price verified");
    }

    public checkoutimpl clickcheckoutbtn(){
        click(cart.checkoutbtn);
        return new checkoutimpl(bot);
    }

    public void checkproductremoved(){
        verifyProductRemoval(By.id(cart.productname));
        System.out.println("product removed successfully");
    }
}
