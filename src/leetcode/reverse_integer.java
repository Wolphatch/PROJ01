package leetcode;

/**
 * @author zhicong hu
 *这道题的重点在于如何防止溢出
 * 2^31-1=2147483647 反序数在迭代到倒数第二次的时候，应检查是否大于214748364（2147483647/10）
 * 如果大于214748364，则反序数最后一位无论是几都会溢出；
 * 如果反序数等于214748364，最后一位不能大于7，即最后的输出不能大于2147483647
 *
 * 最优算法是，循环将x整除10（x%10）取余数，rev（输出项）乘以10并加上此余数（命名为pop），
 * 每次乘十都会将当前rev的所有数字往前shift一位
 * 当x只剩最后一位时，x=x/10=0,所以迭代出口设置为x=0（while（x!=0))
 *
 */

public class reverse_integer {
    public static int reverse(int x) {
        int rev=0;
        int pop;
        int max=(int)(Math.pow(2,31)-1);
        int min=(int)(-Math.pow(2,31));
        while(x!=0){
            pop=x%10;
            if (rev>0.1*max||(rev==0.1*max && pop>7)) {
                return 0;
            }
            if (rev<0.1*min||(rev==0.1*max && pop<-8)) {
                return 0;
            }

            rev=rev*10+pop;
            x/=10;

        }
        return rev;

    }

    public  static void main(String[] args){
        int test1=reverse(121334);
        System.out.println(test1);
        System.out.println(-1234574/10);
        System.out.println(-1234574%10);
    }
}





