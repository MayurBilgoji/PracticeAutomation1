package dataTecker;

public class Datatake
{
    private static String Closeflag="ttt";

    public void take1()
    {
        System.out.println("Data take1");
    }
    public void take2()
    {
        System.out.println("Data take2");
        flagSetter("YES");

    }
    public static void CloseDriver()
    {
        System.out.println("close driver");

    }


    public static String flagGetter()
    {
        System.out.println("Flag condition "+ Closeflag);
        return Closeflag;
    }

    public static void flagSetter(String con)
    {
        Closeflag=con;
        System.out.println("closeflag value set to  "+Closeflag);
    }

}
