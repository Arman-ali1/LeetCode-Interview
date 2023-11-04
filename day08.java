
// Day68
// 1822. Sign of the Product of an Array 😃
// I have use iterative solution for this Approach
// Can any approach optimal solution for the same
// DSA with JAVA
// code:= ===========
public int arraySign(int[] nums) {
    long pro=1;
    for(int i=0;i<nums.length;i++){
    pro=(pro*nums[i])%2147483647;
    }
    System.out.println(pro);
    if(pro>0)
    return 1;
    if(pro<0)
    return -1;
    if(pro==0)
    return 0;
    return -1;
}
// ============
// hashtag#LeetCode
// hashtag#daily challenge
// 68/100;