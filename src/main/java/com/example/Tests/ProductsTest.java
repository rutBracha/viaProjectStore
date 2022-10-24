package com.example.VIA.Tests;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProductsTest {
    @Test
    public void insert(){
        WebElement cart = driver.findElement(By.id("cartur"));
        cart.click();
    }
    public void testNumberOfItems() {
        List<WebElement> items = driver.findElements(By.className("success"));
        if (items.size() == 1)
            System.out.println("Number of items in the card is 1");
    else
            System.out.println("Number of items in the card is not 1");
        }
    public void testPrice(){
        list<WebElement> priceList = driver.findElements(By.tag_Name("td"));
        if(priceList.text(2)==650)
            System.out.println("The price of the selected phone is 650");
     else
            System.out.println("The price of the selected phone is not 650");
        }

    public void checkName(){
        list<WebElement> namesList = driver.findElements(By.tag_Name("td"));
        if(namesList.text(1)=="Nexus 6")
            System.out.println("The title of the selected phone = Nexus 6");
     else
            System.out.println("The title of the selected phone 1=Nexus 6");
        }

    }

