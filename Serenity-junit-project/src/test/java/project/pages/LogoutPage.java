package project.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class LogoutPage extends PageObject {

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div/form/a[4]/img")
    private WebElementFacade logoutButton;


    public void logout(){
        logoutButton.click();
    }
    public List<String> get_logout_message() {
        WebElementFacade definitionList = find(By.tagName("div"));
        return definitionList.findElements(By.tagName("p")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
}
