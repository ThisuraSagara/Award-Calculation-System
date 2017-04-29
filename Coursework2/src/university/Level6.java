package university;

import java.util.ArrayList;

public class Level6 {
	int Credits = 0;
	
	public int getCredits() {
		return Credits;
	}

	public void setCredits(int credits) {
		Credits = credits;
	}
	
public int getmarksL6(ArrayList<Integer> firstAttMarksL6){
		
		int marks = 0;
		
		
		for (Integer i : firstAttMarksL6) {
			if( i >= 40){
				marks += i;
				Credits += 20;
			}
		
		}
		return marks;
	}

	

	public int getModule5marksL6(int FirstAttModule5L6){
	
		int marks = 0;
		
		if( FirstAttModule5L6 >= 40){
			marks += FirstAttModule5L6;
			Credits += 40;
		} 

		return marks;
	}
	
	
	public int getfirstReferralCountL6(ArrayList<Integer> firstAttMarksL6){
		
		int firstReferralCount = 0;
		 
		for (Integer i : firstAttMarksL6) {
			if( i < 40 && i >= 30){
				  firstReferralCount += 1;
				}	
			}
		
		return firstReferralCount;
	}
	
	public int getModule5firstReferralCountL6(int FirstAttModule5L6){
		
		int firstReferralCount = 0;
	
		if( FirstAttModule5L6 < 40 && FirstAttModule5L6 >= 30){
			
			  firstReferralCount += 1;
		} 
		return firstReferralCount;
	}
	
    public int getRetakeCountL6(ArrayList<Integer> firstAttMarksL6){
		
		int RetakeCount = 0;
		 
		for (Integer i : firstAttMarksL6) {
			if( i < 30 && i >= 0){
				RetakeCount += 1;
			}
		}
		return RetakeCount;
	}
    
    public int getModule5RetakeCountL6(int FirstAttModule5L6){
		
		int RetakeCount = 0;
		if( FirstAttModule5L6 < 30 && FirstAttModule5L6 >= 0){
			
			RetakeCount += 1;
		} 
		return RetakeCount;
	}
   
	
    public int getmarks2L6(ArrayList<Integer> firstReferralMarksL6Array){
		
		int marks = 0;
		 
		for (Integer i : firstReferralMarksL6Array) {
			if( i >= 40){
				marks += 40;
				Credits += 20;
			}
		}
		return marks;
	}
	
    public int getModule5marks2L6(int FirstReferralModule5L6){
    	
		int marks = 0;
		
		if( FirstReferralModule5L6 >= 40){
			marks += FirstReferralModule5L6;
			Credits += 40;
		} 
		return marks;
	}
    
    
    public int getRetakeCount2L6(ArrayList<Integer> firstReferralMarksL6Array){
		
		int RetakeCount = 0;
		 
		for (Integer i : firstReferralMarksL6Array) {
			if( i < 40 && i >= 0){
				RetakeCount += 1;
			}
		}
		return RetakeCount;
	}
    
    public int getModule5RetakeCount2L6(int FirstReferralModule5L6){
		
		int RetakeCount = 0;
	
		if( FirstReferralModule5L6 < 40 && FirstReferralModule5L6 > 0){
			
			RetakeCount += 1;
		} 
		return RetakeCount;
	}
    
    
    public int getmarks3L6(ArrayList<Integer> retakeMarksL6){
		
		int marks = 0;
		 
		for (Integer i : retakeMarksL6) {
			if( i >= 40){
				marks += i;
				Credits += 20;
			}
		}
		return marks;
	}
    
    public int getModule5marks3L6(int RetakeModule5L6){
    	
		int marks = 0;
		
		if( RetakeModule5L6 >= 40){
			marks += RetakeModule5L6;
			Credits += 40;
		} 
		return marks;
	}
    
    public int getsecondReferralCountL6(ArrayList<Integer> retakeMarksL6){
		
		
		int secondReferralCount = 0;
		 
		for (Integer i : retakeMarksL6) {
			if( i < 40 && i >= 30){
				secondReferralCount += 1;
			}	
		}
		return secondReferralCount;
	}
    
    public int getModule5secondReferralCountL6(int RetakeModule5L6){
    	
		int secondReferralCount = 0;
		
		if( RetakeModule5L6 < 40 && RetakeModule5L6 >= 30){
			secondReferralCount += 1;
		} 
		return secondReferralCount;
	}
//    public int getstopCountL4(ArrayList<Integer> retakeMarksL4){
//		
//		int stopCount = 0;
//		 
//		for (Integer i : retakeMarksL4) {
//			if( i < 30 && i >= 0){
//				stopCount += 1;
//			}
//		}
//		return stopCount;
//	}
    
    public int getmarks4L6(ArrayList<Integer> retakeMarks2L6){
		
		int marks = 0;
		 
		for (Integer i : retakeMarks2L6) {
			if( i >= 40){
				marks += i;
				Credits += 20;
			}
		}
		return marks;
	}
    
    public int getModule5marks4L6(int Retake2Module5L6){
    	
		int marks = 0;
		
		if( Retake2Module5L6 >= 40){
			marks += Retake2Module5L6;
			Credits += 40;
		} 
		return marks;
	}
    
    public int getsecondReferralCount2L6(ArrayList<Integer> retakeMarks2L6){
		
		
		int secondReferralCount = 0;
		 
		for (Integer i : retakeMarks2L6) {
			if( i < 40 && i >= 30){
				secondReferralCount += 1;
			}	
		}
		return secondReferralCount;
	}
    
    public int getModule5secondReferralCount2L6(int Retake2Module5L6){
    	
		int secondReferralCount = 0;

		if( Retake2Module5L6 < 40 && Retake2Module5L6 >= 30){
			secondReferralCount += 1;
		} 
		return secondReferralCount;
	}
    

    public int getmarks5L6(ArrayList<Integer> secondReferralMarksL6Array){
    	
		int marks = 0;
		 
		for (Integer i : secondReferralMarksL6Array) {
			if( i >= 40){
				marks += 40;
				Credits += 20;
			}
		}
		return marks;
	}
    
    public int getModule5marks5L6(int SecondReferralModule5L6){
    	
		int marks = 0;
		
		if( SecondReferralModule5L6 >= 40){
			marks += SecondReferralModule5L6;
			Credits += 40;
		} 
		return marks;
	}
    
    public int getmarks6L6(ArrayList<Integer> secondReferralMarks2L6Array){
		
		int marks = 0;
		 
		for (Integer i : secondReferralMarks2L6Array) {
			if( i >= 40){
				marks += 40;
				Credits += 20;
			}
		}
		return marks;
	}
    
    public int getModule5marks6L6(int SecondReferral2Module5L6){
    	
		int marks = 0;
		
		if( SecondReferral2Module5L6 >= 40){
			marks += SecondReferral2Module5L6;
			Credits += 40;
		} 
		return marks;
	}
    
}
