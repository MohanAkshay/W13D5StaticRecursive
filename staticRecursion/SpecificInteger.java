package staticRecursion;

import java.util.Arrays;

public class SpecificInteger {
	private static int data[] = {108, 100, 111, 420, 143, 225, 8, 4, 19};
    
    public static int recursiveBinarySearch (int d[], int g, int left, int right) {
        
         Arrays.sort(data);
         
        int middle = (left + right)/2;
        if (d[middle] != g && left <= right) {
            if (d[middle] > g) 
                return recursiveBinarySearch (d, g, left, middle-1);
            else 
                return recursiveBinarySearch (d, g, middle+1, right);
        }
            if (d[middle] == g) return middle;
            else return -1;
        }
    
    public static void main (String [] args) {
        int goal = 225;
        int result = recursiveBinarySearch(data, goal, 0, data.length-1);
        if (result < 0) System.out.println("TThe specified value could not be find: " + goal);
        else System.out.println("The index of the value" + goal + " was found at: " + result);
    }
}   

