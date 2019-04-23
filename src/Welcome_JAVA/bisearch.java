package Welcome_JAVA;

import Welcome_JAVA.heapsort;


public class bisearch {
    public static void main(String[] args){
        int[] list1={2,5,3,10,19,81,1,5,7,9};   //binary search 一定是在sort好的数组里
        heapsort.heap_sort(list1,list1.length);
        int result=bisech(list1,81);
        System.out.println(result);

    }



    public static int bisech(int[] list,int item){
        int low=0;
        int high =list.length-1;
        int result=-1;

        while (low<=high){
            int mid=(high+low)/2;
            System.out.format("%d %d %d\n",high,low,mid);
            if (item==list[mid]){
                result=mid;
                break;
            }

            if (item<list[mid]){
                high=mid-1;
            }
            if(item>list[mid]){
                low=mid+1;
            }
        }

        return result;

    }
}
