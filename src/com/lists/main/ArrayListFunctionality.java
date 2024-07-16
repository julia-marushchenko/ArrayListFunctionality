package com.lists.main;

import java.util.ArrayList;

public class ArrayListFunctionality {
	// Main method to run program 
	public static void main (String [] str) {
		
		// Dynamic changing array to store strings
		ArrayList<String> array = new ArrayList<>();
		
		// Adding elements to array
		array.add("Highlighter");
		array.add("Pen");
		array.add("Pencil");
		array.add("Eraser");
		
		//Amount of elements of array
		System.out.println("Array size is: " + array.size()); //4
		
		//Showing elements of array to console
		System.out.println("Elements of array: " + array.toString());
		
		//Getting elements by index
		//Element number 1
		System.out.println("The first element of array: " + array.get(1)); //Pen
		
		//Element number 3
		System.out.println("The first element of array: " + array.get(3)); //Eraser
		
		//Removing element number 2
		array.remove(array.remove(2)); //Pencil is removed
		
		//Showing elements of array to console
		System.out.println("Elements of array: " + array.toString()); // [Highlighter, Pen, Eraser]
		
		// Showing index of previously element number 3, after removing one element
		System.out.println("Index of last element Eraser: " + array.indexOf("Eraser")); // Index 2
		
		// Adding Pencil back with the same index
		System.out.println("Index of last element Eraser: " + array.set(2, "Pencil"));
		
		// Checking that Pencil is again in array
		System.out.println("Elements of array: " + array.toString()); /*  Output: [Highlighter, Pen, Pencil]
		Method set placed Pencil instead of Eraser to index number 2 
		*/
		
		// Let's add Eraser back
		array.add("Eraser");
		
		//Showing elements of array to console
		System.out.println("Elements of array: " + array.toString()); // [Highlighter, Pen, Pencil, Eraser]
		
		// Let's remove Pencil again
		array.remove("Pencil");
		
		//Showing elements of array to console
		System.out.println("Elements of array: " + array.toString()); // Output: [Highlighter, Pen, Eraser]
		
		// Now let's add Pencil but with method add, not set
		array.add(2, "Pencil");
		
		//Checking elements of array that number 3 is Eraser, moved there automatically
		System.out.println("Elements of array: " + array.toString()); // Output: [Highlighter, Pen, Pencil, Eraser]
		
	}

}
