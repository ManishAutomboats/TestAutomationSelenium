package Random;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int [] t= {5,6,2,3,9};
		
	int l=	t.length;
		
		
//		 Arrays.sort(t);
//		  
	// god dog
	// silent listen
//		 
//		 System.out.println(t[l-2]);
//		  
	
	  int temp;
	
	     for(int i=0;i<l;i++) {
	    	 
	    	 for(int j=i+1;j<l;j++) {
	    		 
	    		 if(t[i]>t[j]) {
	    			 
	    			 temp=t[i];
	    			 t[i]=t[j];
	    			 t[j]=temp;
	    		 }
	    		 
	    	 }
	     }
	
	 System.out.println(t[l-2]);
	

	}

}
