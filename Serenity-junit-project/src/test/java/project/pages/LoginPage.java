package project.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.scs.ubbcluj.ro/vvta/net2ftp/")
public class LoginPage extends PageObject {

    @FindBy(name="ftpserver")
    private WebElementFacade comboserver;

    @FindBy(name="username")
    private WebElementFacade textname;

    @FindBy(name="password")
    private WebElementFacade textpass;

    @FindBy(name="Save")
    private WebElementFacade cookie;

    @FindBy(name="Login")
    private WebElementFacade buttonlogin;


    public void save_cookies(){
        cookie.click();
    }
    public void select_server(String server) {
        comboserver.type(server);
    }

    public void enter_name(String name) {
        textname.type(name);
    }

    public void enter_pass(String pass) {
        textpass.type(pass);
    }
    public void click_login() {
        buttonlogin.click();
    }
}
