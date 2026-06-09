class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(even);
        list.addAll(odd);
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=list.get(i);
        }
        return result;
    }
}