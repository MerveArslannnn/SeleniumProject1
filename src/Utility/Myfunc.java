package Utility;


public class Myfunc {
    public static void Bekle(int sn) {
        try {
            Thread.sleep(1000 * sn);//sn bekledi
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
