package array;

public class ReturnArray {

    public static int[] get(){

        return new int[]{10,2,5,6,8,11,5};

    }
    public static void main(String[] args) {

        int arr[]=get();
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);



        }
    }

}
