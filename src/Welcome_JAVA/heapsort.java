package Welcome_JAVA;

public class heapsort {
    public static void main(String[] args){
        int[] lista={4,10,3,5,1,2,11,7,21,55};
        heap_sort(lista,lista.length);
        for(int i=0;i<lista.length;i++){
            System.out.print(lista[i]+"\t");
        }
    }




    static void heap(int[] tree,int n,int i){  //heap意为将一个分支及其子分支转为标准堆
        int parent=i;
        int c1=parent*2+1;
        int c2=parent*2+2;
        int max=i;
        if (i>=n){
            return;
        }
        if (c1<n && tree[c1]>tree[max]){
            max=c1;
        }
        if (c2<n && tree[c2]>tree[max]){
            max=c2;
        }
        if (max!=i){
            int tmp=tree[i];
            tree[i]=tree[max];
            tree[max]=tmp;
            heap(tree,n,max);

        }

    }
    static void heap_build(int[] tree,int n){//将所有分支及其子分支标准化，建立大顶堆，从n点到1点
       int start_point=n;
       for (int i=start_point;i>=0;i--){
           heap(tree,n,i);
       }
    }

    static void heap_sort(int[] tree,int n){ //n为数组长度
        for(int i=n;i>=1;i--){              //从第n点到第一点
            heap_build(tree,i);
            for(int j=0;j<tree.length;j++) {
                System.out.print(tree[j] + "\t");
            }
            System.out.print("\n");
            int tmp=tree[0];                //交换大顶与最后一项n-1，去除最后一项最大项，剩
            tree[0]=tree[i-1];              //n长度的数组最后一位是tree[n-1]
            tree[i-1]=tmp;
            for(int j=0;j<tree.length;j++) {
                System.out.print(tree[j] + "\t");
            }
            System.out.print("\n");
        }
    }




}
