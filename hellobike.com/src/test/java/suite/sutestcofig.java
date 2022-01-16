package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public   class sutestcofig {

    @BeforeSuite
    public  void   add(){
        System.out.println("用户名验证通过");
    }



}
