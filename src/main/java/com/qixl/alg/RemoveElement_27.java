package com.qixl.alg;

/**
 * @author qixl
 * @version 1.0.0
 * @ClassName RemoveElement_27.java
 * @Description TODO
 * @createTime 2022年03月19日 18:37:00
 */
public class RemoveElement_27 {
    public static void main(String[] args) {
        RemoveElement_27 s = new RemoveElement_27();
        s.removeElement(new int[]{3,2,2,3,3,2,3},3);
    }

    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int fast = 0;
        int slow = 0;
        while(fast < nums.length){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast ++;
        }
        for(int i = 0; i<slow;i++){
            System.out.println(nums[i]);
        }
        return slow;
    }

}
