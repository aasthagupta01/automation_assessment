package pagetest;
import Main.HomeTest;
import config.properties;
import io.qameta.allure.*;
import newassignment.actions.*;
import org.testng.annotations.Test;

@Test
public class logintest extends HomeTest {
    productimpl product;
    cartimpl cart;
    selectproductimpl selectproduct;
    checkoutimpl checkout;

    @Test()
    @Description("RUNNING ALL TEST CASES")
    @Owner("Aastha Gupta")
    @Story("STORY 1")
    @Feature("FEATURE 1")
    @Severity(SeverityLevel.CRITICAL)
    public void testlogin() {
        product = new productimpl(bot);
        cart = new cartimpl(bot);
        checkout = new checkoutimpl(bot);

        displaymsg("verify correct site is opened");
        loginobj.verifySite();

        displaymsg("entered username");
        loginobj.enterUsername(properties.username);

        displaymsg("entered password");
        loginobj.enterPassword(properties.password);

        displaymsg("login");
        product = loginobj.login();

        displaymsg("select product");
        selectproduct = product.selectProduct();

        displaymsg("save details");
        selectproduct.productdetails();

       displaymsg("adding product to cart");
        selectproduct.addtocart();

       displaymsg("open cart");
       selectproduct.opencart();

       displaymsg("verify product");
       cart.verifyProductName();

       displaymsg("verify price");
       cart.verifyPrice();

        displaymsg("click checkout");
        checkout= cart.clickcheckoutbtn();

        displaymsg("fill details");
        displaymsg("entering first name");
        checkout.enterfname(properties.firstName);

        displaymsg("entering last name");
        checkout.enterlname(properties.lastName);

        displaymsg("entering zip code");
        checkout.entercode(properties.postalCode);

        displaymsg("continue");
        checkout.checkout();

        displaymsg("click finish");
        checkout.clickfinish();

        displaymsg("click back home");
        checkout.clickback();

        displaymsg("checking cart again");
        product.opencart();

        displaymsg("check if product is removed or not");
        cart.checkproductremoved();
    }
}




