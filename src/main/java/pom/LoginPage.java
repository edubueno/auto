package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.Hook;

public class LoginPage {
    @FindBy(how = How.ID, using = "user")
    private WebElement userInput;
    @FindBy(how = How.ID, using = "passaword")
    private WebElement passawordInput;
    @FindBy(how = How.ID, using = "login")
    private WebElement loginButton;

    public  LoginPage (WebDriver driver){
        PageFactory.initElements(Hook.getDriver(), this);
    }
    public LoginPage access(){
        Hook.getDriver().get("https://trello.com/login");
        return this;
    }
}
