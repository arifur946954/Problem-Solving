package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class MajorityCount {
    private static int  majorityCount(int[] toArr) {
        HashMap<Integer,Integer> hm1=new HashMap<>();
       for (int c:toArr){
           if (hm1.containsKey(c)){
               hm1.put(c,hm1.get(c)+1);
           }
           else {
               hm1.put(c,1);
           }
       }
       // System.out.println(hm1);
 int[] x=  maxValues(hm1);
    }

    private int  maxValues(HashMap<Integer, Integer> hm1) {
        int maxV=0;
        int maxKey=0;

      for (Map.Entry<Integer,Integer> m:hm1.entrySet() ){
          if (m.getValue()>maxV){
              maxV= m.getValue();
              int  maxKey=m.getKey();
              System.out.println(maxKey+":"+maxV);

          }
          else {

          }




      }
        return maxKey;

    }


    public static void main(String[] args) {
        int toArr[]={2,2,1,1,1,9,9,9,9,9,9,9,9};
      int[] z=  majorityCount(toArr);
    }


}
