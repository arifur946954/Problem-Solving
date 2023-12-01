//package ProblemSolving;
//
//public class countConsecutive {
//
//    public static int countConsecutive(int[] arr){
//        int max=0;
//        int min=0;
//        int finals=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==1){
//                max=max+arr[i];
//                if (finals<max){
//                    finals=max;
//                }
//
//
//            }
//            else {
//                max=0;
//            }
//
//        }
//        return  finals;
//        //System.out.println("number is: "+finals);
//
//    }
//    public static void main(String[] args) {
//
//            int[] number={1,1,0,0,0,1,1,1,1,0,1};
//          int x=  countConsecutive(number);
//        System.out.println(x);
//
//
//    }
//
//}
