package newassignment.actions;

import newassignment.pages.cart;
import newassignment.pages.selectproduct;
import org.openqa.selenium.WebDriver;

public class selectproductimpl extends coreActions{

    public selectproductimpl(WebDriver bot){
        super(bot);
    }

    public void productdetails(){
        sleep(2);
        gettext(selectproduct.Product_Name);
        gettext(selectproduct.Product_Price);
    }

    public void addtocart(){
        cart.productname=gettext(selectproduct.Product_Name);
        cart.productprice=gettext(selectproduct.Product_Price);
        click(selectproduct.Add_To_Cart_Button);
    }

    public cartimpl opencart(){
        click(selectproduct.Cart_Button);
        return new cartimpl(bot);
    }
}
