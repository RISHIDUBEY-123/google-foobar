package Level1;

import java.util.Scanner;

public class main extends Miniontask{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	   
	    int[] data = new int[100];
	    for(int j=0; j<10; j++) {
	    	data[j] = scan.nextInt();
	    }
	    //int data=scan.nextInt(n);
	    int n=scan.nextInt();
	    miniontask(data, n);
	    
	}
	

}
