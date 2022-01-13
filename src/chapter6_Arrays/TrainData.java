package chapter6_Arrays;

public class TrainData {

		public static void main(String[] args)
		{
			// declare a 2D array
			int[][] late = new int[4][7];
			
			// position = number of times late
			
			// *** WEEK 0 ***
			late[0][0] = 10;
			late[0][1] = 0;
			late[0][2] = 0;
			late[0][3] = 0;
			late[0][4] = 6;
			late[0][5] = 0;
			late[0][6] = 0;
	
			// *** WEEK 1 ***
			late[1][0] = 0;
			late[1][1] = 0;
			late[1][2] = 5;
			late[1][3] = 0;
			late[1][4] = 0;
			late[1][5] = 0;
			late[1][6] = 0;
			
			// *** WEEK 2 ***
			late[2][0] = 0;
			late[2][1] = 2;
			late[2][2] = 0;
			late[2][3] = 0;
			late[2][4] = 0;
			late[2][5] = 1;
			late[2][6] = 0;
			
			// *** WEEK 4 ***
			late[3][0] = 0;
			late[3][1] = 0;
			late[3][2] = 0;
			late[3][3] = 2;
			late[3][4] = 0;
			late[3][5] = 0;
			late[3][6] = 3;
			
			displayArray(late);
			int daysLate = lateTrain(late);
			System.out.println("Days the train was late: " + daysLate);
		}
		
		
		static void displayArray(int[][] arrayIn) {
			System.out.println("TRAIN PUNCTUALITY DATA");
			for (int week = 1; week <= arrayIn.length; week++)
			{
				for(int day = 1; day <= arrayIn[0].length; day++)
				{
					System.out.println("Week " + week + " Day " + day + ": " + arrayIn[week-1][day-1]);
				}
			}
		}
	
		static int lateTrain(int[][] arrayIn) {
			int daysLate = 0;
			for (int week = 1; week <= arrayIn.length; week++)
			{
				for(int day = 1; day <= arrayIn[0].length; day++)
				{
					if (arrayIn[week-1][day-1] > 2)
					{
						daysLate++;
					}
				}
			}
			return daysLate;
		}

}
