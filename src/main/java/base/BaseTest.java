package base;

import dataTecker.Datatake;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import static dataTecker.Datatake.CloseDriver;

public class BaseTest
{
    public Datatake data;
    @BeforeSuite
    public void start()
    {
        System.out.println("StartMethod");
    }

    @AfterMethod
    public void endTest()
    {
        System.out.println("TestEnd");
        if(data.flagGetter().equals("YES"))
        {
            CloseDriver();
            data.flagSetter("NO");
        }
    }
}
