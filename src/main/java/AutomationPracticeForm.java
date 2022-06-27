
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Random;


public class AutomationPracticeForm {
    private WebDriver driver;

    public AutomationPracticeForm(WebDriver driver) {
        this.driver = driver;
    }

    private By header = By.xpath("//h5");
    private By firstName = By.xpath("//input[@id=\"firstName\"]");
    private By lastName = By.xpath("//input[@id=\"lastName\"]");
    private By email = By.xpath("//input[@id=\"userEmail\"]");
    private By radioMale = By.xpath("//input[@id=\"gender-radio-1\"]");
    private By radioFemale = By.xpath("//input[@id=\"gender-radio-2\"]");
    private By radioOther = By.xpath("//input[@id=\"gender-radio-3\"]");
    private By phone = By.xpath("//input[@id=\"userNumber\"]");
    private By subjects = By.cssSelector("#subjectsInput");
    private String[] subjectArray = {"Hindi", "English", "Maths", "Physics", "Chemistry", "Biology", "Computer Science", "Commerce", "Accounting", "Economics", "Arts", "Social Studies", "History", "Civics"};
    private By checkboxSports = By.xpath("//input[@id=\"hobbies-checkbox-1\"]");
    private By checkboxReading = By.xpath("//input[@id=\"hobbies-checkbox-2\"]");
    private By checkboxMusic = By.xpath("//input[@id=\"hobbies-checkbox-3\"]");
    private By picture = By.xpath("//input[@id=\"uploadPicture\"]");
    private By currentAddress = By.xpath("//textarea[@id=\"currentAddress\"]");
    private By state = By.xpath("//div[text()=\"Select State\"]");
    private By city = By.xpath("//div[text()=\"Select City\"]");
    private By submitButton = By.xpath("//button[@id=\"submit\"]");


    public String getHeader(){
        return driver.findElement(header).getText();
    }

    public AutomationPracticeForm typeFirstName(String name){
        driver.findElement(firstName).sendKeys(name);
        return this;
    }

    public AutomationPracticeForm typeLastName(String name){
        driver.findElement(lastName).sendKeys(name);
        return this;
    }

    public AutomationPracticeForm typeEmail(String email){
        driver.findElement(this.email).sendKeys(email);
        return this;
    }

    public AutomationPracticeForm selectMale(){
        driver.findElement(By.xpath("//input[@name=\"gender\"]")).click();
        return this;
    }

    public AutomationPracticeForm selectFemale(){
        driver.findElement(radioFemale).click();
        return this;
    }

    public AutomationPracticeForm selectOther(){
        driver.findElement(radioOther).click();
        return this ;
    }

    public AutomationPracticeForm typePhone(String phone){
        driver.findElement(this.phone).sendKeys(phone);
        return this ;
    }

    public AutomationPracticeForm typeAllSubjects(){
        for (int i = 0; i < subjectArray.length; i++){
            driver.findElement(subjects).sendKeys(subjectArray[i]);
            driver.findElement(subjects).sendKeys(Keys.ENTER);

        }
        return this;
    }

    public AutomationPracticeForm typeRandomSubject(){
        Random random = new Random();
        driver.findElement(subjects).sendKeys(subjectArray[random.nextInt(0, 14)]);
        driver.findElement(subjects).sendKeys(Keys.ENTER);
        return this;
    }

    public AutomationPracticeForm clickCheckboxSports(){
        driver.findElement(checkboxSports).click();
        return this;
    }

    public AutomationPracticeForm clickCheckboxReading(){
        driver.findElement(checkboxReading).click();
        return this;
    }

    public AutomationPracticeForm clickCheckboxMusic(){
        driver.findElement(checkboxMusic).click();
        return this;
    }

    public AutomationPracticeForm sendPicture(String path){
        driver.findElement(picture).sendKeys(path);
        return this;
    }

    public AutomationPracticeForm typeCurrentAddress(String text){
        driver.findElement(currentAddress).sendKeys(text);
        return this;
    }

    public AutomationPracticeForm typeStateCity(){
        driver.findElement(state).sendKeys("NCR");
        driver.findElement(state).sendKeys(Keys.ENTER);
        driver.findElement(city).sendKeys("Delhi");
        driver.findElement(city).sendKeys(Keys.ENTER);
        return this;
    }

    public AutomationPracticeForm clickButton(){
        driver.findElement(submitButton).click();
        return this;
    }










}
