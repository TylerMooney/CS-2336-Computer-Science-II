/* Author: Tyler Mooney
 * Date: November 5th, 2020
 * Professor: Khan
 * 
 * Purpose: Have the user pass a postfix expression 
 * through command prompt and then evalute the expression
 * using the stack.
 * The expression should be passed as only one string
 * 
 * Instructions: (for my computer)
 * Open cmd, then type: "cd eclipse-workspace", enter
 * type: "cd Homework 9", enter
 * type: "cd src", enter
 * type: "javac Q20_14.java", enter
 * type: "java Q20_14 12+3*", enter
 * 
 * Notes:
 * Chapter 20.11: Case Study: Evaluating Expressions should help you with this assignment.
 * Referenced code from Listing 20.12
 * Only use one stack
 * Have to scan it left to right
 * I've left out lots of commented out code because I wanted to keep it there
 * Since there are no spaces, don't check for any
 */

import java.util.Stack;

public class Q20_14 
{
	public static void main(String[] args) 
	{
		// Checking if input is valid, if not exit
		if(args.length != 1)
		{
			System.out.println("Incorrect input. Exiting.");
			System.exit(1);
		}
		
		// Error-Handling
		try
		{
			// Acquiring result and then printing it
			System.out.printf("The result of expression %s is %d\n", args[0], evaluate(args[0]));
			//System.out.println(evaluate("12+3*")); // Output should be 9
			//System.out.println(evaluate("11+11+/")); // Output should be 1
			//System.out.println(evaluate("231*+9-")); // Output should be -4
		}
		catch(Exception ex)
		{
			System.out.println("Expression Incorrect: " + args[0]);
		}

	}
	
	// Acquiring the expression, then evaluating it
	public static int evaluate(String expression)
	{
		//Creating operand stack
		Stack<Integer> operandStack = new Stack<>();
		
		// Short method
		for(int i = 0; i < expression.length(); i++)
		{
			// Creating variables from the stack
			char operator = expression.charAt(i);
			
			if(Character.isDigit(operator)) // Check if operand
				operandStack.push(Character.getNumericValue(operator));
			else // Process operator
				processOperator(operandStack, operator);
		}
		
		// Returning the result
		return operandStack.pop();
		
		/*
		 * This is the textbook method
		 * Some code was cut out because it wasn't needed
		// Creating operator stack
		Stack<Character> operatorStack = new Stack<>();
		
		// Inserting blanks around operators
		expression = insertBlanks(expression);
		
		// Extracting operands and operators
		String[] tokens = expression.split(" ");
		
		// Scan the tokens
		// If the token is blank, ignore it. Else if the operator is valid, process it
		for(String token: tokens)
		{
			if(token.length() == 0) // Blank Space
				continue;
			else if(token.charAt(0) == '+' || token.charAt(0) == '-')
			{
				// Processing addition or subtraction
				while(!operatorStack.isEmpty() && (operatorStack.peek() == '+' || operatorStack.peek() == '-'))
					processOperator(operandStack, operatorStack);
				
				// Pushing the + or - operator to the top of the stack
				operatorStack.push(token.charAt(0));
			}
			else if (token.charAt(0) == '*' || token.charAt(0) == '/') 
			{
				// Processing multiplication or division
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '*' || operatorStack.peek() == '/'))
					processOperator(operandStack, operatorStack);

				// Pushing the * or / operator to the top of the stack
				operatorStack.push(token.charAt(0));
			}
			else // An operand scanned
				operandStack.push(new Integer(token)); // Push an operand to the stack
		}

		//Phase 2: Process all the remaining operators in the stack
		while (!operatorStack.isEmpty())
			processOperator(operandStack, operatorStack);
		
		// Returning the result
		return operandStack.pop();
		*/
		
	}
	
	// Method acquires an operator, then performs the operation on the next two operands in the stack
	// For text book method, you'll 
	public static void processOperator(Stack<Integer> operandStack, char operator)
	{
		// Creating variables from the stack
		//char operator = operatorStack.pop(); // for textbook method
		int operand1 = operandStack.pop();
		int operand2 = operandStack.pop();
		
		// Determining what operation to perform, then executing the operation
		switch(operator)
		{
		case '+':
			operandStack.push(operand2 + operand1);
			break;
		case '-':
			operandStack.push(operand2 - operand1);
			break;
		case '*':
			operandStack.push(operand2 * operand1);
			break;
		case '/':
			operandStack.push(operand2 / operand1);
			break;
		}
	}
	

	/*
	 * This is the textbook method
	// Method removes blanks from the expression
	public static String insertBlanks(String expression)
	{
		String result = "";
		
		// Reversing the order of that the expression is read allows for postfix to work
		// Although I'm not gonna use this because the homework says "Scan a postfix expression
		// from left to right."
		for(int i = expression.length() - 1; i >= 0 ; i--)
		//for(int i = 0; i < expression.length(); i++)
		{
			switch(expression.charAt(i))
			{
			case '+':
			case '-':
			case '*':
			case '/':
				result += " " + expression.charAt(i) + " ";
				break;
			default:
				result += expression.charAt(i);
				break;
			}
		}
		
		return result;
	}
	*/

}
