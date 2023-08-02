package leetcode;
import java.util.List;
import java.util.ArrayList;
//problem # 442

public class duplicate_cyclic {
    public List<Integer> findDuplicates(int[] nums) {

        int i=0;

        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        List<Integer> ans =new ArrayList<>();
        for(int index =0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(nums[index]);
            }

        }
        return ans;


    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
