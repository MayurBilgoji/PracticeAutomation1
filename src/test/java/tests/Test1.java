package tests;

import base.BaseTest;
import dataTecker.Datatake;
import org.testng.annotations.Test;


public class Test1 extends BaseTest
{
    public Datatake data;

    @Test
    public void tc1()
    {
        System.out.println("Test method tc1");
        data=new Datatake();
        data.take1();
    }
    @Test
    public void tc2()
    {
        System.out.println("Test method tc2");
        data=new Datatake();
        data.take1();
        data.take2();
    }
    @Test
    public void tc3()
    {
        System.out.println("Test method tc3");
        data=new Datatake();
        data.take1();
        data.take2();
    }

    @Test
    public void tc4()
    {
        System.out.println("Test method tc4");
        data=new Datatake();
        data.take1();
    }
    @Test
    public void tc5()
    {
        System.out.println("Test method tc4");
        data=new Datatake();
        data.take1();
    }

}
