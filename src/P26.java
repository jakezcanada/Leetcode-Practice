import java.util.Arrays;

public class P26 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        int k = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                nums[k] = nums[i];
                k++;
            }
        }
        nums[k] = nums[nums.length - 1];
        k++;
        return k;
    }
    public static void main(String[] args) {
        int[] test = {5,6,7,7,7,7,7,8};
        System.out.println(removeDuplicates(test));
    }
}
