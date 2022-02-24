package newassignment.pages;

import org.openqa.selenium.By;

public class selectproduct {
    public static final By Selected_Product = By.xpath("//img[@alt= 'Sauce Labs Backpack']");
    public static final By Cart_Button = By.xpath("//a[@class= 'shopping_cart_link']");
    public static final By Product_Name = By.xpath("//div[@class= 'inventory_details_name large_size']");
    public static final By Product_Price = By.xpath("//div[@class= 'inventory_details_price']");
    public static final By Add_To_Cart_Button = By.id("add-to-cart-sauce-labs-backpack");
    //public static final By Cart_Button = By.xpath("//a[@class= 'shopping_cart_link']");
}
