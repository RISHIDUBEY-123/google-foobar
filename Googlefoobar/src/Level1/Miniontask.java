package Level1;

import java.util.Scanner;

public class Miniontask {
	/*Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int[] data=new int[n];*/
	
	
	 public static int[] miniontask(int[] data, int n) {
	        int i = 0;

	        while (i < data.length) {
	            if (count(data, data[i]) > n ) {
	                  data = removeValue(data, data[i]); 
	            } else {
	               
	                i++;
	            }
	        }
	        
	        return data; 
	    }
	   
	    public static int count(int[] data, int number) {
	        int count = 0; //track number of times it appears
	        for (int i = 0; i < data.length; i++) {
	            if (data[i] == number) {
	                count++;
	            }
	        }

	        return count;
	    }
	    
	    
	    public static int[] removeValue(int[] data, int number) {
	        //integer holding length of the old array - the number of times
	        int newLength = data.length-count(data,number);
	        int[] newValues = new int[newLength]; //new array with the length
	        int track = 0; //index tracker for the new array

	        //iterate through the old array
	        for (int i = 0; i < data.length; i++) {
	            
	            if (data[i] != number) {
	                newValues[track] = data[i]; 
	                track++; 
	            }
	        }

	        return newValues; 
	       
	        
	    }
	}
	    
	

