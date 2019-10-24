// Java implementation of above approach 
class GFG 
{ 
	
// Function to print the pair (n, r) 
// such that nCr is maximum possible 
static void findPair(int arr[], int n) 
{ 
	// Array should contain atleast 2 elements 
	if (n < 2) 
	{ 
		System.out.print("-1"); 
		return; 
	} 

	// Maximum element from the array 
	int maximum = arr[0]; 
	for(int i = 1; i < n; i++) 
	maximum = Math.max(maximum, arr[i]); 

	// temp stores abs(middle - arr[i]) 
	int temp = 10000001, r = 0, middle = maximum / 2; 

	// Finding r with minimum abs(middle - arr[i]) 
	for (int i = 0; i < n; i++) 
	{ 

		// When n is even then middle is (maximum / 2) 
		if (Math.abs(middle - arr[i]) < temp && n % 2 == 0) 
		{ 
			temp = Math.abs(middle - arr[i]); 
			r = arr[i]; 
		} 

		// When n is odd then middle elements are 
		// (maximum / 2) and ((maximum / 2) + 1) 
		else if (Math.min(Math.abs(middle - arr[i]), 
						Math.abs(middle + 1 - arr[i])) < 
									temp && n % 2 == 1) 
		{ 
			temp = Math.min(Math.abs(middle - arr[i]), 
							Math.abs(middle + 1 - arr[i])); 
			r = arr[i]; 
		} 
	} 
	System.out.print( "n = " + maximum + " and r = " + r); 
} 

// Driver code 
public static void main(String args[]) 
{ 
	int arr[] = { 0, 2, 3, 4, 1, 6, 8, 9 }; 
	int n = arr.length; 

	findPair(arr, n); 
} 
} 

// This code is contributed by Arnab Kundu 
