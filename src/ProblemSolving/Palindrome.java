package ProblemSolving;

import java.util.Arrays;

public class Palindrome {
    private static boolean isPalindrome(int x) {
      int[] arr=  intTOArray(x);//x=-1234

      //arr={1,2,3,4}
        //array to string
        StringBuilder sb=new StringBuilder();
        for (int j:arr){
            sb.append(j);
        }
        int num=Integer.parseInt(sb.toString());
        boolean z;
        if (x==num){
             z=true;
        }
        else {
            z=false;
        }
        return z;


    }

    private static int[] intTOArray(int x) {
        int count=0;
        int temp=x;
        while (temp!=0){//1234
            temp=temp/10;
            count++;

        }
        int [] arr=new int[count];
        int num=x;
        for (int i=0;i<count;i++){
            System.out.println(x);
            arr[i]=num%10;//1234
               num=num/10;

        }

        String arrayAsString = Arrays.toString(arr);
        System.out.println(arrayAsString);
        return arr;



    }


    public static void main(String[] args) {
        int x=121;
      boolean result=  isPalindrome(x);
        System.out.println(result);
    }



}
