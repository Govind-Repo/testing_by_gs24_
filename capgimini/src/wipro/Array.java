package wipro;

import java.util.Arrays;

public class Array {

	public static int[] updatedArray(int []array1,int []array2) {
		
	    int size=array1.length+array2.length;
	    int[] array3 = new int[size];
	    int count=0;
       
        	for(int i=0;i<array1.length;i++) {
        		array3[i]=array1[i];
        	}
        	
        	for(int i=0;i<array2.length;i++) {
        		array3[i]=array2[i];
        	}
	    System.out.println(Arrays.toString(array3));
		return array3;
		
	}
	
	public static void main(String[] args) {

		int[] array1 = new int[] {1,3,6};
		int[] array2 = new int[] {4,5};
		
		int[] array3 = updatedArray(array1, array2);
		
		System.out.println(Arrays.toString(array3));
	}

}
