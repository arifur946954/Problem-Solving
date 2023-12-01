//package ProblemSolving;
//
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ExtractElements {
//    public static void main(String[] args) {
//        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
//
//        // Call the method to extract elements based on the pattern
//        int[] output = extractElements(input);
//
//        // Print the extracted elements
//        for (int element : output) {
//            System.out.print(element + " ");
//        }
//    }
//
//    // Method to extract elements based on the pattern
//    public static int[] extractElements(int[] input) {
//        List<Integer> extractedList = new ArrayList<>();
//
//        for (int i = 0; i < input.length; i += 3) {
//            extractedList.add(input[i]);
//        }
//
//        // Convert the List to an array
//        int[] output = new int[extractedList.size()];
//        for (int i = 0; i < extractedList.size(); i++) {
//            output[i] = extractedList.get(i);
//        }
//
//        return output;
//    }
//}
