package Welcome_JAVA;

public class recursion
{   //递归 自己调用自己
        public static void main(String[] args)
        {
        recursion rec=new recursion();  //实例化类
        int a_result=rec.a(10);         //调用a方法
        System.out.println(a_result);      //打印a方法返回值


        int fb_result=rec.fb(10);   //调用斐波那契方法
        System.out.println(fb_result);    //打印返回值

        int a=n_stage(10);
        System.out.println(a);

        long n=for_n_stage(10);//用迭代代替递归
        System.out.println(n);




        }



         int a(int i)
        {
            System.out.println(i);
            int b_num=b(i);  //调用b()
            return b_num+i;
        }


        static int b(int j)
        {
         System.out.println(j);
         return j;
        }

        //自己调用自己，斐波那契数列,如果不是static，在main中执行要实例化.
        int fb(int a) {
            if (a == 0) {
                return 0;
            } else if (a == 1||a==2) {
                return 1;
            }
            int list1=fb(a-1)+fb(a-2);
            return list1;
        }



        //阶乘
        static int n_stage(int i)
        {

            if (i==1)
            {
                return 1;
            }
            else if (i==0){
                return 1;
            }
            return i*n_stage(i-1);
        }



        //用循环代替迭代
        static long for_n_stage(long n)
        {
            long sum=1;
            while(n>1){
              sum=sum*(n);
              n-=1;
            }
            return sum;
        }
}
