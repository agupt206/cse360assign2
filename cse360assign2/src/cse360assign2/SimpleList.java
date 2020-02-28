/**
 * @author Animesh Gupta
 * ClassID: 105 
 * Assignment #: Assignment 2 
 * This is a class that contains a constructor that created a list or an array of integers. There are also various methods included that can 
 * change the elements of the array or provide information about the array itself. This version contains new functionalities in the add and 
 * remove methods. If the number of elements exceeds the current size then the size of the array is increased. Furthermore, if 25% or more of the 
 * array is empty then the array size is decreased. The append, first, last, and size methods have also been added. 
 * 
 */
package cse360assign2;


/**
 * This class holds all the methods that can operated on a type of SimpleList.
 */
public class SimpleList 
{
	
	/**
	 * Variable used to be the array in the SimpleList constructor
	 */
	private int list[]; 
	
	/**
	 * Variable used to keep track of number of elements in the list
	 */
	private int count; 
	
	/**
	 * Constructor that initializes the count to 0 and creates an array of size 10
	 */
	SimpleList()
	{ 
		list = new int[10]; 
		count = 0;
	}
	
	/**
	 * Adds a new element to the array. If the array is full the array size is increased by 50%.  
	 * @param value to be added
	 */
	public void add(int newNumber)
	{ 
		if (count == list.length)
		{ 
			int newList[] = new int[list.length + (list.length)/2]; 
			
			for (int iterator = 0; iterator < count; iterator++)
			{ 
				newList[iterator] = list[iterator]; 
			}
			
			list = newList;  
		}
		
	
		for (int iterator = list.length-1; iterator >= 1; iterator--)
		{  
			list[iterator] = list[iterator - 1];  
		}
		
		list[0] = newNumber;
		
		count++; 
	}
	
	/**
	 * Removes an element from the array. If 25% or more of the array is empty then the array size is decreased. 
	 * @param value to be removed
	 */
	public void remove(int removedNumber)
	{ 
		int removeIndex = search(removedNumber);
		
		for (int iterator = removeIndex; iterator < count-1; iterator++)
		{ 
			list[iterator] = list[iterator + 1]; 
			
			if (iterator == count - 1)
			{ 
				list[iterator] = 0; 
			}
		}
		
		count--;
		
		if ((list.length * 0.75) >= count)
		{ 
			int[] newList = new int[count]; 
			
			for (int iterator = 0; iterator < newList.length; iterator++)
			{ 
				newList[iterator] = list[iterator]; 
			}
			
			list = newList;  
		 } 
	} 
	
	/**
	 * Returns the number of elements in the array
	 * @return number of elements in the array
	 */
	public int count()
	{ 
		return count; 
	}
	
	/**
	 * Converts the array to a string and prints it out
	 * @return the array as a string
	 */
	public String toString()
	{ 
		String toString = ""; 
		
		for (int iterator = 0; iterator < count -1; iterator++)
		{ 
			toString += list[iterator] + " ";
		}
		
		toString += list[count-1]; 
		
		return toString;
	 }
	
	/**
	 * Searches the array for the number in the parameter and returns the index of that number 
	 * @param number to be searched for
	 * @return index of the found number or -1\
	 */
	public int search(int searchNumber)
	{ 
		int index = -1; 
		
		for (int iterator = 0; iterator < count; iterator++)
		{ 
			if (list[iterator] == searchNumber)
			{ 
				index = iterator; 
			}
		}
		
		return index; 
	}
	
	
	/**
	 * Appends a new number to the end of the array.  
	 * @param number to be appended to the array
	 */
	public void append (int newNumber)
	{ 
		if (count > list.length)
		{ 
			int newList[] = new int[list.length + (list.length)/2]; 
			
			for (int iterator = 0; iterator < list.length; iterator++)
			{ 
				newList[iterator] = list[iterator]; 
			}
			
			list = newList;  
		}
		
		list[count] = newNumber;  
		count++; 
	}
	
	
	/**
	 * Returns the first element of the array. If the array is empty the method returns -1 
	 * @return the first element of the array or -1 
	 */
	public int first() 
	{ 
		int firstNumber = -1; 
		
		if (count > 0)
		{ 
			firstNumber = list[0]; 
		}
		
		return firstNumber; 
	}
	
	
	/**
	 * Returns the last element of the array. If the array is empty the method returns -1 
	 * @return the last element of the array or -1
	 */
	public int last() 
	{ 
		int lastNumber = -1; 
		
		if (count > 0)
		{ 
			lastNumber = list[count-1]; 
		}
		
		return lastNumber; 
	}
	
	/**
	 * Returns the number of possible locations in the list
	 * @return number of possible locations in the list
	 */
	public int size()
	{ 
		return list.length; 
	}
	
}
