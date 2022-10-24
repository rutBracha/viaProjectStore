package com.example.VIA.Pges;

public class StorePage {
    WebDriver driver;
    WebElement loginLink;
    WebElement loginUsername;
    WebElement loginPassword;
    public StorePage(){
    driver = BrowserPage.getDriver();
        driver.navigate().to("https://www.demoblaze.com/");
}
    public void navigateToLogin(String userName, String password) {
        loginLink = driver.findElement(By.id("login2"));
        loginLink.click();
        loginUsername = driver.findElement(By.id("loginusername"));
        loginPassword = driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-body > form > div:nth-child(2) > input"));
        loginUsername.sendKeys(userName);
        loginPassword.sendKeys(password);
        WebElement loginButton = driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary"));
        loginButton.click();
    }
    public void checkPhone(){
        WebElement titlePhone = driver.findElement(By.cssSelector("a[href='prod.html?idp_=3']"));
        titlePhone.click();
        WebElement addCartButton = driver.findElement(By.cssSelector("#tbodyid > div.row > div > a"));
        addCartButton.click();

    }
}
