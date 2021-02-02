package Selenium.testscripts;

import Selenium.pages.HomePage;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class GithubTest extends TestBase {

    public void verifyGithubSlogan() {
        HomePage homePage = new HomePage(driver);
        homePage.get();
        assertThat(homePage.getSloganText()).isEqualTo("Built for developers");
    }
}
