package Welcome_JAVA;



public class base
{
    private String baseName = "base";
    private String baseName2 = "base";

    public base()
    {
        callName();
    }





    public void callName()
    {
        System. out. println(baseName);
    }




    static class Sub extends base
    {
        private String baseName = "sub";

        public void callName()
        {
            System. out. println (baseName) ;
        }
    }


    public static void main(String[] args)
    {
        base b = new Sub();

    }
}

