public class P2256 {
    public int minimumAverageDifference(int[] nums) {
        int lowest = 1000000;
        int lowestIndex = 0;
        double left = 0;
        double right = 0;
        for(int i : nums){
            right += i;
        }
        for(int i = 0; i < nums.length; i++){
            left += nums[i];
            right -= nums[i];
            int leftAvg = (int) (left / (double) (i + 1));
            int rightAvg = i != nums.length - 1 ? (int) (right / (double) (nums.length - i - 1)) : 0;
            int curr = (int) Math.abs(leftAvg - rightAvg);
            if(lowest > curr){
                lowest = curr;
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }
}
