package Practicejava;

public class swappingtwonumbers {

	public static void main(String[] args) {
		
		
		
		
        int a = 5;  // Step 1: Initialize the variable a with value 5
        int b = 10; // Step 2: Initialize the variable b with value 10

        // Step 3: Print the values of a and b before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Step 4: Swap the values of a and b using a temporary variable
        int temp = a;  // temp now holds the value of a (temp = 5)
        a = b;         // a now holds the value of b (a = 10)
        b = temp;      // b now holds the value of temp (b = 5)

        // Step 5: Print the values of a and b after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);

		
	
	}

}
