package staticRecursion;

public class SumOfTheElements {

	public static void main(String args[]){
        int[] array = {108, 100, 111, 420, 143, 225};
        int sum = 0;
        //Advanced for loop
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum Of The Elements: "+sum);
     }
  }
