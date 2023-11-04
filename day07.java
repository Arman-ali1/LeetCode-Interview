Day67
1480. Running Sum of 1d Array 😃
I have use iterative solution for this Approach
Can any approach optimal solution for the same
DSA with JAVA
code:= ===========
public int[] runningSum(int[] nums) {
 int sum=0;
 for(int i=0;i<nums.length;i++){
 sum+=nums[i];
 nums[i]=sum;
 }
 return nums;
 }
============
hashtag#LeetCode
hashtag#daily challenge
67/100;