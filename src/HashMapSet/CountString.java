//package HashMapSet;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class CountString {
//    public  static void getCharCount(String name){
//        HashMap<Character,Integer> hNmae=new HashMap<Character, Integer>();
//       String lowName=name.toLowerCase();
//       char[] arrStr=lowName.toCharArray();
//        for (char c: arrStr){
//            //containKey return true or false
//            if (hNmae.containsKey(c)){
//                hNmae.put(c,hNmae.get(c)+1);
//            }
//            else {
//                hNmae.put(c,1);
//            }
//        }
//        System.out.println(hNmae);
//    }
//
//    public static void main(String[] args) {
//
//getCharCount("Hello World");
//
//
//
//    }
//}
