package com.hellobike.cn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
    @Test
    public void testng1() {
        System.out.println("333");
    }
    @BeforeMethod
    public void testng2() {
        System.out.println("22222");
    }
    @AfterMethod
    public void testng3() {
        System.out.println("333");
    }

    public void  ade(){


    }
}
