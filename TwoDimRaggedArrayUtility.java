/*
 * Class: CMSC203 32689
 * Instructor: Professor Grinberg
 * Description: (Takes data from a file and passes it it to a ragged array and will be passed through different methods that will 
	calculate total, average, get totals of specific rows and columns and also indexes of rows and columns, find the highest and lowest elements and indexes of rows and columns.
 	As well as finding lowest and highest values of ragged array. )
 * Due: 04/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Ryan Ngo
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TwoDimRaggedArrayUtility {
	
	public static double[][] readFile(File file)throws FileNotFoundException
	{

		int rows = 0; 
		
		Scanner infile = new Scanner(file); //read input from file
		
		while(infile.hasNextLine()) //while infile has another line 
		{
			rows++; //increment row
			infile.nextLine(); //looks at next line
		}
		
		//System.out.println(rows);
		
		infile.close(); //closes file
		
		infile = new Scanner(file);
		
		double[][] raggedArray = new double[rows][]; //creates ragged array of doubles with text file length as rows
		
		for(int i = 0; i < rows; i++) //iterates for rows 
		{
			String line = new String(infile.nextLine());
			
			String[] tokens = line.split(" ", 0); // takes all the numbers and put it into tokens with space
			
			raggedArray[i] = new double[tokens.length];
			
			for(int j = 0; j < tokens.length;j++) //iterates for columns 
			{
				raggedArray[i][j] = Double.parseDouble(tokens[j]); //changes tokens string and turns it into double
			}
		}
		
		infile.close(); //close file 
		
		return raggedArray; //return array
	}
	
	public static void writeToFile(double[][] array, File file) throws FileNotFoundException {
		
		PrintWriter outputFile = new PrintWriter(file);//print writer object
		
		for(int i = 0; i < array.length; i++) //for each row 
		{
			for(int j = 0; j < array[i].length; j++) //iterates over columns
			{
				outputFile.println(array[i][j]); //writes each element into file
				
			}
		}
		outputFile.close(); //closes file 
	}

	public static double getTotal(double[][] array)
	{
		double total = 0.0; //initialize sum
		
		for(int i = 0; i < array.length; i++) //for each row 
		{
			for(int j = 0; j < array[i].length; j++) //iterates over columns
			{
				total += array[i][j]; //adds each element to total
				
			}
		}
		return total; //returns total
	}
	
	public static double getAverage(double[][] array)
	{
		double elements = 0.0; //initialize sum
		
		for(int i = 0; i < array.length; i++) //for each row 
		{
			for(int j = 0; j < array[i].length; j++) //iterates over columns
			{
				elements++; //adds 1 for each element
				
			}
		}
		
		return getTotal(array)/ elements; //returns average
	}
	
	public static double getRowTotal(double[][] array, int rowIndex)
	{
		double totalRows = 0.0; //initializes total rows 
		
		for(int i = 0; i < array[rowIndex].length; i++) 
		{
			totalRows += array[rowIndex][i]; // adds to total
		}
		
		return totalRows;//returns total
	}
	
	public static double getColumnTotal(double[][] array, int columnIndex)
	{
		double totalColumn = 0.0;
		
		for(int i = 0; i < array.length; i++) 
		{
			if(columnIndex < array[i].length)
			{
				totalColumn += array[i][columnIndex]; 
			}
		}
		return totalColumn;
	}
	
	public static double getHighestInRow(double[][] array, int rowIndex)
	{
		double highest = array[rowIndex][0]; //set first value to highest 
		
		for(int i = 0; i < array[rowIndex].length;i++) // runs through rows 
		{
			if(array[rowIndex][i] > highest) //if new element is greater than highest set highest to new element
			{
				highest = array[rowIndex][i]; //set new subscript as highest
			}
		}
		
		return highest; //return highest
	}
	
	public static int getHighestInRowIndex(double[][] array, int rowIndex)
	{
		double highest = array[rowIndex][0]; //initialize first value as highest index
		
		int highestIndex = 0; //initialize highest to 0 
		
		for(int i = 0; i < array[rowIndex].length;i++) // runs through elements of index of that row 
		{
			if(array[rowIndex][i] > highest) //if new element is greater than highest set highest to new element
			{
				
				highest = array[rowIndex][i]; //will set new highest to element of specified row
				
				highestIndex = i; //assign highest index to i which is highest value
			}
		}
		
		
		return highestIndex; //returns value
	}
		
	public static double getLowestInRow(double[][] array, int rowIndex)
	{
		double lowest = array[rowIndex][0]; //set first value to highest 
		
		for(int i = 0; i < array[rowIndex].length;i++) // runs through rows 
		{
			if(array[rowIndex][i] < lowest) //if new element is greater than highest set highest to new element
			{
				lowest = array[rowIndex][i]; //assign subscript to lowest
			}
		}
		
		return lowest; //return lowest
	}
	
	public static int getLowestInRowIndex(double[][] array, int RowIndex)
	{
		double lowest = array[RowIndex][0]; //set first value to highest 
		
		int lowestIndex = 0; //set lowest index 
		
		for(int i = 0; i < array[RowIndex].length;i++)   
		{
			
			if(array[RowIndex][i] < lowest) //if new element is greater than highest set lowest to new element
			{
				lowest = array[RowIndex][i]; //sets lowest to new value
				
				lowestIndex = i; //sets element to lowest of index
			}
		}
		
		
		return lowestIndex; //return value
	}
	
	
	
	public static double getHighestInColumn(double[][] array, int columnIndex)
	{
		
		double highest;
		
		if(array[0].length > columnIndex)
		{
			highest = array[0][columnIndex];//set first value to highest
		}
		else 
		{
			highest = 0;
		}
		
		
		for(int i = 0; i < array.length;i++) // runs through rows 
		{
			
			if(array[i].length > columnIndex && array[i][columnIndex] > highest) //if index is greater than array then don't execute 2nd half 
			{
				highest = array[i][columnIndex]; //initialize new highest
			}
		}
			
		return highest; //returns highest
		
	}
		
	public static int getHighestInColumnIndex(double[][] array, int columnIndex)
	{
		double highest = array[0][columnIndex]; //set first value to highest 
		int highestIndex = 0;
		for(int i = 0; i < array.length;i++) // runs through rows 
		{
			if(array[i][columnIndex] > highest) //if new element is greater than highest set highest to new element
			{
				highest = array[i][columnIndex]; //initialize new highest
				highestIndex = i; //sets highest index to row i
			}
		}
			
		return highestIndex; //returns highest
	}
	
	public static double getLowestInColumn(double[][] array, int columnIndex)
	{
		
		double lowest;
		
		if(array[0].length > columnIndex)
		{
			lowest = array[0][columnIndex]; //set first value to highest 
		}
		else 
		{
			lowest = Double.MAX_VALUE;
		}

		for(int i = 0; i < array.length;i++) // runs through rows 
		{
			if(array[i].length > columnIndex && array[i][columnIndex] < lowest)
			{
				lowest = array[i][columnIndex]; //initialize new highest
			}
		}
			
		return lowest; //returns highest
	}
	
	public static int getLowestInColumnIndex(double[][] array, int columnIndex)
	{
		double lowest = array[0][columnIndex]; //set first value to highest 
		
		int lowestIndex = 0;
		
		for(int i = 0; i < array.length;i++) // runs through rows 
		{
			if(array[i][columnIndex] < lowest) //if new element is greater than highest set highest to new element
			{
				lowest = array[i][columnIndex]; //initialize new highest
				
				lowestIndex = i; //sets lowest index to i
			}
		}
			
		
		return lowestIndex; //returns highest
	}
	
	public static double getHighestInArray(double[][] array)
	{
		double highestElement = array[0][0]; //sets highest to first subscript of array
		
		for(int i = 0; i < array.length;i++) //loops through rows
		{
			for(int j = 0; j < array[i].length;j++) //loops through columns
			{
				if(array[i][j] > highestElement) // if new subscript is greater than highest
				{
					highestElement = array[i][j]; //sets new value as highestElement
				}
			}
		}
		return highestElement; // returns value
	}
	
	public static double getLowestInArray(double[][] array)
	{
		double lowestElement = array[0][0]; //sets subscript to lowestElement
		
		for(int i = 0; i < array.length; i++) //runs through rows 
		{
			for(int j = 0; j < array[i].length;j++) // runs through columns
			{
				if(array[i][j] < lowestElement) //if subscript is less than lowest element 
				{
					lowestElement = array[i][j]; //assign lowestElement to subscript
				}
			}
		}
		return lowestElement; //return lowest element
	} //System.out.print(lowestElement);
	
}

