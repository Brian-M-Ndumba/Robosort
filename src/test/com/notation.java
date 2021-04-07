package test.com;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class notation {
	
	List<Float> array = new ArrayList<Float>();
	List<String> arelement = new ArrayList<String>();
	Float f,g;
	String arr;
	Scanner Input;
	public void startprogramme(){
		
		 Input = new Scanner(System.in);
		System.out.println("Enter number to sort\n");
		
//check whether the input value is empty 
		
		while((arr = Input.nextLine()).isEmpty()){
//System.out.println(arr + "allal");
			calculateArr();
			
		} 
			addelement();
		
		
		
	}
	public void calculateArr() {
		   for(String i : arelement) {
		     g = Float.parseFloat(i);
		     array.add(g);
		    }
		    
//System.out.println("our number is " + array);
		int total = 0;
		for(float i : array) {
			
			total += i;
		
		}
		System.out.println(total);
	}
	
public void addelement() {
		
		arelement.add(arr);
		System.out.println(arelement);
		
		startprogramme();
}

	
	public static void main(String [] args) {
		
		System.out.println("\t\t\tHELLO, AM MR.Robosort\n \t\t  Engineer BRIAN MWENDA made me ;) \n \t\t   Am here to sort data for you\n ======================================================================");
		notation n = new notation();
		n.startprogramme();
		
		
	}
	

}
