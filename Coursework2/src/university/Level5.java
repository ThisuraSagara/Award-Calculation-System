package university;
import java.util.ArrayList;

public class Level5 {
	public int getmarksL5(ArrayList<Integer> firstAttMarksL5){
		
		int marks = 0;
		 
		for (Integer i : firstAttMarksL5) {
			if( i >= 40){
				marks += i;
			}
		}
		return marks;
	}
	
	
	public int getfirstReferralCountL5(ArrayList<Integer> firstAttMarksL5){
		
		int firstReferralCount = 0;
		 
		for (Integer i : firstAttMarksL5) {
			if( i < 40 && i >= 30){
				  firstReferralCount += 1;
				}	
			}
		
		return firstReferralCount;
	}
	
    public int getRetakeCountL5(ArrayList<Integer> firstAttMarksL5){
		
		int RetakeCount = 0;
		 
		for (Integer i : firstAttMarksL5) {
			if( i < 30 && i >= 0){
				RetakeCount += 1;
			}
		}
		return RetakeCount;
	}
	
    public int getmarks2L5(ArrayList<Integer> firstReferralMarksL5Array){
		
		int marks = 0;
		 
		for (Integer i : firstReferralMarksL5Array) {
			if( i >= 40){
				marks += 40;
			}
		}
		return marks;
	}
	
    public int getRetakeCount2L5(ArrayList<Integer> firstReferralMarksL5Array){
		
		int RetakeCount = 0;
		 
		for (Integer i : firstReferralMarksL5Array) {
			if( i < 40 && i >= 0){
				RetakeCount += 1;
			}
		}
		return RetakeCount;
	}
    
    public int getmarks3L5(ArrayList<Integer> retakeMarksL5){
		
		int marks = 0;
		 
		for (Integer i : retakeMarksL5) {
			if( i >= 40){
				marks += i;
			}
		}
		return marks;
	}
    
    public int getsecondReferralCountL5(ArrayList<Integer> retakeMarksL5){
		
		
		int secondReferralCount = 0;
		 
		for (Integer i : retakeMarksL5) {
			if( i < 40 && i >= 30){
				secondReferralCount += 1;
			}	
		}
		return secondReferralCount;
	}
    
    
    public int getmarks4L5(ArrayList<Integer> retakeMarks2L5){
		
		int marks = 0;
		 
		for (Integer i : retakeMarks2L5) {
			if( i >= 40){
				marks += i;
			}
		}
		return marks;
	}
    
    public int getsecondReferralCount2L5(ArrayList<Integer> retakeMarks2L5){
		
		
		int secondReferralCount = 0;
		 
		for (Integer i : retakeMarks2L5) {
			if( i < 40 && i >= 30){
				secondReferralCount += 1;
			}	
		}
		return secondReferralCount;
	}
 
    
    public int getmarks5L5(ArrayList<Integer> secondReferralMarksL5Array){
    	
		int marks = 0;
		 
		for (Integer i : secondReferralMarksL5Array) {
			if( i >= 40){
				marks += 40;
			}
		}
		return marks;
	}
    
    public int getmarks6L5(ArrayList<Integer> secondReferralMarks2L5Array){
		
		int marks = 0;
		 
		for (Integer i : secondReferralMarks2L5Array) {
			if( i >= 40){
				marks += 40;
			}
		}
		return marks;
	}
}
