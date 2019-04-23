package Welcome_JAVA;

public class while_loop {
    public  static void main(String[] args){
        /*int i=1;
        int tmp=0;
        while(i<=100){
            tmp=tmp+i;
            i+=1;
        }
        System.out.println(tmp);

         */
        /*
        for(int i=0, j=20;i<100 &&i<j;i+=2,j++)
        {
            System.out.println("i:"+i);
        }
        */
        /*
        for(int i=1 ;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
                if(i==j){
                    System.out.print("\n");
                }

            }
        }

         */
        /*
        int sum_odd=0;
        int sum_even=0;
        for(int i=1;i<=100;i++) {
            if (i % 2 == 0) {
                sum_even += i;
            } else if (i % 2 != 0) {
                sum_odd += i;
            }
        }
        System.out.print(sum_odd+"\n");
        System.out.print(sum_even);

         */
        /*
        int sum=0;
        int tmp=0;
        for (int i=1;i<=1000;i++)
        {
            if(i%5==0)
                {
                    sum=sum+i;
                    System.out.print(sum+"\t");
                    tmp+=1;
                }
                if (tmp==4)
                {
                    System.out.print("\n");
                    tmp=0;
                   }
         }
         */
        /*
        outer:for(int i=101;i<=150;i++)
        {
            for (int j=2;j<i/2;j++){
                if(i%j==0){     //只要可以被j整除，i就不是质数直接outer到外层i循环
                    System.out.print(i+"不是个质数"+"\n");
                    continue outer;
                }

            }
        }
         */





    }

}
