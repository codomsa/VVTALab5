package project.steps.serenity;

import project.pages.HomePage;

public class EndUserCreateDeleteFolder {
    HomePage homePage;

    public void createDir() {
        homePage.createNewDir();
        homePage.setNewDir("folder1");
        homePage.yes();
        homePage.back();
    }

    public void deleteDir() {
        homePage.deleteDir();
    }

}
