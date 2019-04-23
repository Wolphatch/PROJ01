package Welcome_JAVA;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class statements {
    public  static void main(String[] args) {

        /*if=else

        int a=3;
        int b=4;
        if(a==b)
        {
            System.out.println("a=b");
        }
        else{
            System.out.println("a!=b");

        }
        */


        /*
        for (int i=0;i<5;++i)
        {
            System.out.println(i);
        }
        */


        /*
        boolean a =true;
        int i = 0;
        while(a) {
            System.out.println(i);
            //i=i++;     i++先储存值再加1，所以等式前后都是0，此loop无限循环
            i=++i;       //++i 先加1再储存到内存，等式左变等于1
            System.out.println(i);
            if (i>=10){
                break;
            }
         }
         */


        /*
        boolean loop=true;
        while (loop) {
            int x = (int) (6 * Math.random()) + 1;  //randon产生0-1之间的随机数--处理--->0-1的随机数
            int y = (int) (6 * Math.random()) + 1;
            int z = (int) (6 * Math.random()) + 1;
            int all = x + y + z;
            if (all <= 6) {
                System.out.format("%d, not good\n", all);

            }
            if (6 < all && all <= 12) {
                System.out.format("%d, fine\n", all);
            }
            if (12 < all) {
                System.out.format("%d, fabulous\n", all);
            }
        }
         */
        /*
        double pi = Math.PI;

        Scanner scanner=new Scanner(System.in);
        System.out.println("r??");
        int r=scanner.nextInt();
        if(r==5){
            System.out.println(Math.pow(r,2)*Math.PI);
        }
        else{
            System.out.println(Math.pow(r-1,2)* Math.PI);
        }


         */
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("age?");
        int age=scanner.nextInt();

        if (age<15) {
            System.out.println("child");
        }else if (age<35){                  //else if---->15<age<35
            System.out.println("adult");
        }else if(age<60){
            System.out.println("middle age");
        }else{
            System.out.println("old people");
        }


         */

        int a= (int)(12*Math.random());
        switch (a){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            default:
                System.out.println("other monthes");
                break;
        }
    }

}
