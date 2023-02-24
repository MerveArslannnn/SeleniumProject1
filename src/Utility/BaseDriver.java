package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;

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
        driver.quit();
    }


    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }
}
