package suite;

import org.testng.annotations.Test;

public class time {
    @Test(timeOut = 2000 )
    public void teim() throws InterruptedException {
        Thread.sleep(1900);
        System.out.println("keyide ");

    }
}
