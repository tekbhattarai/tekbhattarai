package csc385;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SorterTest {

	@Test
	public void testFileWriterAscTC1() {
		
		// this fails because we made a wrong assumption
		int max = 2;
		String fileName = "t.txt";
		Sorter.FileWriterAsc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2};
		assertArrayEquals(expected, actual);
	}
	// Code won't compile when string is assigned to int value
	@Test
	public void testFileWriterAscTC2() {
		// This code won't compile since int is assigned to string
		//int max = "hello";
		//String fileName = "t.txt";
		//Sorter.FileWriterAsc("hello", fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	@Test
	public void testFileWriterAscTC3() {
		// This code won't compile, we can't have null primitive type

		//int max = 2;
		//String fileName = "t.txt";
		//Sorter.FileWriterAsc(null, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	@Test
	public void testFileWriterAscTC4() {
		// This code won't compile. double can't be assigned to int

		//int max = 5.5;
		//String fileName = "t.txt";
		//Sorter.FileWriterAsc(max, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFileWriterAscTC5() {
		// This code won't compile since int can't be assign to empty
		//int max = empty;
		//String fileName = "t.txt";
		//Sorter.FileWriterAsc(, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	@Test (expected = NegativeArraySizeException.class)
	public void testFileWriterAscTC6() {
		// Expected to fail with exception
		int max = -1;
		String fileName = "t.txt";
		Sorter.FileWriterAsc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2,3};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFileWriterAscTC7() {
		// Code won't compile, File name is assigned to int
		
		//int max = 2;
		//String fileName = 2;
		//Sorter.FileWriterAsc(max, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	
	@Test (expected = NullPointerException.class)
	public void testFileWriterAscTC8() {
		// Code won't compile, File name is assigned to int
		
		int max = 2;
		String fileName = null;
		Sorter.FileWriterAsc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testFileWriterAscTC9() {
		// Code won't compile, File name is assigned to int
		
		//int max = 2;
		//String fileName = 2.2;
		//Sorter.FileWriterAsc(max, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	
	@Test (expected = FileNotFoundException.class)
	public void testFileWriterAscTC10() {
		// Wrong assumption here
		
		int max = 2;
		String fileName = "abc.bac";
		Sorter.FileWriterAsc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2};
		assertArrayEquals(expected, actual);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testFileWriterAscTC11() {		
		int max = Integer.MAX_VALUE+1;
		String fileName = "t.txt";
		Sorter.FileWriterAsc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFileWriterAscTC12() {
		// Wrong assumption here
		
		int max = 0;
		String fileName = "t.txt";
		Sorter.FileWriterAsc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFileWriterAscTC13() {
		// Wrong assumption here
	
		int max = 1;
		String fileName = "t.txt";
		Sorter.FileWriterAsc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1};
		assertArrayEquals(expected, actual);
	}
	
	
	// File Writer Desc
	@Test
	public void testFileWriterDescTC1() {
		
		int max = 2;
		String fileName = "t.txt";
		Sorter.FileWriterDesc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {2,1};
		assertArrayEquals(expected, actual);
	}
	// Code won't compile when string is assigned to int value
	@Test
	public void testFileWriterDescTC2() {
		// This code won't compile since int is assigned to string
		//int max = "hello";
		//String fileName = "t.txt";
		//Sorter.FileWriterDesc("hello", fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	@Test
	public void testFileWriterDescTC3() {
		// This code won't compile, we can't have null primitive type

		//int max = 2;
		//String fileName = "t.txt";
		//Sorter.FileWriterAsc(null, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	@Test
	public void testFileWriterDescTC4() {
		// This code won't compile. double can't be assigned to int

		//int max = 5.5;
		//String fileName = "t.txt";
		//Sorter.FileWriterDesc(max, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFileWriterDescTC5() {
		// This code won't compile since int can't be assign to empty
		//int max = empty;
		//String fileName = "t.txt";
		//Sorter.FileWriterDesc(, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	@Test (expected = NegativeArraySizeException.class)
	public void testFileWriterDescTC6() {
		// Expected to fail with exception
		int max = -1;
		String fileName = "t.txt";
		Sorter.FileWriterDesc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2,3};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFileWriterDescTC7() {
		// Code won't compile, File name is assigned to int
		
		//int max = 2;
		//String fileName = 2;
		//Sorter.FileWriterDesc(max, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	
	@Test (expected = NullPointerException.class)
	public void testFileWriterDescTC8() {
		// Code won't compile, File name is assigned to int
		
		int max = 2;
		String fileName = null;
		Sorter.FileWriterDesc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testFileWriterDescTC9() {
		// Code won't compile, File name is assigned to int
		
		//int max = 2;
		//String fileName = 2.2;
		//Sorter.FileWriterDesc(max, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	
	@Test (expected = FileNotFoundException.class)
	public void testFileWriterDescTC10() {
		// Wrong assumption here
		
		int max = 2;
		String fileName = "abc.bac";
		Sorter.FileWriterDesc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2};
		assertArrayEquals(expected, actual);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testFileWriterDescTC11() {		
		int max = Integer.MAX_VALUE+1;
		String fileName = "t.txt";
		Sorter.FileWriterDesc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFileWriterDescTC12() {
		// Wrong assumption here
		
		int max = 0;
		String fileName = "t.txt";
		Sorter.FileWriterDesc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFileWriterDescTC13() {
		// Wrong assumption here
	
		int max = 1;
		String fileName = "t.txt";
		Sorter.FileWriterDesc(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1};
		assertArrayEquals(expected, actual);
	}
	
	// File Writer
	@Test
	public void testFileWriterTC1() {
		
		int max = 2;
		String fileName = "t.txt";
		Sorter.FileWriter(max, fileName);
		int[] actual = readFromFile(max, fileName);
		assertArrayEquals(actual, actual);
	}
	// Code won't compile when string is assigned to int value
	@Test
	public void testFileWriterTC2() {
		// This code won't compile since int is assigned to string
		//int max = "hello";
		//String fileName = "t.txt";
		//Sorter.FileWriter("hello", fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	@Test
	public void testFileWriterTC3() {
		// This code won't compile, we can't have null primitive type

		//int max = 2;
		//String fileName = "t.txt";
		//Sorter.FileWriter(null, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	@Test
	public void testFileWriterTC4() {
		// This code won't compile. double can't be assigned to int

		//int max = 5.5;
		//String fileName = "t.txt";
		//Sorter.FileWriter(max, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFileWriterTC5() {
		// This code won't compile since int can't be assign to empty
		//int max = empty;
		//String fileName = "t.txt";
		//Sorter.FileWriter(, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	@Test (expected = NegativeArraySizeException.class)
	public void testFileWriterTC6() {
		// Expected to fail with exception
		int max = -1;
		String fileName = "t.txt";
		Sorter.FileWriter(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2,3};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFileWriterTC7() {
		// Code won't compile, File name is assigned to int
		
		//int max = 2;
		//String fileName = 2;
		//Sorter.FileWriter(max, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	
	@Test (expected = NullPointerException.class)
	public void testFileWriterTC8() {
		// Code won't compile, File name is assigned to int
		
		int max = 2;
		String fileName = null;
		Sorter.FileWriter(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testFileWriterTC9() {
		// Code won't compile, File name is assigned to int
		
		//int max = 2;
		//String fileName = 2.2;
		//Sorter.FileWriter(max, fileName);
		//int[] actual = readFromFile(max, fileName);
		//int[] expected = {1,2};
		//assertArrayEquals(expected, actual);
	}
	
	@Test (expected = FileNotFoundException.class)
	public void testFileWriterTC10() {
		// Wrong assumption here
		
		int max = 2;
		String fileName = "abc.bac";
		Sorter.FileWriter(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2};
		assertArrayEquals(expected, actual);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testFileWriterTC11() {		
		int max = Integer.MAX_VALUE+1;
		String fileName = "t.txt";
		Sorter.FileWriter(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1,2};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFileWriterTC12() {
		
		int max = 0;
		String fileName = "t.txt";
		Sorter.FileWriter(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFileWriterTC13() {
		// Wrong assumption here
	
		int max = 1;
		String fileName = "t.txt";
		Sorter.FileWriter(max, fileName);
		int[] actual = readFromFile(max, fileName);
		int[] expected = {1};
		assertArrayEquals(expected, actual);
	}
	
	// File Reader
	@Test
	public void testFileReaderTC1() {
		// We expect it to pass without error
		String fileName = "t.txt";
		//Max is not in use
		int max = 0;
		int[] array = new int[3];
		Sorter.FileReader(max, fileName, array);
	}
	
	@Test
	public void testFileReaderTC2() {
		// Code doesn't compile, String is assigned to int
		
		//String fileName = 2;
		////Max is not in use
		//int max = 0;
		//int[] array = new int[3];
		//Sorter.FileReader(max, fileName, array);
	}
	
	@Test (expected = NullPointerException.class)
	public void testFileReaderTC3() {		
		String fileName = null;
		//Max is not in use
		int max = 0;
		int[] array = new int[3];
		Sorter.FileReader(max, fileName, array);
	}
	
	@Test 
	public void testFileReaderTC4() {	
		//Code doesn't compile, String is assigned to double
		
		//String fileName = 2.22;
		////Max is not in use
		//int max = 0;
		//int[] array = new int[3];
		//Sorter.FileReader(max, fileName, array);
	}
	@Test (expected = FileNotFoundException.class)
	public void testFileReaderTC5() {		
		String fileName = "abc.bac";
		//Max is not in use
		int max = 0;
		int[] array = new int[3];
		Sorter.FileReader(max, fileName, array);
	}
	
	@Test (expected = NullPointerException.class)
	public void testFileReaderTC6() {		
		String fileName = "t.txt";
		//Max is not in use
		int max = 0;
		int[] array = null;
		Sorter.FileReader(max, fileName, array);
	}
	
	@Test
	public void testFileReaderTC7() {
		// Code doesn't compile, int array is assigned to string
		
		//String fileName = 2;
		////Max is not in use
		//int max = 0;
		//int[] array = "cat";
		//Sorter.FileReader(max, fileName, array);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testFileReaderTC8() {		
		String fileName = "t.txt";
		//Max is not in use
		int max = 0;
		int[] array = new int[-1];
		Sorter.FileReader(max, fileName, array);
	}
	
	@Test
	public void testFileReaderTC9() {	
		// Wrong assumption
		
		String fileName = "t.txt";
		//Max is not in use
		int max = 0;
		int[] array = new int[Integer.MAX_VALUE];
		Sorter.FileReader(max, fileName, array);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testFileReaderTC10() {	
		// Wrong assumption
		
		String fileName = "t.txt";
		//Max is not in use
		int max = 0;
		int[] array = new int[Integer.MAX_VALUE+1];
		Sorter.FileReader(max, fileName, array);
	}
	
	@Test
	public void testFileReaderTC11() {			
		String fileName = "t.txt";
		//Max is not in use
		int max = 0;
		int[] array = new int[2];
		Sorter.FileReader(max, fileName, array);
	}
	
	@Test (expected = NullPointerException.class)
	public void testFileReaderTC12() {	
		// Wrong assumption
		
		String fileName = "t.txt";
		//Max is not in use
		int max = 0;
		int[] array = new int[0];
		Sorter.FileReader(max, fileName, array);
	}
	
	
	@Test
	public void testFileReaderTC13() {	
		// Wrong assumption
		
		String fileName = "t.txt";
		//Max is not in use
		int max = 0;
		int[] array = new int[1];
		Sorter.FileReader(max, fileName, array);
	}
	

	// Bubble sort, It's void method and doesn't return anything to test
	@Test
	public void testBubbleSortTC1() {
		// Smoke test
		int[] data = new int[5];
		Sorter.BubbleSort(data);
	}
	
	@Test (expected = NullPointerException.class)
	public void testBubbleSortTC2() {
		int[] data = null;
		Sorter.BubbleSort(data);
	}
	
	@Test 
	public void testBubbleSortTC3() {
		// Code doesn't compile, int array is assigned to string
		
		//int[] data = "cat";
		//Sorter.BubbleSort(data);
	}
	@Test (expected = NegativeArraySizeException.class)
	public void testBubbleSortTC4() {
		// Smoke test
		int[] data = new int[Integer.MAX_VALUE+1];
		Sorter.BubbleSort(data);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testBubbleSortTC5() {
		// Smoke test
		int[] data = new int[-1];
		Sorter.BubbleSort(data);
	}
	
	@Test
	public void testBubbleSortTC6() {
		// Wrong assumption
		
		int[] data = new int[Integer.MAX_VALUE];
		Sorter.BubbleSort(data);
	}
	
	@Test
	public void testBubbleSortTC7() {
		// Wrong assumption
		
		int[] data = new int[Integer.MAX_VALUE-1];
		Sorter.BubbleSort(data);
	}
	
	@Test (expected = NullPointerException.class)
	public void testBubbleSortTC8() {
		// Wrong assumption
		
		int[] data = new int[0];
		Sorter.BubbleSort(data);
	}
	
	@Test 
	public void testBubbleSortTC9() {
		int[] data = new int[1];
		Sorter.BubbleSort(data);
	}
	
	// InsertionSort
	
	@Test
	public void testInsertionSortTC1() {
		// Smoke test
		int[] data = new int[5];
		Sorter.BubbleSort(data);
	}
	
	@Test (expected = NullPointerException.class)
	public void testInsertionSortTC2() {
		int[] data = null;
		Sorter.InsertionSort(data);
	}
	
	@Test 
	public void testInsertionSortTC3() {
		// Code doesn't compile, int array is assigned to string
		
		//int[] data = "cat";
		//Sorter.InsertionSort(data);
	}
	@Test (expected = NegativeArraySizeException.class)
	public void testInsertionSortTC4() {
		// Smoke test
		int[] data = new int[Integer.MAX_VALUE+1];
		Sorter.BubbleSort(data);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testInsertionSortTC5() {
		// Smoke test
		int[] data = new int[-1];
		Sorter.InsertionSort(data);
	}
	
	@Test
	public void testInsertionSortTC6() {
		// Wrong assumption
		
		int[] data = new int[Integer.MAX_VALUE];
		Sorter.InsertionSort(data);
	}
	
	@Test
	public void testInsertionSortTC7() {
		// Wrong assumption
		
		int[] data = new int[Integer.MAX_VALUE-1];
		Sorter.InsertionSort(data);
	}
	
	@Test (expected = NullPointerException.class)
	public void testInsertionSortTC8() {
		// Wrong assumption
		
		int[] data = new int[0];
		Sorter.InsertionSort(data);
	}
	
	@Test 
	public void testInsertionSortTC9() {
		int[] data = new int[1];
		Sorter.InsertionSort(data);
	}
	
	
	//Quick Sort
	@Test 
	public void testQuickSortTC1() {
		int[] data = {14,28,35};
		int min = 1;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test 
	public void testQuickSortTC2() {
		// Code doesn't compile, int array is assigned to string
		//int[] data = "min";
		//int min = 1;
		//int max = 2;
		//Sorter.QuickSort(data, min, max);
	}
	
	@Test (expected = NullPointerException.class)
	public void testQuickSortTC3() {
		int[] data = null;
		int min = 1;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testQuickSortTC4() {
		int[] data = {14,28,35};
		int min = -5;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test 
	public void testQuickSortTC5() {
		// Code doesn't compile, int is assigned to double
		//int[] data = {14,28,35};
		//int min = -3.14;
		//int max = 2;
		//Sorter.QuickSort(data, min, max);
	}
	
	@Test 
	public void testQuickSortTC6() {
		// Code doesn't compile, int is assigned to string
		//int[] data = {14,28,35};
		//int min = "min;
		//int max = 2;
		//Sorter.QuickSort(data, min, max);
	}
	
	@Test 
	public void testQuickSortTC7() {
		// Code doesn't compile, int is assigned to null
		//int[] data = {14,28,35};
		//int min = null;
		//int max = 2;
		//Sorter.QuickSort(data, min, max);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testQuickSortTC8() {
		int[] data = {14,28,35};
		int min = -7;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test 
	public void testQuickSortTC9() {
		// Code doesn't compile, int is assigned to double
		//int[] data = {14,28,35};
		//int min = 1;
		//int max = 6.32;
		//Sorter.QuickSort(data, min, max);
	}
	
	@Test 
	public void testQuickSortTC10() {
		// Code doesn't compile, int is assigned to string
		//int[] data = {14,28,35};
		//int min = 1;
		//int max = "max";
		//Sorter.QuickSort(data, min, max);
	}
	
	@Test 
	public void testQuickSortTC11() {
		// Code doesn't compile, int is assigned to null
		//int[] data = {14,28,35};
		//int min = 1;
		//int max = null;
		//Sorter.QuickSort(data, min, max);
	}
	
	@Test 
	public void testQuickSortTC12() {
		//Wrong assumption
		int[] data = new int [Integer.MAX_VALUE];
		int min = 1;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test 
	public void testQuickSortTC13() {
		//Wrong assumption
		int[] data = new int [Integer.MAX_VALUE-1];
		int min = 1;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testQuickSortTC14() {
		int[] data = new int [Integer.MAX_VALUE+1];
		int min = 1;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test
	public void testQuickSortTC15() {
		int[] data = new int [0];
		int min = 0;
		int max = 0;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testQuickSortTC16() {
		int[] data = new int [-1];
		int min = 1;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test 
	public void testQuickSortTC17() {
		int[] data = new int [1];
		int min = 1;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testQuickSortTC18() {
		int[] data = {14,28,35};
		int min = -1;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test
	public void testQuickSortTC19() {
		
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test 
	public void testQuickSortTC20() {
		
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE - 1;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testQuickSortTC21() {
		
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE + 1;
		int max = 2;
		Sorter.QuickSort(data, min, max);
	}
	@Test
	public void testQuickSortTC22() {
		// Wrong assumption
		int[] data = {14,28,35};
		int min = 1;
		int max = -1;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test
	public void testQuickSortTC23() {		
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE;
		int max = Integer.MAX_VALUE;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test 
	public void testQuickSortTC24() {		
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE;
		int max = Integer.MAX_VALUE - 1;;
		Sorter.QuickSort(data, min, max);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testQuickSortTC25() {
		//Wrong assumption
		
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE;
		int max = Integer.MAX_VALUE + 1;
		Sorter.QuickSort(data, min, max);
	}
	
	// SWAP
	
	@Test 
	public void testSwapTC1() {
		int[] data = {14,28,35};
		int min = 1;
		int max = 2;
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testSwapTC2() {
		// Code doesn't compile, int array is assigned to string
		//int[] data = "min";
		//int min = 1;
		//int max = 2;
		//Sorter.swap(data, min, max);
	}
	
	@Test (expected = NullPointerException.class)
	public void testSwapTC3() {
		int[] data = null;
		int min = 1;
		int max = 2;
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testSwapTC4() {
		int[] data = {14,28,35};
		int min = -5;
		int max = 2;
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testSwapTC5() {
		// Code doesn't compile, int is assigned to double
		//int[] data = {14,28,35};
		//int min = -3.14;
		//int max = 2;
		//int actual = Sorter.swap(data, min, max);
		//int expected = 1;
		//assertEquals(expected, actual);
	}
	
	@Test 
	public void testSwapTC6() {
		// Code doesn't compile, int is assigned to string
		//int[] data = {14,28,35};
		//int min = "min";
		//int max = 2;
		//int actual = Sorter.swap(data, min, max);
		//int expected = 1;
		//assertEquals(expected, actual);
	}
	
	@Test 
	public void testSwapTC7() {
		// Code doesn't compile, int is assigned to null
		//int[] data = {14,28,35};
		//int min = null;
		//int max = 2;
		//int actual = Sorter.swap(data, min, max);
		//int expected = 1;
		//assertEquals(expected, actual);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testSwapTC8() {
		int[] data = {14,28,35};
		int min = 1;
		int max = -7;
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testSwapSortTC9() {
		// Code doesn't compile, int is assigned to double
		//int[] data = {14,28,35};
		//int min = 6.32;
		//int max = 1;
		//int actual = Sorter.swap(data, min, max);
		//int expected = 1;
		//assertEquals(expected, actual);
	}
	
	@Test 
	public void testSwapTC10() {
		// Code doesn't compile, int is assigned to string
		//int[] data = {14,28,35};
		//int min = 2;
		//int max = "max";
		//int actual = Sorter.swap(data, min, max);
		//int expected = 1;
		//assertEquals(expected, actual);
	}
	
	@Test 
	public void testSwapTC11() {
		// Code doesn't compile, int is assigned to null
		//int[] data = {14,28,35};
		//int min = 2;
		//int max = null;
		//int actual = Sorter.swap(data, min, max);
		//int expected = 1;
		//assertEquals(expected, actual);
	}
	
	@Test 
	public void testSwapTC12() {
		//Wrong assumption
		
		int[] data = new int [Integer.MAX_VALUE];
		int min = 1;
		int max = 2;
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testSwapTC13() {
		//Wrong assumption
		int[] data = new int [Integer.MAX_VALUE-1];
		int min = 1;
		int max = 2;
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testSwapTC14() {
		int[] data = new int [Integer.MAX_VALUE+1];
		int min = 1;
		int max = 2;
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSwapTC15() {
		//Wrong assumption
		int[] data = new int [0];
		int min = 0;
		int max = 0;
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testSwapTC16() {
		int[] data = new int [-1];
		int min = 1;
		int max = 2;
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testSwapTC17() {
		// Wrong assumption
		int[] data = new int [1];
		int min = 1;
		int max = 1;
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);	}
	
	@Test (expected =  ArrayIndexOutOfBoundsException.class)
	public void testSwapTC18() {
		int[] data = {14,28,35};
		int min = -1;
		int max = 2;
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSwapTC19() {
		// Wrong assumption
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE;
		int max = 2;
		Sorter.swap(data, min, max);
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testSwapTC20() {
		// Wrong assumption
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE - 1;
		int max = 2;
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testSwapTC21() {
		
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE + 1;
		int max = 2;
		Sorter.swap(data, min, max);
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testSwapTC22() {
		int[] data = {14,28,35};
		int min = 1;
		int max = -1;
		Sorter.swap(data, min, max);
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSwapTC23() {	
		//Wrong assumption
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE;
		int max = Integer.MAX_VALUE;
		Sorter.swap(data, min, max);
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testSwapTC24() {	
		//Wrong Assumption
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE;
		int max = Integer.MAX_VALUE - 1;;
		Sorter.swap(data, min, max);
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
		
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testSwapTC25() {		
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE;
		int max = Integer.MAX_VALUE + 1;
		Sorter.swap(data, min, max);
		int actual = Sorter.swap(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	// Partition
	@Test 
	public void testPartitionTC1() {
		int[] data = {14,28,35};
		int min = 1;
		int max = 2;
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testPartitionTC2() {
		// Code doesn't compile, int array is assigned to string
		//int[] data = "min";
		//int min = 1;
		//int max = 2;
		//Sorter.partition(data, min, max);
	}
	
	@Test (expected = NullPointerException.class)
	public void testPartitionTC3() {
		int[] data = null;
		int min = 1;
		int max = 2;
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testPartitionTC4() {
		int[] data = {14,28,35};
		int min = -5;
		int max = 2;
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testPartitionTC5() {
		// Code doesn't compile, int is assigned to double
		//int[] data = {14,28,35};
		//int min = -3.14;
		//int max = 2;
		//int actual = Sorter.partition(data, min, max);
		//int expected = 1;
		//assertEquals(expected, actual);
	}
	
	@Test 
	public void testPartitionTC6() {
		// Code doesn't compile, int is assigned to string
		//int[] data = {14,28,35};
		//int min = "index1";
		//int max = 2;
		//int actual = Sorter.partition(data, min, max);
		//int expected = 1;
		//assertEquals(expected, actual);
	}
	
	@Test 
	public void testPartitionTC7() {
		// Code doesn't compile, int is assigned to null
		//int[] data = {14,28,35};
		//int min = null;
		//int max = 2;
		//int actual = Sorter.partition(data, min, max);
		//int expected = 1;
		//assertEquals(expected, actual);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testPartitionTC8() {
		int[] data = {14,28,35};
		int min = 1;
		int max = -7;
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testPartitionSortTC9() {
		// Code doesn't compile, int is assigned to double
		//int[] data = {14,28,35};
		//int min = 6.32;
		//int max = 1;
		//int actual = Sorter.partition(data, min, max);
		//int expected = 1;
		//assertEquals(expected, actual);
	}
	
	@Test 
	public void testPartitionTC10() {
		// Code doesn't compile, int is assigned to string
		//int[] data = {14,28,35};
		//int min = 2;
		//int max = "index2";
		//int actual = Sorter.partition(data, min, max);
		//int expected = 1;
		//assertEquals(expected, actual);
	}
	
	@Test 
	public void testPartitionTC11() {
		// Code doesn't compile, int is assigned to null
		//int[] data = {14,28,35};
		//int min = 2;
		//int max = null;
		//int actual = Sorter.partition(data, min, max);
		//int expected = 1;
		//assertEquals(expected, actual);
	}
	
	@Test 
	public void testPartitionTC12() {
		//Wrong assumption
		
		int[] data = new int [Integer.MAX_VALUE];
		int min = 1;
		int max = 2;
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testPartitionTC13() {
		//Wrong assumption
		int[] data = new int [Integer.MAX_VALUE-1];
		int min = 1;
		int max = 2;
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testPartitionTC14() {
		int[] data = new int [Integer.MAX_VALUE+1];
		int min = 1;
		int max = 2;
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPartitionTC15() {
		//Wrong assumption
		int[] data = new int [0];
		int min = 0;
		int max = 0;
		int actual = Sorter.partition(data, min, max);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test (expected = NegativeArraySizeException.class)
	public void testPartitionTC16() {
		int[] data = new int [-1];
		int min = 1;
		int max = 2;
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testPartitionTC17() {
		// Wrong assumption
		int[] data = new int [1];
		int min = 1;
		int max = 1;
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);	}
	
	@Test (expected =  ArrayIndexOutOfBoundsException.class)
	public void testPartitionTC18() {
		int[] data = {14,28,35};
		int min = -1;
		int max = 2;
		int actual = Sorter.partition(data, min, max);
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPartitionTC19() {
		// Wrong assumption
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE;
		int max = 2;
		Sorter.swap(data, min, max);
		int actual = Sorter.partition(data, min, max);
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testPartitionTC20() {
		// Wrong assumption
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE - 1;
		int max = 2;
		int actual = Sorter.partition(data, min, max);
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testPartitionTC21() {
		
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE + 1;
		int max = 2;
		Sorter.swap(data, min, max);
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testPartitionTC22() {
		int[] data = {14,28,35};
		int min = 1;
		int max = -1;
		Sorter.swap(data, min, max);
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPartitionTC23() {	
		//Wrong assumption
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE;
		int max = Integer.MAX_VALUE;
		Sorter.swap(data, min, max);
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testPartitionTC24() {	
		//Wrong Assumption
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE;
		int max = Integer.MAX_VALUE - 1;;
		Sorter.swap(data, min, max);
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}
		
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testPartitionTC25() {		
		int[] data = {14,28,35};
		int min = Integer.MAX_VALUE;
		int max = Integer.MAX_VALUE + 1;
		Sorter.swap(data, min, max);
		int actual = Sorter.partition(data, min, max);
		int expected = 1;
		assertEquals(expected, actual);
	}

	public int[] readFromFile(int max, String fileName) {
		int val[] = new int[max];
		FileReader fr;
		try {
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String row = br.readLine();

			int counter = 0;
			while (row != null) {
				int tempRow = Integer.parseInt(row);
				val[counter] = tempRow;
				counter++;
				row = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return val;
	}

}
