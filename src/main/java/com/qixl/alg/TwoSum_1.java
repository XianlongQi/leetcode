package com.qixl.alg;

/**
 * Created by qixl on 2022/3/19.
 */
public class TwoSum_1 {

  public static void main(String[] args) {
    TwoSum_1 ts = new TwoSum_1();
    int[] result = ts.twoSum(new int[]{2,7,11,15},6);
    for (int i:result) {
      System.out.println(i);
    }
  }


  public int[] twoSum(int[] nums, int target) {
    if(nums.length < 2){
      return null;
    }
    int[] result = new int[2];
    int len = nums.length;
    for(int i=0;i<len;i++){
      for(int j=i+1;j<len;j++){
        if(nums[i] + nums[j] == target){
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return result;
  }
}
