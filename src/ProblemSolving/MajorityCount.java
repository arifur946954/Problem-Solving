//package ProblemSolving;
//
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class MajorityCount {
//    public static int majorityElement(int[] nums) {
//        HashMap<Integer,Integer> hasMap=new HashMap<>();
//        for (int c:nums){
//            if (hasMap.containsKey(c)){
//                hasMap.put(c,hasMap.get(c)+1);//.get(c)=current value of c
//            }
//            else {
//                hasMap.put(c,1);
//            }
//
//        }
//      int maxRes=  countMaxValue(hasMap);
//
//return maxRes;
//    }
//
//    private static int countMaxValue(HashMap<Integer, Integer> hasMap) {
//        int maxValue=0;
//        int maxEntry=0;
//
//        for (Map.Entry<Integer,Integer> cou: hasMap.entrySet()){
//            if (cou.getValue()>maxValue){
//                maxValue=cou.getValue();
//                maxEntry=cou.getKey();
//            }
//
//        }
//        return maxEntry;
//    }
//
//
//    public static void main(String[] args) {
//        int[] nums={2,2,5,1,1,1,1,5,5,5,5,5,5,5,5,5,5,5,2,2,10};
//        int result=   majorityElement(nums);
//        System.out.println(result);
//
//
//    }
//
//
//}
