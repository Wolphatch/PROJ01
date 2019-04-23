package Welcome_JAVA;


/*
public class shell_sort {

    public  static  void main(String[] args){
        long stt=System.currentTimeMillis();
        int[] list={49,38,65,97,26,13,27,49,55,4};
        int[] list_sorted=shellsort1(list,10);
        for (int i=0;i<list.length;i++){
        System.out.print(list[i]+"\t");
        }
        long edt=System.currentTimeMillis();
        long dur=edt-stt;
        System.out.print(dur);
    }


    static int[] shellsort1(int a[],int n){
        int i,gap,j;
        for (gap=n/2;gap>0;gap/=2) {
            System.out.print(gap + "\n");
            for(i=gap;i<n;i++){
                for(j=i-gap;j>=0 && a[j]>=a[j+gap];j-=gap){
                    int tmp=a[j];
                    a[j]=a[j+gap];
                    a[j+gap]=tmp;

                }
                for (int x=0;x<a.length;x++){
                    System.out.print(a[x]+"\t");
                }
                System.out.print("\n");
            }

        }
        return a;
    }
}

//shell排序和插入排序的区别在于，i每次+1变成了i+gap，j=i-gap,并且每次j从与j+1比较变成j与j+gap比较
//所以每次循环比较次数会少，最坏情况下与插入排序O(n^2)一样。


 */


public class shell_sort{
    public static void main(String[] args){
        int[] lista={4,10,3,5,1,2,11,7,21,55};
        lista=shell_sort(lista);
        for (int i=0;i<lista.length;i++){
            System.out.print(lista[i]+"\t");
        }
        System.out.print("\n");
    }

    public static void swap(int[] list,int a,int b){
        int tmp=list[a];
        list[a]=list[b];
        list[b]=tmp;

    }

    static int[] shell_sort(int[] list){
        for(int gap=list.length/2;gap>=1;gap/=2){
            for(int i=gap;i<list.length;i++){
                for(int j=i-gap;j>=0;j-=gap){
                    if(list[j]>list[j+gap]){
                        swap(list,j,j+gap);
                    }
                }
            }
        }
        return list;
    }





}





