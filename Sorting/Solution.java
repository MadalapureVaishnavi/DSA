class Solution {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,4};
       int a= removeDuplicates(arr);
       System.out.println(a);
    }
    public static int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
            if(nums[i]>nums[j])
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            
            if(nums[i]==nums[j])
            {
                count++;
            }
            return count;
            }
        }return -1;
    }
}