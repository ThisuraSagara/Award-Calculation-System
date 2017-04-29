package university;

import java.util.ArrayList;

public class Validation {
	
	public String getval1L4(ArrayList<Integer> firstAttMarksL4){
		
		String val = null ;
		
		for (Integer i : firstAttMarksL4) {
			if( i > 100 || i < 0){
				val = "hfhfh";
			}
		}
		return val;
	}
	
	
	
}