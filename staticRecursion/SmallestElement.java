package staticRecursion;

public class SmallestElement {
	public static int getSmallest(int[] a, int total){ 
	    int temp; 
	    for (int i = 0; i < total; i++)  
	            { 
	                for (int j = i + 1; j < total; j++)  
	                { 
	                    if (a[i] > a[j])  
	                    { 
	                        temp = a[i]; 
	                        a[i] = a[j]; 
	                        a[j] = temp; 
	                    } 
	                } 
	            } 
	           return a[0]; 
	    } 
	    public static void main(String args[]){ 

	    int b[]={108, 100, 111, 420, 143, 225}; 
	    System.out.println("Smallest Element: "+getSmallest(b,6)); 

	    }
	   } 

