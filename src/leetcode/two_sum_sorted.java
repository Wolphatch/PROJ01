package leetcode;
import Welcome_JAVA.heapsort;

import java.sql.ResultSet;

public class two_sum_sorted{
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = two_sum_sorted(list1, 9);
        for (int i = 0; i <= 1; i++) {
            System.out.print(result[i]);
            System.out.print(" ");

        }
    }



    public static int[]  two_sum_sorted(int[] numbers, int target){
        int[] result={-1,-1};
        int head=0;
        int rear=numbers.length-1;
        while (head!=rear){
            if(numbers[head]+numbers[rear]==target){
                result[0]=head+1;
                result[1]=rear+1;
                return result;
           }
           if(numbers[head]+numbers[rear]>target){
               rear-=1;
           }
           if(numbers[head]+numbers[rear]<target){
               head+=1;
           }
       }
        return result;

    }
}
