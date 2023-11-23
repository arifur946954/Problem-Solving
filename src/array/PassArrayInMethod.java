package array;

public class PassArrayInMethod {
    //get the minimum number of an array using a method
    public static void main(String[] args) {
        int []num={33,5,2,22,11};
        minimum(num);

    }

    private static void minimum(int[] num) {
        int min=num[0];//33
        for (int i=0;i<num.length-1;i++){
            if (min>num[i+1]){
                min=num[i+1];
            }


        }
        System.out.println("Minimum Output is: "+min);


    }
}
