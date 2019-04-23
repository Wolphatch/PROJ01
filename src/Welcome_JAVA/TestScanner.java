package Welcome_JAVA;
import java.time.Year;
import java.util.Scanner;
//获取键盘输入，pyhton-——》input

public class TestScanner
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);   //类的实例化

        System.out.println("name?");
        String name= scanner.nextLine();  // name input

        System.out.println("hobby?");
        String favour=scanner.nextLine();   //hobby inut   favour=input('name?\n')

        System.out.println("age?");
        int age=scanner.nextInt();

        System.out.println("--------------------\n");
        System.out.println(name);
        System.out.println(favour);
        System.out.println(age);


    }

}
