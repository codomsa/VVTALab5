package project.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import project.steps.serenity.*;

@RunWith(SerenityRunner.class)
public class Story {

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Steps
    public EndUserLoginSteps loginsteps;

    @Steps
    public EndUserCreateDeleteFolder createdeletesteps;


    @Steps
    public EndUserLogoutSteps logoutsteps;


    @Issue("login valid")
    @Test
    public void login_valid() {
        loginsteps.goto_home_ftppage();
        loginsteps.enter_data_and_click_login("localhost", "vvta10", "vvta10");
    }

    @Issue("create directory")
    @Test
    public void create_dir() {
        loginsteps.goto_home_ftppage();
        loginsteps.enter_data_and_click_login("localhost", "vvta10", "vvta10");
        createdeletesteps.createDir();
    }

    @Issue("delete directory")
    @Test
    public void delete_dir() {
        loginsteps.goto_home_ftppage();
        loginsteps.enter_data_and_click_login("localhost", "vvta10", "vvta10");
        createdeletesteps.createDir();
        createdeletesteps.deleteDir();
    }

    @Issue("logout")
    @Test
    public void logout() {
        webdriver.manage().window().maximize();
        loginsteps.goto_home_ftppage();
        loginsteps.enter_data_and_click_login("localhost", "vvta10", "vvta10");
        logoutsteps.logout();
        logoutsteps.verify_message("logged out");
    }
}