package university;
import java.util.ArrayList;

public class Level4 {	

	public int getcreditsL4(ArrayList<Integer> firstAttMarksL4){
		
		int credits = 0;
		
		for (Integer i : firstAttMarksL4) {
			if( i >= 40){
				credits += 20;
				
			}
		}
		
		return credits;
	}
	
    public int getcondoneCreditsL4(ArrayList<Integer> firstAttMarksL4){
    	
    	int condoneCreditsCount =0;
    	int condoneCredits = 0;
    	
		for (Integer i : firstAttMarksL4) {			
			if( i < 40 && i >= 30){
				if( condoneCreditsCount < 2){
					condoneCreditsCount += 1;
					condoneCredits += 20;
				}
			}
		}
		return condoneCredits;
	}
	
	public int getfirstReferralCountL4(ArrayList<Integer> firstAttMarksL4){
		
		int condoneCreditsCount =0;
		int firstReferralCount = 0;
		 
		for (Integer i : firstAttMarksL4) {
			if( i < 40 && i >= 30){
				if( condoneCreditsCount < 2){
					condoneCreditsCount += 1;
				}else{
				  firstReferralCount += 1;
				}	
			}
		}
		return firstReferralCount;
	}
	
    public int getRetakeCountL4(ArrayList<Integer> firstAttMarksL4){
		
		int RetakeCount = 0;
		 
		for (Integer i : firstAttMarksL4) {
			if( i < 30 && i >= 0){
				RetakeCount += 1;
			}
		}
		return RetakeCount;
	}
	
    public int getcredits2L4(ArrayList<Integer> firstReferralMarksL4Array){
		
		int credits = 0;
		 
		for (Integer i : firstReferralMarksL4Array) {
			if( i >= 40){
				credits += 20;
			}
		}
		return credits;
	}
	
    public int getRetakeCount2L4(ArrayList<Integer> firstReferralMarksL4Array){
		
		int RetakeCount = 0;
		 
		for (Integer i : firstReferralMarksL4Array) {
			if( i < 40 && i >= 0){
				RetakeCount += 1;
			}
		}
		return RetakeCount;
	}
    
    public int getcredits3L4(ArrayList<Integer> retakeMarksL4){
		
		int credits = 0;
		 
		for (Integer i : retakeMarksL4) {
			if( i >= 40){
				credits += 20;
			}
		}
		return credits;
	}
    
    public int getsecondReferralCountL4(ArrayList<Integer> retakeMarksL4){
		
		
		int secondReferralCount = 0;
		 
		for (Integer i : retakeMarksL4) {
			if( i < 40 && i >= 30){
				secondReferralCount += 1;
			}	
		}
		return secondReferralCount;
	}
    

    public int getcredits4L4(ArrayList<Integer> retakeMarks2L4){
		
		int credits = 0;
		 
		for (Integer i : retakeMarks2L4) {
			if( i >= 40){
				credits += 20;
			}
		}
		return credits;
	}
    
    public int getsecondReferralCount2L4(ArrayList<Integer> retakeMarks2L4){
		
		
		int secondReferralCount = 0;
		 
		for (Integer i : retakeMarks2L4) {
			if( i < 40 && i >= 30){
				secondReferralCount += 1;
			}	
		}
		return secondReferralCount;
	}
    
    
    public int getcredits5L4(ArrayList<Integer> secondReferralMarksL4Array){
    	
		int credits = 0;
		 
		for (Integer i : secondReferralMarksL4Array) {
			if( i >= 40){
				credits += 20;
			}
		}
		return credits;
	}
    
    public int getcredits6L4(ArrayList<Integer> secondReferralMarks2L4Array){
		
		int credits = 0;
		 
		for (Integer i : secondReferralMarks2L4Array) {
			if( i >= 40){
				credits += 20;
			}
		}
		return credits;
	}
    

}