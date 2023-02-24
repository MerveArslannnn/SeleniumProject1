package Project;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestMain extends BaseDriver {
    //    Url: https://itera-qa.azurewebsites.net/
    //
    // *[text()='Sign Up']/../a /signup
    @Test
    public void Test1() {
        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement signupbtn = driver.findElement(By.xpath("//*[text()='Sign Up']/../a"));
        signupbtn.click();

        WebElement singUp=driver.findElement(By.linkText("Sing Up"));

        Myfunc.Bekle(1);
        //Form
        WebElement firstname= driver.findElement(By.cssSelector("[class='form-group']>div>input[id='FirstName']"));
        WebElement surname= driver.findElement(By.cssSelector("[class='form-group']>div>input[id='Surname']"));
        WebElement eposta= driver.findElement(By.cssSelector("[class='form-group']>div>input[id='E_post']"));
        WebElement mobile= driver.findElement(By.cssSelector("[class='form-group']>div>input[id='Mobile']"));
        WebElement username= driver.findElement(By.cssSelector("[class='form-group']>div>input[id='Username']"));
        WebElement password= driver.findElement(By.cssSelector("[class='form-group']>div>input[id='Password']"));
        WebElement confirmpassword= driver.findElement(By.cssSelector("[class='form-group']>div>input[id='ConfirmPassword']"));
        WebElement submitbtn= driver.findElement(By.cssSelector("[id='submit']"));
        //*xpath
//        WebElement firstname = driver.findElement(By.xpath("(//*[@class='col-md-10']/input)[1]"));
//        WebElement surname = driver.findElement(By.xpath("(//*[@class='col-md-10']/input)[2]"));
//        WebElement eposta = driver.findElement(By.xpath("(//*[@class='col-md-10']/input)[3]"));
//        WebElement mobile = driver.findElement(By.xpath("(//*[@class='col-md-10']/input)[4]"));
//        WebElement username = driver.findElement(By.xpath("(//*[@class='col-md-10']/input)[5]"));
//        WebElement password = driver.findElement(By.xpath("(//*[@class='col-md-10']/input)[6]"));
//        WebElement confirmpassword = driver.findElement(By.xpath("(//*[@class='col-md-10']/input)[7]"));
//        WebElement submitbtn = driver.findElement(By.xpath("//*[@id='submit']"));
        //*formdoldur
        firstname.click();
        firstname.sendKeys("Hasaan");
        Myfunc.Bekle(1);
        surname.click();
        surname.sendKeys("Alaagoz");
        Myfunc.Bekle(1);
        eposta.click();
        eposta.sendKeys("0sahipkiranemirtimur0@gmail.com");
        Myfunc.Bekle(1);
        mobile.click();
        mobile.sendKeys("05353535");
        Myfunc.Bekle(1);

        username.click();
        username.sendKeys("MarcusAureliusa");
        Myfunc.Bekle(1);

        password.click();
        password.sendKeys("12345armin");
        Myfunc.Bekle(1);

        confirmpassword.click();
        confirmpassword.sendKeys("12345armin");
        Myfunc.Bekle(1);
        submitbtn.click();
        Myfunc.Bekle(2);

        WebElement labelsucces=driver.findElement(By.cssSelector("[class='label-success']"));
//        WebElement labelsucces=driver.findElement(By.xpath("//label[@class='label-success']"));
        String label=labelsucces.getText();
        Assert.assertTrue("TessetPassed",label.equals("Registration Successful"));


//[class='label-success']
//


        BekleKapat();
    }

}
