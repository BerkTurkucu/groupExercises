package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task_1 {
	
	//    TASK
	// 1- Create an array of 100 int elements 
	// 2- Randomly generate these elements (between 0 AND 100)
	// 3- Find the average of the array 
	// 4- Create an arrayList and add the below-average elements in the array to this arrayList
	// 5- Create an array. This array consists of only values "below 20" in the ArrayList.
		
	public static void main(String[] args) {
		
		Random rn = new Random();
		
		int numbers[] = new int[100]; //1
		int totalOfNumbers = 0;
		int averageOfNumbers = 0;
		
		for(int i = 0; i < numbers.length; i++) {	
			
			numbers[i] = rn.nextInt(101); //2   0 <= randomNum <= 100
			totalOfNumbers += numbers[i];
		}
		
		averageOfNumbers = totalOfNumbers/numbers.length; //3
		
		ArrayList<Integer> belowAverageList = new ArrayList<>(); //4
		
		
		for(int i = 0; i< numbers.length; i++) {//4		
			
			if(numbers[i] < averageOfNumbers) {			
				belowAverageList.add(numbers[i]);
			}
		}
		
		int countBelow20 = 0;//5 count the numbers that above the 20
		
		for(int each : belowAverageList) {
			
			if(each < 20) {
				countBelow20++;
			}
		}
		
		int [] below20Array = new int[countBelow20];//5
		
		for(int i = 0, j = 0; i < belowAverageList.size(); i++) {//5
			
			if(belowAverageList.get(i) < 20) {
				below20Array[j] = belowAverageList.get(i);
				j++;
			}			
		}
			
		//5 alternative way for converting arrayList to array
		//Integer [] belowAverageArray = belowAverageList.toArray(new Integer[0]); 
		
		System.out.println("Total Numbers : " + totalOfNumbers);
		System.out.println("Average of Numbers : " + averageOfNumbers);
		System.out.println(belowAverageList);
		System.out.println(Arrays.toString(below20Array));
	}
}
