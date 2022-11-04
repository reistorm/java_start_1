package DZ1;

public class Task27 {
    public int removeElement(int[] nums, int val) {
        int copyInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyInd] = nums[i];
                copyInd++;
            }
        }
        return copyInd;
    }

}

