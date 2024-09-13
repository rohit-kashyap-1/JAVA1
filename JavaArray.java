
import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {
        String[] students = {"Rohit","Mohit","Amit","Saurabh"};
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // System.out.println(Arrays.toString(students));
        // System.out.println(students[0]);
        // System.out.println(Arrays.deepToString(matrix));

        for(String i: students){
            System.out.println(i);
        }
    }
}
