package Project;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestMain extends BaseDriver {

    @Test
    public void Test1() {
        String yenihesap="tsgroup009";//bu test yeni hesap olduğu için burda username atamamız gerek
        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement signupbtn = driver.findElement(By.xpath("//*[text()='Sign Up']/../a"));
        signupbtn.click();

//        WebElement singUp = driver.findElement(By.linkText("Sing Up"));

        Myfunc.Bekle(1);
        //Form
        WebElement firstname = driver.findElement(By.cssSelector("[class='form-group']>div>input[id='FirstName']"));
        WebElement surname = driver.findElement(By.cssSelector("[class='form-group']>div>input[id='Surname']"));
        WebElement eposta = driver.findElement(By.cssSelector("[class='form-group']>div>input[id='E_post']"));
        WebElement mobile = driver.findElement(By.cssSelector("[class='form-group']>div>input[id='Mobile']"));
        WebElement username = driver.findElement(By.cssSelector("[class='form-group']>div>input[id='Username']"));
        WebElement password = driver.findElement(By.cssSelector("[class='form-group']>div>input[id='Password']"));
        WebElement confirmpassword = driver.findElement(By.cssSelector("[class='form-group']>div>input[id='ConfirmPassword']"));
        WebElement submitbtn = driver.findElement(By.cssSelector("[id='submit']"));
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
        firstname.sendKeys("Java");
        Myfunc.Bekle(1);
        surname.click();
        surname.sendKeys("Grup9");
        Myfunc.Bekle(1);
        eposta.click();
        eposta.sendKeys("0sahipkiranemirtimur0@gmail.com");
        Myfunc.Bekle(1);
        mobile.click();
        mobile.sendKeys("05353535");
        Myfunc.Bekle(1);

        username.click();
        username.sendKeys(yenihesap);//burası için
        Myfunc.Bekle(1);

        password.click();
        password.sendKeys(getPassword());
        Myfunc.Bekle(1);

        confirmpassword.click();
        confirmpassword.sendKeys(getPassword());
        Myfunc.Bekle(1);
        submitbtn.click();
        Myfunc.Bekle(2);

        WebElement labelsucces = driver.findElement(By.cssSelector("[class='label-success']"));
//        WebElement labelsucces=driver.findElement(By.xpath("//label[@class='label-success']"));
        String label = labelsucces.getText();
        Assert.assertTrue("TestPassed",  label.equals("Registration Successful"));


//        BekleKapat();
    }

    @Test
    public void Test2() {
//        driver.get("https://itera-qa.azurewebsites.net/");
////        WebElement Login = driver.findElement(By.linkText("Login"));
//        WebElement Login = driver.findElement(By.xpath("//a[text()='Login']/../a"));
//        Login.click();
//       WebElement username = driver.findElement(By.cssSelector("input[id='Username']"));
//        WebElement password = driver.findElement(By.cssSelector("input[id='Password']"));
////WebElement username=driver.findElement(By.xpath("//input[@id='Username']"));
////WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
//        WebElement loginbtn = driver.findElement(By.xpath("//input[@name='login']"));
//        Myfunc.Bekle(3);
//        username.click();
//        username.sendKeys(getKullaniciadi());
//        Myfunc.Bekle(1);
//        password.click();
//        password.sendKeys(getPassword());
//        Myfunc.Bekle(1);
//        loginbtn.click();
//        Myfunc.Bekle(3);


        Login();
        Myfunc.Bekle(3);
        String currentUrl = driver.getCurrentUrl();//o anki web sitesini String olaran döndüren method
//        WebElement dashbord = driver.findElement(By.xpath("div>h1"));
//        String text = dashbord.getText();

        Assert.assertTrue("Test Passed", currentUrl.equals("https://itera-qa.azurewebsites.net/Dashboard"));
//        WebElement logout = driver.findElement(By.xpath("//a[text()='Log out']"));
//        logout.click();
        Logout();
        BekleKapat();

    }


    @Test
    public void Test3() {

//        driver.get("https://itera-qa.azurewebsites.net/");
//        WebElement Login = driver.findElement(By.xpath("//a[text()='Login']/../a"));
//        Login.click();
////        Login();
//        WebElement username = driver.findElement(By.xpath("//input[@id='Username']"));
//        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
//        WebElement loginbtn = driver.findElement(By.xpath("//input[@name='login']"));
//        Myfunc.Bekle(3);
//        username.click();
//        username.sendKeys(getKullaniciadi());
//        Myfunc.Bekle(1);
//        password.click();
//            password.sendKeys(getPassword());
//        Myfunc.Bekle(1);
//        loginbtn.click();
//        Myfunc.Bekle(3);
Login();

        WebElement creatbtn = driver.findElement(By.cssSelector("div[class='container body-content'] a[class='btn btn-primary']"));
//        WebElement creatbtn=driver.findElement(By.xpath("//div[@class='container body-content']//a[@class='btn btn-primary']"));
        creatbtn.click();
        Myfunc.Bekle(2);
        WebElement name = driver.findElement(By.xpath("(//div[@class='col-md-10']/input)[1]"));
        WebElement company = driver.findElement(By.xpath("(//div[@class='col-md-10']/input)[2]"));
        WebElement address = driver.findElement(By.xpath("(//div[@class='col-md-10']/input)[3]"));
        WebElement city = driver.findElement(By.xpath("(//div[@class='col-md-10']/input)[4]"));
        WebElement phone = driver.findElement(By.xpath("(//div[@class='col-md-10']/input)[5]"));
        WebElement email = driver.findElement(By.xpath("(//div[@class='col-md-10']/input)[6]"));
        WebElement submitbtn = driver.findElement(By.xpath("//input[@type='submit']"));
        name.click();
        name.sendKeys("Cimbom");
        Myfunc.Bekle(1);
        company.click();
        company.sendKeys("Galatasaray");
        Myfunc.Bekle(1);
        address.click();
        address.sendKeys("Florya");
        Myfunc.Bekle(1);
        city.click();
        city.sendKeys("Istanbul");
        Myfunc.Bekle(1);
        phone.click();
        phone.sendKeys("1905");
        Myfunc.Bekle(1);
        email.click();
        email.sendKeys("hasanftceza_crazyboy@hotmail.com");
        submitbtn.click();
        String currenturl = driver.getCurrentUrl();

        Assert.assertTrue("TestPassed", currenturl.equals("https://itera-qa.azurewebsites.net/Dashboard"));

//        WebElement logout = driver.findElement(By.xpath("//a[text()='Log out']"));
//        logout.click();
        Logout();
//        BekleKapat();
    }
}





