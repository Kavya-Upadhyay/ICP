class Solution {
    public String findDifferentBinaryString(String[] nums) {
        // int[] arr=new int[nums.length];
        // int len=nums[0].length();
        // for(int i=0;i<nums.length;i++)
        // {
        //     int num=Integer.parseInt(nums[i],2);
        //     arr[i]=num;
        // }
        // Arrays.sort(arr);
        // int i;
        // String val="";
        // for(i=0;i<nums.length;i++)
        // {
        //     if(arr[i]!=i) 
        //     {
        //         val=Integer.toBinaryString(i);
        //         break;
        //     }
        // }
        // if(val.length()==len)
        // {
        //     return val;
        // }
        // val=Integer.toBinaryString(i);
        // int diff=len-val.length();
        // for(int j=0;j<diff;j++)
        // {
        //     val="0"+val;
        // }
        // return val;

        int n=nums.length;
        char[] arr=new char[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=(nums[i].charAt(i)=='1')?'0':'1';
        }
        return new String(arr);
        
    }
}