import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Random;

public class PracticeFormTest extends Settings{




    @Test
    public void AllValidDataTest(){
        AutomationPracticeForm automationPracticeForm = new AutomationPracticeForm(driver);
        automationPracticeForm.typeFirstName("Evgeniy")
                .typeLastName("Karabaev")
                .typeEmail("evgeniy@gmail.com")
                .selectMale()
                .typePhone("0123456789")
                .typeAllSubjects()
                .clickCheckboxMusic()
                .sendPicture("C:\\Users\\User\\Downloads\\Screenshot 2022-06-24 at 13.50.55.png")
                .typeCurrentAddress("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
                .typeStateCity()
                .clickButton();






    }

}
