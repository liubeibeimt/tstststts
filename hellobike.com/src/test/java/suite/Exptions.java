package suite;

import org.testng.annotations.Test;



public class Exptions {


    @Test(expectedExceptions = RuntimeException.class)
    public void ex()  {
        System.out.println("接口能掉同就行");
        throw new RuntimeException();
    }


    @Test(dependsOnMethods = {"ex"})
    public void ex1() {
        System.out.println("keyil");

    }
}
