package project.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends PageObject {
    @FindBy(xpath = "/html/body/div/div[2]/div/form/table[1]/tbody/tr/td/input[1]")
    private WebElementFacade newDir;

    @FindBy(name = "newNames[1]")
    private WebElementFacade firstTextInput;

    @FindBy(xpath = "//*[@id=\"NewDirForm\"]/a[2]/img")
    private WebElementFacade yesButton;

    @FindBy(xpath = "//*[@id=\"CopyMoveDeleteForm\"]/a[2]/img")
    private WebElementFacade confirmDelete;

    @FindBy(xpath = "//*[@id=\"CopyMoveDeleteForm\"]/a/img")
    private WebElementFacade backAfterDelete;

    @FindBy(xpath = "//*[@id=\"NewDirForm\"]/a/img")
    private WebElementFacade backButton;

    @FindBy(name = "list[1][dirfilename]")
    private WebElementFacade checkDir;

    @FindBy(xpath = "/html/body/div/div[2]/div/form/table[1]/tbody/tr/td/div/input[3]")
    private WebElementFacade deleteButton;


    public void createNewDir() {
        newDir.click();
    }

    public void setNewDir(String dirName) {
        firstTextInput.type(dirName);
    }

    public void yes() {
        yesButton.click();
    }

    public void back() {
        backButton.click();
    }

    public void deleteDir() {
        checkDir.click();
        deleteButton.click();
        confirmDelete.click();
        backAfterDelete.click();
    }
}
