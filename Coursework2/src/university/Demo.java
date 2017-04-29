package university;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	
	static int total = 0;
	static int credit = 0;
	static int FirstReferrel = 0;
	static int Retake = 0;
	static int SecondReferrel = 0;
	static String award = null;
	static String val = null;
	
	
	public static void main (String[]args){
		while (true) {
			
//			 Level 4 Array Lists
			ArrayList<Integer> firstAttMarksL4Array = new ArrayList<Integer>();
			ArrayList<Integer> firstReferralMarksL4Array = new ArrayList<Integer>();
			ArrayList<Integer> retakeMarksL4Array = new ArrayList<Integer>();
			ArrayList<Integer> retakeMarks2L4Array = new ArrayList<Integer>();
			ArrayList<Integer> secondReferralMarksL4Array = new ArrayList<Integer>();
			ArrayList<Integer> secondReferralMarks2L4Array = new ArrayList<Integer>();
			
			
//			
			Student s1 = new Student();
			Level4 l4 = new Level4();
			Level5 l5 = new Level5();
			Level6 l6 = new Level6();
			Validation vali = new Validation();
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("University of Gugsi, No where in Particular");
			System.out.println("--------------------------------------------");
			System.out.print("Please Enter your Name : ");
			s1.setName(sc.next());
			
			System.out.print("Please Enter your Student Number : ");
			s1.setNumber(sc.next());
			
			try {
//				Level 4 stating point 
				System.out.println("                                            ");
				System.out.println("Level 4");
				System.out.println("============================================");
				
//				get first attempt marks
				for (int i = 1; i < 7; i++) {
					System.out.print("First Attempt in Module "+i+"? ");
					firstAttMarksL4Array.add(Integer.parseInt(sc.next()));
					
				}
				
				s1.setfirstAttMarksL4(firstAttMarksL4Array);
				
//				get first referral marks
				int x = l4.getfirstReferralCountL4(s1.getfirstAttMarksL4());
				FirstReferrel += x;
				if(0 != x){
					System.out.println("  ");
					System.out.println("First Attempt Fail module");
				}
				for (int i = 1; i <= x; i++) {
					System.out.print("First Referral in Module "+i+"? ");
					firstReferralMarksL4Array.add(Integer.parseInt(sc.next()));
				}
				
				s1.setfirstReferralMarksL4Array(firstReferralMarksL4Array);
				
//				get Retake marks													
				int y = l4.getRetakeCountL4(s1.getfirstAttMarksL4());
				Retake += y;
				if(0 != y){
					System.out.println("  ");
					System.out.println("First Attempt Fail module");
				}
				for (int i = 1; i <= y; i++) {
					System.out.print("Retake in Module "+i+"? ");
					retakeMarksL4Array.add(Integer.parseInt(sc.next()));
				}
				
				s1.setretakeMarksL4Array(retakeMarksL4Array);
				
				
				int q = l4.getRetakeCount2L4(s1.getfirstReferralMarksL4Array());
				Retake += q;
				if(0 != q){
					System.out.println("  ");
					System.out.println("First Referral Fail module");
				}
				for (int i = 1; i <= q; i++) {
					System.out.print("Retake in Module "+i+"? ");
					retakeMarks2L4Array.add(Integer.parseInt(sc.next()));
				}
				
				s1.setretakeMarks2L4Array(retakeMarks2L4Array);
		
//				get Second Referral marks
				int z = l4.getsecondReferralCountL4(s1.getretakeMarksL4());
				SecondReferrel += z;
				if(0 != z){
					System.out.println("  ");
					System.out.println("Retake Fail module");
				}
				for (int i = 1; i <= z; i++) {
					System.out.print("Second Referral in Module "+i+"? ");
					secondReferralMarksL4Array.add(Integer.parseInt(sc.next()));
				}
				
				s1.setsecondReferralMarksL4Array(secondReferralMarksL4Array);
				
				int v = l4.getsecondReferralCount2L4(s1.getretakeMarks2L4());
				SecondReferrel += v;
				if(0 != x){
					System.out.println("  ");
					System.out.println("First Referral and Retake Fail module");
				}
				for (int i = 1; i <= v; i++) {
					System.out.print("Second Referral in Module "+i+"? ");
					secondReferralMarks2L4Array.add(Integer.parseInt(sc.next()));
				}
				
				s1.setsecondReferralMarks2L4Array(secondReferralMarks2L4Array);
				
//				calculate level 4 credits
				credit += l4.getcreditsL4(s1.getfirstAttMarksL4());
				credit += l4.getcondoneCreditsL4(s1.getfirstAttMarksL4());
				credit += l4.getcredits2L4(s1.getfirstReferralMarksL4Array());
				credit += l4.getcredits3L4(s1.getretakeMarksL4());
				credit += l4.getcredits4L4(s1.getretakeMarks2L4());
				credit += l4.getcredits5L4(s1.getsecondReferralMarksL4Array());
				credit += l4.getcredits6L4(s1.getsecondReferralMarks2L4Array());
				
				System.out.println(" ");
				System.out.println("You have get "+credit+" Credits");
				System.out.println("You get "+l4.getcondoneCreditsL4(s1.getfirstAttMarksL4())+" CondoneCredits");
				
				
//				check credits to continue the degree program 
				if(credit == 120){
					System.out.println("You have successfully complete the Level 4");
					System.out.println(" ");
					System.out.println("If you want to Exit from the Degree program you can get a Cert HE ? Yes/No ");
					String str = sc.next();
					
//					Give the Cert HE
					if(str.equalsIgnoreCase("Yes")){
						 award = "Cert HE";
						 System.out.println(" ");
						 System.out.println("Congratulations !");
						 System.out.println("You complete Certificate of Higher Education");
						 System.out.println(" ");
					}else if(str.equalsIgnoreCase("No")){

//						Level 5 stating point 
						System.out.println(" ");
						System.out.println("============================================");
						System.out.println("Level 5");
						
//						Level 5 Array lists 
						ArrayList<Integer> firstAttMarksL5Array = new ArrayList<Integer>();
						ArrayList<Integer> firstReferralMarksL5Array = new ArrayList<Integer>();
						ArrayList<Integer> retakeMarksL5Array = new ArrayList<Integer>();
						ArrayList<Integer> retakeMarks2L5Array = new ArrayList<Integer>();
						ArrayList<Integer> secondReferralMarksL5Array = new ArrayList<Integer>();
						ArrayList<Integer> secondReferralMarks2L5Array = new ArrayList<Integer>();
					
//						get first attempt marks
						for (int i = 1; i < 7; i++) {
							System.out.print("First Attempt in Module "+i+"? ");
							firstAttMarksL5Array.add(Integer.parseInt(sc.next()));
						}
						
						s1.setfirstAttMarksL5(firstAttMarksL5Array);
						
//						get First referral attempt marks
						int a = l5.getfirstReferralCountL5(s1.getfirstAttMarksL5());
						FirstReferrel += a;
						if(0 != a){
							System.out.println("  ");
							System.out.println("First Attempt Fail module");
						}
						for (int i = 1; i <= a; i++) {
							System.out.print("First Referral in Module "+i+"? ");
							firstReferralMarksL5Array.add(Integer.parseInt(sc.next()));
						}
						
						s1.setfirstReferralMarksL5Array(firstReferralMarksL5Array);
						
//						get Retake attempt marks													
						int b = l5.getRetakeCountL5(s1.getfirstAttMarksL5());
						Retake += b;
						if(0 != b){
							System.out.println("  ");
							System.out.println("First Attempt Fail module");
						}
						for (int i = 1; i <= b; i++) {
							System.out.print("Retake in Module "+i+"? ");
							retakeMarksL5Array.add(Integer.parseInt(sc.next()));
						}
						
						s1.setretakeMarksL5Array(retakeMarksL5Array);
						
						
						int c = l5.getRetakeCount2L5(s1.getfirstReferralMarksL5Array());
						Retake += c;
						if(0 != c){
							System.out.println("  ");
							System.out.println("First Referral Fail module");
						}
						for (int i = 1; i <= c; i++) {
							System.out.print("Retake in Module "+i+"? ");
							retakeMarks2L5Array.add(Integer.parseInt(sc.next()));
						}
						
						s1.setretakeMarks2L5Array(retakeMarks2L5Array);
				
//						get second referral attempt marks
						int d = l5.getsecondReferralCountL5(s1.getretakeMarksL5());
						SecondReferrel += d;
						if(0 != d){
							System.out.println("  ");
							System.out.println("Retake Fail module");
						}
						for (int i = 1; i <= d; i++) {
							System.out.print("Second Referral in Module "+i+"? ");
							secondReferralMarksL5Array.add(Integer.parseInt(sc.next()));
						}
						
						s1.setsecondReferralMarksL5Array(secondReferralMarksL5Array);
						
						
						int e = l5.getsecondReferralCount2L5(s1.getretakeMarks2L5());
						SecondReferrel += e;
						if(0 != e){
							System.out.println("  ");
							System.out.println("First Referral and Retake Fail module");
						}
						for (int i = 1; i <= e; i++) {
							System.out.print("Second Referral in Module "+i+"? ");
							secondReferralMarks2L5Array.add(Integer.parseInt(sc.next()));
						}
						
						s1.setsecondReferralMarks2L5Array(secondReferralMarks2L5Array);
						
//						calculate total marks in level 5
						total += l5.getmarksL5(s1.getfirstAttMarksL5());
						total += l5.getmarks2L5(s1.getfirstReferralMarksL5Array());
						total += l5.getmarks3L5(s1.getretakeMarksL5());
						total += l5.getmarks4L5(s1.getretakeMarks2L5());
						total += l5.getmarks5L5(s1.getsecondReferralMarksL5Array());
						total += l5.getmarks6L5(s1.getsecondReferralMarks2L5Array());
						
						int avg1 = total/6;

//						calculate credits in level 5 and check credits to continue the degree program
							if (avg1 >= 40 ){
								credit += 120;

						System.out.println(" ");
						System.out.println("You have get "+credit+" Credits");
						System.out.println("You have successfully complete the Level 5");
						System.out.println(" ");
						
//						Give Dip HE
						System.out.println("If you want to Exit from the Degree program you can get a Dip HE ? Yes/No ");						
						String str1 = sc.next();
						if(str1.equalsIgnoreCase("Yes")){
							 award = "Dip HE";
							 System.out.println("Congratulations !");
							 System.out.println("You complete Diploma in Higher Education");
						}else if(str1.equalsIgnoreCase("No")){
							System.out.println(" ");
							System.out.println("============================================");
							System.out.println("Level 6");
						
//							Level 6 Array lists
							ArrayList<Integer> firstAttMarksL6Array = new ArrayList<Integer>();
							ArrayList<Integer> firstReferralMarksL6Array = new ArrayList<Integer>();
							ArrayList<Integer> retakeMarksL6Array = new ArrayList<Integer>();
							ArrayList<Integer> retakeMarks2L6Array = new ArrayList<Integer>();
							ArrayList<Integer> secondReferralMarksL6Array = new ArrayList<Integer>();
							ArrayList<Integer> secondReferralMarks2L6Array = new ArrayList<Integer>();
							
//							get first attempt marks
							for (int i = 1; i < 5; i++) {
								System.out.print("First Attempt in Module "+i+"? ");
								firstAttMarksL6Array.add(Integer.parseInt(sc.next()));
							}
							
							s1.setfirstAttMarksL6(firstAttMarksL6Array);
							
							
							System.out.print("First Attempt in Module 5?(double credit) ");
							s1.setFirstAttModule5L6(Integer.parseInt(sc.next()));
							
//							get first referral marks
							int f = l6.getfirstReferralCountL6(s1.getfirstAttMarksL6());
							FirstReferrel += f;
							if(0 != f){
								System.out.println("  ");
								System.out.println("First Attempt Fail module");
							}
							for (int i = 1; i <= f; i++) {
								System.out.print("First Referral in Module "+i+"? ");
								firstReferralMarksL6Array.add(Integer.parseInt(sc.next()));
							}
							
							s1.setfirstReferralMarksL6Array(firstReferralMarksL6Array);
							
							
							int FR1 = l6.getModule5firstReferralCountL6(s1.getFirstAttModule5L6());
							FirstReferrel += FR1;
							if (0 < FR1 ){
							System.out.println("  ");
							System.out.println("First Attempt Fail module");
							System.out.print("First Referral in Module 5?(double credit) ");
							s1.setFirstReferralModule5L6(Integer.parseInt(sc.next()));
							}
							
//							get Retake marks
							int j = l6.getRetakeCountL6(s1.getfirstAttMarksL6());
							Retake += j;
							if(0 != j){
								System.out.println("  ");
								System.out.println("First Attempt Fail module");
							}
							for (int i = 1; i <= j; i++) {
								System.out.print("Retake in Module "+i+"? ");
								retakeMarksL6Array.add(Integer.parseInt(sc.next()));
							}
							
							s1.setretakeMarksL6Array(retakeMarksL6Array);
							
							int RC1 = l6.getModule5RetakeCountL6(s1.getFirstAttModule5L6());
							Retake += RC1;
							if (0 < RC1){
							System.out.println("  ");
							System.out.print("Retake in Module 5?(double credit) ");
							s1.setRetakeModule5L6(Integer.parseInt(sc.next()));
							}
							
							int k = l6.getRetakeCount2L6(s1.getfirstReferralMarksL6Array());
							Retake += k;
							if(0 != k){
								System.out.println("  ");
								System.out.println("First Referral Fail module");
							}
							for (int i = 1; i <= k; i++) {
								System.out.print("Retake in Module "+i+"? ");
								retakeMarks2L6Array.add(Integer.parseInt(sc.next()));
							}
							
							s1.setretakeMarks2L6Array(retakeMarks2L6Array);
							
							int RC2 = l6.getModule5RetakeCount2L6(s1.getFirstReferralModule5L6());
							Retake += RC2;
							if (0 < RC2){
								System.out.println("  ");
								System.out.println("First Referral Fail module");
							System.out.print("Retake in Module 5?(double credit) ");
							s1.setRetake2Module5L6(Integer.parseInt(sc.next()));
							}
							
//							get Second Referral Marks
							int l = l6.getsecondReferralCountL6(s1.getretakeMarksL6());
							SecondReferrel += l;
							if(0 != j){
								System.out.println("  ");
								System.out.println("Retake Fail module");
							}
							for (int i = 1; i <= l; i++) {
								System.out.print("Second Referral in Module "+i+"? ");
								secondReferralMarksL6Array.add(Integer.parseInt(sc.next()));
							}
							
							s1.setsecondReferralMarksL6Array(secondReferralMarksL6Array);
							
							int SR1 = l6.getModule5secondReferralCountL6(s1.getRetakeModule5L6());
							SecondReferrel += SR1;
							if (0 < SR1){
								System.out.println("  ");
								System.out.println("Retake Fail module");
							System.out.print("Second Referral in Module 5?(double credit) ");
							s1.setSecondReferralModule5L6(Integer.parseInt(sc.next()));
							}
							
							int m = l6.getsecondReferralCount2L6(s1.getretakeMarks2L6());
							SecondReferrel += m;
							if(0 != j){
								System.out.println("  ");
								System.out.println("First Referral and Retake Fail module");
							}
							for (int i = 1; i <= m; i++) {
								System.out.print("Second Referral in Module "+i+"? ");
								secondReferralMarks2L6Array.add(Integer.parseInt(sc.next()));
							}
							
							s1.setsecondReferralMarks2L6Array(secondReferralMarks2L6Array);
							
							int SR2 = l6.getModule5secondReferralCount2L6(s1.getRetake2Module5L6());
							SecondReferrel += SR2;
							if (0 < SR2){
								System.out.println("  ");
								System.out.println("First Referral and Retake Fail module");
							System.out.print("Second Referral in Module 5?(double credit) ");
							s1.setSecondReferral2Module5L6(Integer.parseInt(sc.next()));
							}
							
							
//							calculate total marks in level 6
							total += l6.getmarksL6(s1.getfirstAttMarksL6());
							total += l6.getmarks2L6(s1.getfirstReferralMarksL6Array());
							total += l6.getmarks3L6(s1.getretakeMarksL6());
							total += l6.getmarks4L6(s1.getretakeMarks2L6());
							total += l6.getmarks5L6(s1.getsecondReferralMarksL6Array());
							total += l6.getmarks6L6(s1.getsecondReferralMarks2L6Array());
							total += l6.getModule5marksL6(s1.getFirstAttModule5L6());
							total += l6.getModule5marks2L6(s1.getFirstReferralModule5L6());
							total += l6.getModule5marks3L6(s1.getRetakeModule5L6());
							total += l6.getModule5marks4L6(s1.getRetake2Module5L6());
							total += l6.getModule5marks5L6(s1.getSecondReferralModule5L6());
							total += l6.getModule5marks6L6(s1.getSecondReferral2Module5L6());
							
							
//							calculate credits in level 5 and check credits to continue the degree program
							credit += l6.getCredits();
							if (credit >= 300 && credit < 360){
								award = "Non-honors Degree";
								System.out.println(" ");
								 System.out.println("Congratulations !");
								 System.out.println("You complete Non-honors Degree program");
							}else if (credit < 300 && credit > 240 ){
								award = "Dip HE";
								System.out.println(" ");
								 System.out.println("Congratulations !");
								 System.out.println("You complete Diploma in Higher Education");
							}
							
//							AwardCalculator
						    if(credit == 360){
						    	int avg = total/11;
						    	if (70 <= avg){
						    		award = "First Class Honours Degree";
						    		System.out.println(" ");
									 System.out.println("Congratulations !");
									 System.out.println("You complete your Degree program with First Class Honours ");
						    	}else if (60 <= avg){
						    		award = "Second Class Honours Upper Division Degree";
						    		System.out.println(" ");
									 System.out.println("Congratulations !");
									 System.out.println("You complete your Degree program with Second Class Honours Upper Division ");
						    	}else if (50 <= avg){
						    		award = "Second Class Honours Lower Division Degree";
						    		System.out.println(" ");
									 System.out.println("Congratulations !");
									 System.out.println("You complete your Degree program with Second Class Honours Lower Division ");
						    	}else if (40 <= avg){
						    		award = "Third Class Honours Degree";
						    		System.out.println(" ");
									 System.out.println("Congratulations !");
									 System.out.println("You complete your Degree program with Third Class Honours ");
						    	}
						    }
							
						}else{
							System.out.println(" ");
							System.out.println("Invalid input entered!!");
						}
						
						}else{
							System.out.println(" ");
							System.out.println("Sorry !! You can't continue the Degree program.");
							System.out.println("You didn't take 240 Credits");
							System.out.println("                                               ");
						}
					}else{
						System.out.println(" ");
						System.out.println("Invalid input entered!!");
					}
				}else{
					System.out.println(" ");
					System.out.println("Sorry !! You can't continue the Degree program.");
					System.out.println("You didn't take 120 Credits");
					System.out.println("                                               ");
				}
				
				
//				put value in to the file
				
				String res = "Name: "+s1.getName()+" - Number: "+s1.getNumber()+"\n";
				
				res += "Credits: "+credit+" class: "+award;
				
				Demo demo1 = new Demo();
				demo1.writeToFile(res);
			} catch (NumberFormatException e) {
//				e.printStackTrace();
				System.out.println("Invalid Number entered!!");
			}
		}
	}
	
//	creating a File
	public void writeToFile(String data){
		File file = new File("C:/Users/ASUS/workspace/Coursework2/src/university/results.txt");
		
		PrintWriter pw = null;
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file, true);
			pw = new PrintWriter(fw, true);	
			
			pw.println(data);
			
			System.out.println("Succefully Written!");
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
		}
	}
}