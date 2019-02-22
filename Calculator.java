package cse360assign2;

import java.util.LinkedList;
import java.util.List;

/*============================================================================
Name        : Calculator.java
Author      : Ripudaman Teja
ClassID     : 562
    This file contains Calculator class, which performs all the basic
    calculator functions like add, subtract, multiply and divide.
============================================================================*/
/**
 *
 *@author Ripudaman Teja
 *@ClassID 562
 *@AssignmentNumber 2
 *
 *
 *<p><tt>Calculator<tt> is a class, which allows to perform all the basic
 *calculator functions like addition, multiplication, division and subtra
 *ction. The arguments to the functions are Integers. The constructor of 
 *the class intializes a private variable to zero, which helps in maintai
 *ning the total.
 *
 *<p>The class provides 6 methods to efficiently get a total, add, subtract,
 *mulitply, divide and get history.
 *
 *The method <tt>getTotal<tt> returns the current total. 
 *The method <tt>add<tt> add an integer argument to the total variable.
 *The method <tt>subtract<tt> the parameter from the total variable. 
 *The method <tt>multiply<tt> multiplies the total by the parameter. 
 *The method <tt>divide<tt>  divide the total by the parameter.
 *The method <tt>getHistory<tt> returns the history of performed operations so far. 
 *
 */
public class Calculator {

	/**
	 * current total
	 */
	
	private int total;
	
	/**
	 * List to maintain history of operations
	 */
	private List<String> history;
	
	public Calculator () {
		total = 0;
		history = new LinkedList<>();
		history.add("0");
	}
	
	/**
	 * <p>Returns the current total.
	 *
	 * @return integer
	 * 
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * <p>Add the new argument to the total
	 * @param value to be added to the total
	 * @return void
	 * 
	 */
	public void add (int value) {
		history.add(" + " + value);
		total += value;
	}
	
	/**
	 * <p>Subtracts the new argument from the total
	 * @param value to be subtracted to the total
	 * @return void
	 * 
	 */
	public void subtract (int value) {
		history.add(" - " + value);
		total -= value;
	}
	
	/**
	 * <p>Mutliplies the total with the new argument.
	 * @param value to be multiplied
	 * @return void
	 * 
	 */
	public void multiply (int value) {
		history.add(" * " + value);
		total *= value;
	}
	
	/**
	 * <p>Divides the total with new value. If the value
	 * is zero, then the total is set to zero.
	 * @param value to divide the total
	 * @return void
	 * 
	 */
	public void divide (int value) {
		if(value == 0) {
			total = 0;
		}else {
			total /= value;
		}
		history.add(" / " + value);
	}
	
	/**
	 * <p>Returns the history of operations performed
	 * so far.
	 * 
	 * @return String
	 * 
	 */
	public String getHistory () {
		String result = "";
		
		for(String operations : history) {
			result += operations;
		}
		return result;
	}
}
