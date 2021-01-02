package arrays;

/*
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        MaxConsecutiveOnes a = new MaxConsecutiveOnes();
        int[] num = new int[args.length];
        for(int i = 0; i < args.length; i++){
            num[i] = Integer.parseInt(args[i]);
        }

        System.out.println(a.findMaxConsecutiveOnes(num));

    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                if (count > maxCount)
                    maxCount = count;
                count = 0;
            } else
                count++;
        }
        if (count > maxCount)
            maxCount = count;

        return maxCount;
    }
}
