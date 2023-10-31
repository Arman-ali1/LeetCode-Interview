Day66
2915. Length of the Longest Subsequence That Sums to Target 😃
I have use iterative solution for this Approach
Can any approach optimal solution for the same
DSA with JAVA
code:= ===========
public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
 int n= nums.size();
 List<Integer> dp=new ArrayList<>(Collections.nCopies(target+1,-1));
 dp.set(0,0);
 for(int num:nums){
 for(int sum=target;sum>=num;sum--){
 if(dp.get(sum-num)!=-1){
 dp.set(sum,Math.max(dp.get(sum),dp.get(sum-num)+1));
 }
 }
 }
 return dp.get(target);
}
============
hashtag#LeetCode
hashtag#daily challenge
66/100;
https://leetcode.com/contest/biweekly-contest-116/problems/length-of-the-longest-subsequence-that-sums-to-target/