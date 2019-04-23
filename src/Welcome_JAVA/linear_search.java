package Welcome_JAVA;
import  java.util.Scanner;
public class linear_search {
    public static void main(String[] agrs){
        int[] list1={4,2,8,10,7,5,3};
        Scanner sc= new Scanner(System.in);
        System.out.println("number?\n");
        int x=sc.nextInt();
        int result=search(list1,x);
        System.out.print(result);
    }

     static int search(int[] list, int x){
        int i=0;
        int location=0;
        for (i=0;i<list.length;i++){
            if(x==list[i]){
                location=i+1;
            }

            }
        return location;


    }
}
