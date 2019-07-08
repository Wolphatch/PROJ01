package leetcode;

public class two_sum {
    public static void main(String[] args) {
        int[] list1={0,3,4,0};
        int[] result=twoSum(list1,0);
        for (int i=0;i<=1;i++){
            System.out.println(result[i]);
        }

    }


    public static int[] twoSum ( int[] nums, int target){
        int[] result = new int[2];
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j > -1; j--) {
                if (nums[i] + nums[j] == target) {
                    result[0] = j;
                    result[1] = i;

                }
            }
        }
        return result;
    }
}



