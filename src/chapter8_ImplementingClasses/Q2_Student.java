package chapter8_ImplementingClasses;

/*
 * 		Student
		_________________________
		 
		-studentNumber : String 
		-studentName : String 
		-markForMaths : int 
		-markForEnglish : int 
		-markForScience : int 
		-fee: double
		_________________________
		
		+Student(String, String) 
		+getNumber() : String 
		+getName() : String 
		+enterMarks(int, int, int) 
		+getMathsMark() : int 
		+getEnglishMark() : int 
		+getScienceMark() : int 
		+calculateAverageMark() : double 
		+getFee(): double 
		+setFee(double)
 */

public class Q2_Student {

	private String studentNumber = " ";
	private String studentName = " ";
	private int markForMaths = -999;
	private int markForEnglish = -999;
	private int markForScience = -999;
	private static double fee = 3000;
	
	// constructor
	//	+Student(String, String) 
	public Q2_Student(String numberIn, String nameIn)
	{
		studentNumber = numberIn;
		studentName = nameIn;
	}
	
	//	+getNumber() : String 
	public String getNumber()
	{
		return studentNumber;
	}
	
	//	+getName() : String 
	public String getName()
	{
		return studentName;
	}
	
	//	+enterMarks(int, int, int) 
	public void enterMarks(int mathsIn, int englishIn, int scienceIn)
	{
		markForMaths = mathsIn;
		markForEnglish = englishIn;
		markForScience = scienceIn;		
	}
	
	//	+getMathsMark() : int 
	public int getMathsMark()
	{
		return markForMaths;
	}
	
	//	+getEnglishMark() : int 
	public int getEnglishMark()
	{
		return markForEnglish;
	}
	
	//	+getScienceMark() : int
	public int getScienceMark()
	{
		return markForScience;
	}
	
	//	+calculateAverageMark() : double 
	public double calculateAverageMark()
	{
		double result = -999;
		result = (markForMaths + markForEnglish  + markForScience) / 3.0;
		return result;
	}
	
	//	+getFee(): double 
	public static double getFee()
	{
		return fee;
	}
	
	//	+setFee(double)	
	public static double setFee(double feeIn)
	{
		fee = feeIn;
		return fee;
	}
	
}
