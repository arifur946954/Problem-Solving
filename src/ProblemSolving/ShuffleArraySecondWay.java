package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;

class ShuffleArraySecondWay {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            temp.add(nums[i]);
            temp.add(nums[i+n]);

        }
        //convert arrayList to array
        int[] result=new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            result[i]=temp.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        ShuffleArraySecondWay solution=new ShuffleArraySecondWay();

        int[] nums={1,2,3,4,4,3,2,1};
        int n=4;

        int[] value=solution.shuffle(nums,n);

        System.out.println(Arrays.toString(value));
    }

}

