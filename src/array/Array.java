package array;

public class Array {
    public static void main(String[] args) {
        //for declear size
     int []arr1=new int[5];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        arr1[3]=4;
        arr1[4]=5;

        int i=0;
        for (i=0;i<arr1.length;i++){
            System.out.println("index:"+i +" " +arr1[i]);
        }
        System.out.println(i);

// not declear size
        int[] array={5,2,3,5,8,6,4};
        for (i=0;i<array.length;i++){
            System.out.println("index:"+i +" " +array[i]);
        }




    }
}
