package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
    public static String kullaniciadi="therationalmale0";
    public static String password="123rollo";

    public BaseDriver() {
    }
    public BaseDriver(String username,String password) {
        setKullaniciadi(username);
        setPassword(password);
    }
    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        BaseDriver.password = password;
    }

    public static String getKullaniciadi() {
        return kullaniciadi;
    }

    public static void setKullaniciadi(String kullaniciadi) {
        BaseDriver.kullaniciadi = kullaniciadi;
    }

    static {
        KalanOncekileriKapat();
        Logger logger=Logger.getLogger("");//out bütün logları üreten obje
        logger.setLevel(Level.SEVERE);//sadece error
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        driver=new ChromeDriver();
        Duration dr=Duration.ofSeconds(30);//Web sitesnide elementlerin yüklenmesi ile alakalı
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);//



    }


    public static void BekleKapat() {
        Myfunc.Bekle(3);
        driver.close();
    }


    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }

    public static void Login(){
        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement Login = driver.findElement(By.xpath("//a[text()='Login']/../a"));
        Login.click();
        WebElement username = driver.findElement(By.cssSelector("input[id='Username']"));
        WebElement password = driver.findElement(By.cssSelector("input[id='Password']"));
        WebElement loginbtn = driver.findElement(By.xpath("//input[@name='login']"));
        username.click();
        username.sendKeys(getKullaniciadi());
        Myfunc.Bekle(1);
        password.click();
        password.sendKeys(getPassword());
        Myfunc.Bekle(1);
        loginbtn.click();
        Myfunc.Bekle(3);

    }
    public static void Logout(){
        WebElement logout = driver.findElement(By.xpath("//a[text()='Log out']"));
        logout.click();
    }
}
