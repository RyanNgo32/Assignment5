

public class HolidayBonus {
	
	final static int highestBonus = 5000; //highest bonus
	final static int lowestBonus = 1000;  //lowest bonus
	final static int otherBonus = 2000;   //other bonus
	
	public static double[] calculateHolidayBonus(double[][] array) //param 2d ragged array
	{
		double[] bonusArray = new double[array.length]; //create array of doubles 
		
		for(int rowIndex = 0; rowIndex < array.length;rowIndex++) //iterates through rows 
		{
			for(int colIndex = 0; colIndex < array[rowIndex].length;colIndex++) //iterates through columns
			{
				double highest = TwoDimRaggedArrayUtility.getHighestInColumn(array, colIndex); //set highest to highestInColumn call
				
				double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(array, colIndex); //set lowest to lowestInColumn call
				
				if(array[rowIndex][colIndex] == highest) //if array subscript is equal to highest element in column 
				{
					bonusArray[rowIndex] += highestBonus; //add highest bonus to row subscript
				}
				else if (array[rowIndex][colIndex] == lowest)//if array subscript is equal to lowest element in column
				{
					bonusArray[rowIndex] += lowestBonus; //add lowest bonus to row subscript
				}
				else
				{
					bonusArray[rowIndex] += otherBonus; //add bonus to rest of row subscripts that are not lowest or highest
				}
			}
		}
		return bonusArray; //return array
	}

		

	
	
	public static double calculateTotalHolidayBonus(double[][] array) 
	{
		
		double totalBonus = 0.0; //set a total
		
		double[] bonus = calculateHolidayBonus(array); // call calculate bonus method with argument bonus array
		
		for(int i = 0; i < array.length;i++) //goes through length of array
		{
			totalBonus += bonus[i]; //adds all bonuses together
		}
		return totalBonus; 
	}
}
