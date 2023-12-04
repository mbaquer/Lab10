import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {

	@Test
	public void testPositives() {
	    // Instantiate the SelectionSort class
	    SelectionSort sort = new SelectionSort();

	    // Define a positive array to sort
	    int[] arr = {4, 6, 2, 8, 1, 9, 3};
	    int[] sortedArr = {1, 2, 3, 4, 6, 8, 9};

	    // Use sorting method
	    sort.basicSelectionSort(arr);

	    // Assert if the sorted array is correct
	    assertArrayEquals(sortedArr, arr);
	}
	public void testNegatives() {
	    // Prepare - Instantiate your SelectionSort class
	    SelectionSort sort = new SelectionSort();

	    // Prepare - Define a negative array to sort
	    int[] arr = {-3, -1, -2, -6, -4, -5};
	    int[] sortedArr = {-6, -5, -4, -3, -2, -1};

	    // Perform Action - Use your sorting method
	    sort.basicSelectionSort(arr);

	    // Check result - Assert if the sorted array is correct
	    assertArrayEquals(sortedArr, arr);
	}
	public void testMixed() {
	    // Prepare - Instantiate your SelectionSort class
	    SelectionSort sort = new SelectionSort();

	    // Prepare - Define a mixed array to sort
	    int[] arr = {-3, 1, -2, -6, 4, -5};
	    int[] sortedArr = {-6, -5, -3, -2, 1, 4};

	    // Perform Action - Use your sorting method
	    sort.basicSelectionSort(arr);

	    // Check result - Assert if the sorted array is correct
	    assertArrayEquals(sortedArr, arr);
	}
	public void testDuplicates() {
	    // Prepare - Instantiate your SelectionSort class
	    SelectionSort sort = new SelectionSort();

	    // Prepare - Define a duplicate-having array to sort
	    int[] arr = {4, 6, 4, 8, 1, 9, 3};
	    int[] sortedArr = {1, 3, 4, 4, 6, 8, 9};
	    
	    // Perform Action - Use your sorting method
	    sort.basicSelectionSort(arr);

	    // Check result - Assert if the sorted array is correct
	    assertArrayEquals(sortedArr, arr);
	}
}
