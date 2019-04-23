package Welcome_JAVA;

public class insert_sort {
    public static int[] list1={2,8,40,0,1,7,9};

    public static void main(String[] args){
        long stt=System.currentTimeMillis();
        int[] sort1=insert_sort_(list1);
        for (int i=0; i<list1.length;i++){
            System.out.print(list1[i]+"\t");
        }
        long edt=System.currentTimeMillis();
        long dur=edt-stt;
        System.out.print("\n"+(edt-stt));
    }


    public static int[] insert_sort_(int[] list0){
        outer:for (int i=0;i<=list0.length-1;i++){
            if(i==0){
               continue outer;
            }
            for(int j=i-1;j>=0;j--){
                if(list0[j]>=list0[j+1]){
                    int tmp=list0[j];
                    list0[j]=list0[j+1];
                    list0[j+1]=tmp;
                }
            }
            for (int x=0;x<list0.length;x++){
                System.out.print(list0[x]+"\t");
            }
            System.out.print("\n");
        }
        return list0;
    }
}


//用i确定一个最右点，然后j=i-1开始，至j=0，j和j+1比，这样就可以把
//最右边的最小值移动到最左边，在这个i的时候，i左边sorted
