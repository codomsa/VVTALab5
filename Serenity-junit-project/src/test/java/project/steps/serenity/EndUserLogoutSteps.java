package project.steps.serenity;

import net.thucydides.core.annotations.Step;
import project.pages.LogoutPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserLogoutSteps {
    LogoutPage logoutPage;

    @Step
    public void logout(){
        logoutPage.logout();
    }
    @Step
    public void verify_message(String message) {
        assertThat(logoutPage.get_logout_message(), hasItem(containsString(message)));
    }
}
