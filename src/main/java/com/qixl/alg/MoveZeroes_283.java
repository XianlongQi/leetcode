package com.qixl.alg;

/**
 * @author qixl
 * @version 1.0.0
 * @ClassName MoveZeroes_238.java
 * @Description TODO
 * @createTime 2022年03月19日 17:22:00
 */
public class MoveZeroes_283 {

    public static void main(String[] args) {
        MoveZeroes_283 mz = new MoveZeroes_283();
        mz.moveZeroes(new int[]{0,0,0,9});
    }
//    public void moveZeroes(int[] nums) {
//        //1.第一遍循环找出非0的总数，同时把非0元素从按照原来的顺序从数组第一个开始排列
//        int len = nums.length;
//        int noZeroCount = 0;
//        int j=0;
//        for(int i=0;i<len;i++){
//            if(nums[i] != 0){
//                noZeroCount ++;
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        //2.第二次循环按照数组中0的个数都赋值为0
//        for(int x=noZeroCount ;x < len;x++){
//            nums[x] = 0;
//        }
//    }

    public void moveZeroes(int[] nums) {

        int slow = 0;
        int fast = 0;
        while (fast < nums.length){
            if(nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        for(int x=slow ;x < nums.length;x++){
            nums[x] = 0;
        }
        for(int i=0;i< nums.length;i++){
            System.out.println(nums[i]);
        }
    }

}
