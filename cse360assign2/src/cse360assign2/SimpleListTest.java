/**
 * @author Animesh Gupta
 * ClassID: 105 
 * Assignment #: Assignment 2 
 * This class has various tests that utilize assert statements in order to find out if each 
 * of the methods in SimpleList work. Each method has a success and failure test. New tests have been added to test the new functionalities in
 * the add and remove methods as well as the four new additional methods. 
 *
 */

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	/**
	 * This test if the constructor successfully creates an object. 
	 */
	@Test
	public void constructorTestSuccess() 
	{
		SimpleList list = new SimpleList(); 
		assertNotNull(list);
		
	}
	
	/**
	 * This tests to see if the constructor sets the variable to the proper value. 
	 */
	public void constructorTestFailure()
	{ 
		SimpleList list = new SimpleList(); 
		assertNotEquals(1, list.count()); 
	}
	
	/**
	 * This test sees if the correct number of elements is added to the list. 
	 */
	@Test
	public void addTestSuccess() 
	{
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.add(2);
		assertEquals(2, list.count()); 
	}
	
	/**
	 * This test sees if the variable count now does not stay at 10 when more than 10 elements are added to the list and that the array size 
	 * increases to the correct amount.  
	 */
	@Test
	void addTestFail() 
	{
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		assertNotEquals(10, list.count()); 
	}
	
	/**
	 * This test sees if the proper array is printed after an element is removed. 
	 */
	@Test
	public void removeTestSuccess() 
	{
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(2);
		assertEquals("3 1", list.toString()); 
	}
	
	/**
	 * This test makes sure that the printed array does not much an incorrect array after removing an element. 
	 */
	@Test 
	public void removeTestFailure() 
	{
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(2);
		assertNotEquals("3 2", list.toString()); 
	}
	
	
	/**
	 * This test makes sure that the variable count matches the number of elements in the array. 
	 */
	@Test
	public void countTestSuccess() 
	{
		SimpleList list = new SimpleList(); 
		list.add(1); 
		list.add(2); 
		assertEquals(2, list.count()); 
	}
	
	/**
	 * This test makes sure that the variable count is not equal to one more than the number of elements 
	 * in the array. 
	 */
	@Test
	public void countTestFailure() 
	{
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.add(2);
		list.add(3);
		assertNotEquals(4, list.count());
	}
	
	/**
	 * This test checks if the array is printed in the proper format 
	 */
	@Test
	public void toStringTestSuccess() 
	{
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		assertEquals("8 7 6 5 4 3 2 1", list.toString());
	}
	
	/**
	 * This test checks if the printed array does not omit the last element. 
	 */
	@Test
	public void toStringTestFailure() 
	{
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		assertNotEquals("6 5 4 3 2 ", list.toString());
	} 
	
	/**
	 * This test ensures that the correct index of the search number is returned from the method. 
	 */
	@Test
	public void searchTestSuccess() 
	{
		SimpleList list = new SimpleList(); 
		list.add(10);
		list.add(9); 
		list.add(8);
		assertEquals(1, list.search(9));
	}
	
	/**
	 * This test makes sure that the method does not return the wrong index. 
	 */
	@Test
	public void searchTestFailure() 
	{
		SimpleList list = new SimpleList(); 
		list.add(10);
		list.add(9); 
		list.add(8);
		assertNotEquals(2, list.search(9));
	}
	
	/**
	 * This test checks to see if the append method adds the parameter value to the end of the array. 
	 */
	@Test
	public void appendTestSuccess()
	{ 
		SimpleList list = new SimpleList(); 
		list.add(10);
		list.append(9); 
		list.add(8);
		list.append(11);
		assertEquals("8 10 9 11", list.toString()); 
	}
	
	/**
	 * This test makes sure that the append method does not add the parameter value to the beginning of the array. 
	 */
	@Test
	public void appendTestFailure() 
	{ 
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.append(10);
		list.add(9); 
		list.add(8);
		assertNotEquals("8 9 10 1", list.toString()); 
	}
	
	/**
	 * This test ensures that the method returns the correct first element of the array. 
	 */
	@Test
	public void firstTestSuccess()
	{ 
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		assertEquals(6, list.first());
	}
	
	/**
	 * This test makes sure that the method does not return negative one as the first element when there are elements in the array. 
	 */
	@Test
	public void firstTestFailure()
	{ 
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.add(2);
		assertNotEquals(-1, list.first()); 
	}
	
	
	/**
	 * This test checks to see if negative one is returned as the first element when the array is empty.  
	 */
	@Test
	public void firstEmptyTestSuccess()
	{ 
		SimpleList list = new SimpleList(); 
		assertEquals(-1, list.first());
	}
	
	/**
	 * This test checks to see if the method returns the correct value for the last element. 
	 */
	@Test
	public void lastTestSuccess()
	{ 
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		assertEquals(1, list.last());
	}
	
	/**
	 * This test makes sure that the method does not return a value other than the last element in the array. 
	 */
	@Test
	public void lastTestFailure()
	{ 
		SimpleList list = new SimpleList(); 
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		assertNotEquals(4, list.last()); 
	}
	
	/**
	 * This test checks to see if negative one is returned as the last element when the array is empty. 
	 */
	@Test
	public void lastEmptyTestSuccess()
	{ 
		SimpleList list = new SimpleList(); 
		assertEquals(-1, list.last());
	}
	
	/**
	 * This test checks to see if the method returns the correct total of possible spaces. This also tests the new functionality in the remove 
	 * method as the size of the array decreases once 25% of the total size is empty. 
	 */
	@Test
	public void sizeTestSucces()
	{
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.remove(1);
		assertEquals(3, list.size()); 
	}
	
	/**
	 * This test checks to make sure that the size method does not return the wrong value and that the array size does not stay the same when 
	 * more than 25% of the array is empty. 
	 */
	@Test
	public void sizeTestFailure()
	{ 
		SimpleList list = new SimpleList(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.remove(1);
		list.remove(2);
		list.remove(3);
		assertNotEquals(8, list.size()); 
	}
	
	
	
	
	
	

	
	
}
