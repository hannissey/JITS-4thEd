package chapter9_Inheritance;

public class CleaningRobot extends Robot {

	public String typeOfCleaningFluid;
	
	public CleaningRobot(String IdIn, int levelIn, String fluidIn)
	{
		super(IdIn, levelIn);
		typeOfCleaningFluid = fluidIn;
	}
	
	public String getTypeOfCleaningFluid()
	{
		return typeOfCleaningFluid;
	}
	
	@Override
	public void calculateWarningLevel()
	{
		
	}
}
