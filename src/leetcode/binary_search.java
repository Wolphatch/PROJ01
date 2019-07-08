package leetcode;

public class binary_search {
    public static void main(String[] args){
        int[] array={2,3,5,7,9,12,16,18,21};
        int a=solution(array,12);
        System.out.println(a);
    }

    public static int solution(int[] a,int item){
        int start=0;
        int end=a.length-1;
        while (start<end){
            int mid=start+(end-start/2);
            if (a[mid]==item){
                return mid;
            }
            if (a[mid]<item){
                start=mid+1;
            }
            if(a[mid]>item){
                end=mid-1;
            }

        }
        return -1;
    }
}




