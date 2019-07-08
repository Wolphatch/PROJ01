package leetcode;

/**
 * @author huzhicong
 *
 * 这题的做法和reverse_intrger(第七题)没什么不同，没有最大值检测，只要处理后的数字和原数字相等就行
 * 如果是0就return true，如果相等return true，x为负数或者不想等return false
 */
public class Palandrome {
    public boolean isPalindrome(int x) {
        int x_copy=x;
        //int max=(int)Math.pow(2,31)-1;
        int rev=0;
        int pop;
        if (x<0){
            return false;
        }
        if (x==0){
            return true;
        }
        while(x!=0){
            pop=x%10;
            //if(rev/10>max*0.1 ||(rev==max*0.1&&pop>7) ){
            //return false;
            //}
            rev=rev*10+pop;
            pop=x/10;
            x/=10;

        }
        if (rev==x_copy){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){

    }
}
