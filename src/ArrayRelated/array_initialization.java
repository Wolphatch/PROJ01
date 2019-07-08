package ArrayRelated;

public class array_initialization {
    public static void main(String[] args){
        //动态初始化  Dynamic initialization
        int a[] = new int[10];  //自己给每个位置赋值
        a[0]=1;
        a[1]=2;

        //静态初始化  Static initialization
        int[] b ={1,2,3};
        tablet[] c ={
                new tablet("1","2","3","4","5"),
                new tablet("5","4","3","2","1")
        };

        //默认初始化 default initialization
        int d[] = new int[10];  //每个位置默认为0


        System.out.println("##################");

        //for-each
        for (tablet i:c){   //将c中的每一项取出来赋值给i
            System.out.print(i.getMemory());
        }

        for(int i:d){     //类似于python的for i in d
            System.out.print(i);
        }



    }

}
