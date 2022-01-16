package suite;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DateProviDer {
    @Test(dataProvider = "test1")
    public void a(String name, int age, String red) {
        System.out.println("名字:" + name + ";" + "年龄:" + age + ";" + "颜色:" + red);
    }


    @Test(dataProvider = "test1")
    public void b(String name, int age, String red) {
        System.out.println("名字:" + name + ";" + "年龄:" + age + ";" + "颜色:" + red);
    }

    @Test(dataProvider = "test1" ,invocationCount = 10,threadPoolSize = 10)
    public void c(String name, int age, String red) {
        System.out.println("名字:" + name + ";" + "年龄:" + age + ";" + "颜色:" + red);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());

    }


    @DataProvider(name = "test1")
    public Object[][] dateprider(Method method) {
        Object[][] rusutl = null;
        if (method.getName().equals("a")) {
            rusutl = new Object[][]{
                    {"花花1", 50, "黑色"},
                    {"花花2", 52, "黑色"},
                    {"花花3", 54, "黑色"}
            };
        } else if (method.getName().equals("b")) {
           rusutl =new Object[][]{
                   {"天天1", 10, "白色"},
                   {"天天2", 12, "白色"},
                   {"天天3", 14, "白色"}
           };
        } else if (method.getName().equals("c")) {
            rusutl=new Object[][]{
                    {"笑笑1", 80, "白色"},
                    {"笑笑2", 82, "白色"},
                    {"笑笑3", 84, "白色"},
            };
        }
        return rusutl;
    }


}
