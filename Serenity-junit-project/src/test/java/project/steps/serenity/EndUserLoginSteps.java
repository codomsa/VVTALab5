package project.steps.serenity;

import net.thucydides.core.annotations.Step;
import project.pages.LoginPage;

public class EndUserLoginSteps {
    LoginPage loginPage;

    @Step
    public void goto_home_ftppage() {
        loginPage.open();
    }

    @Step
    public void enter_data_and_click_login(String server, String name, String pass) {
        loginPage.save_cookies();
        loginPage.select_server(server);
        loginPage.enter_name(name);
        loginPage.enter_pass(pass);
        loginPage.click_login();
    }
}
