package Welcome_JAVA;

public class testconstent
{
    public static void main(String[] args)
    {
        final int STU_NUM=29489636;    //常量，不能改变,用大写字母命名
        final String STU_NAME="Hu";
        //System.out.format("%s's id is %d",stu_name,stu_num);
        System.out.println(STU_NAME+"'s student number is "+STU_NUM);
        //stu_num=2343253;  cannot assign a num to final variable
    }
}
