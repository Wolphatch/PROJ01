package ArrayRelated;

public class binarySearch {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        boolean result=solution(arr,11);
        System.out.println(result);

    }


    public static boolean solution(int[] array, int item){
        int start=0;
        int end=array.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (array[mid]==item){
                return true;
            }
            else if(array[mid]>item){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return false;
    }
}
