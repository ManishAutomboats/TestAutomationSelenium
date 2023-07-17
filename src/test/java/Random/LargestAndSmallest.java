package Random;

import java.util.Arrays;

public class LargestAndSmallest {

	public static void main(String[] args) {
	
		
		 int []t= {45,67,33,0,12,5,90};
		 
		 // largest
		 // smallest
		 
		 
		 int largest= t[0];
		 int smallest=t[0];
		 
		 for(int i=1;i<t.length;i++) {
			 
			 if(t[i]>largest) {
				 largest=t[i];
			 } else if(t[i]<smallest) {
				 smallest=t[i];
			 }
		 }
		 System.out.println(Arrays.toString(t));
		 System.out.println(largest);
		 System.out.println(smallest);

	}

}
