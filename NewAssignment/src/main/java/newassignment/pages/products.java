package newassignment.pages;

import org.openqa.selenium.By;

public class products {
    public static By addtocartbtn = By.id("add-to-cart-sauce-labs-backpack");
   public static final By prod = By.xpath("//img[@alt='Sauce Labs Backpack']");
    public static final By selected_Product = By.xpath("//img[@alt= 'Sauce Labs Backpack']");
  // public static final By product = By.className("inventory_item_img");
    //public static final By prod = By.className("inventory_item_name");
    //public static final By prod = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    //public static final By prod = By.xpath("*[@id='item_4_img_link']/img");
    //public static By prodname = By.className("inventory_details_name large_size");
    public static By productname = By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");
    public static By price = By.className("inventory_details_price");
    public static final By cart = By.xpath("//a[@class= 'shopping_cart_link']");

}
