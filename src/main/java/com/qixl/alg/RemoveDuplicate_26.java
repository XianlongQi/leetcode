package com.qixl.alg;

/**
 * @author qixl
 * @version 1.0.0
 * @ClassName RemoveDuplicate_26.java
 * @Description TODO
 * @createTime 2022年03月19日 17:00:00
 */
public class RemoveDuplicate_26 {

    public static void main(String[] args) {
        RemoveDuplicate_26 rd = new RemoveDuplicate_26();
        rd.removeDuplicates(new int[]{1,1,2,2,5,7,7,9});
    }

    public int removeDuplicates(int[] nums) {

        int fast=0,slow=0;
        while (fast < nums.length){
            if(nums[fast] != nums[slow]){
                slow ++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        for (int i=0; i< slow + 1; i++) {
            System.out.println(nums[i]);
        }
        return slow + 1;
    }
}
