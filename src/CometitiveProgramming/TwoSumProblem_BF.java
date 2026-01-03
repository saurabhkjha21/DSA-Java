package CometitiveProgramming;

public class TwoSumProblem_BF {
    public static int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums={2,2,4,5,6,7,8};
        int target = 11;
        int[] result = twoSum(nums, target);
        if(result[0] !=-1){
            System.out.println("Indices: "+ result[0] + ", "+result[1]);
        }else{
            System.out.println("No pair found that adds up to target.");
        }
    }
}
