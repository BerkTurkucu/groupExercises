package example;

import java.util.Random;
import java.util.Scanner;

public class Task_2 {

	//   TASK
	// Get number of student from user
	// Get number of question from user
	// Create a 2D char array for holding students answers. (based on number of students and questions)
	// Create an char array that holds the right answers. (based on number of question).
	// Create a method that return char value randomly(it must be only one of these 'A','B','C','D','E')
	// Create a method that gives the answer key and accept a char array
	// Create a method that gives the answers of students and accept 2D char array(use the method that return char value)
	// Create a method that compares values and prints each student's correct answers.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Total Number of Student : ");
		int totalStudents = input.nextInt();
		
		System.out.print("Total Number of Question : ");
		int totalQuestions = input.nextInt();
		input.close();
				
		// ex: 3,10 -> 3 is number of student, 10 is number of Question		
		char [][] totalAnswer = new char[totalStudents][totalQuestions]; 
		char [] answerKey = new char[totalQuestions];
				
		createAnswerKey(answerKey);
		
		createAnswersForStudents(totalAnswer);
		
		System.out.println("---------------------");
		
		seeStudentsAnswers(totalAnswer);
		
		System.out.println("---------------------");		
		
		seeAnswerKey(answerKey);
		
		System.out.println("---------------------");		
		
		getResult(answerKey,totalAnswer);

	}
	
	public static char createAnswer() {
		Random rn = new Random();
		
		int num = rn.nextInt(5)+65; //65,66,67,68,69 -> A,B,C,D,E
		char answer = (char)num;
		return answer;
	}
	
	public static void createAnswerKey(char[] answerKey) {
		
		for(int i = 0; i < answerKey.length; i++) {
			answerKey[i] = createAnswer(); //create answer for the answer key
		}
		
	}
	
	public static void createAnswersForStudents(char[][] totalAnswer) {
		
		for(int row = 0; row < totalAnswer.length; row++) {
			
			for (int column = 0; column < totalAnswer[row].length; column++) {
				
				totalAnswer[row][column] = createAnswer(); //call the create answer method for giving value
			}
		}		
	}
	
	public static void seeStudentsAnswers(char[][] totalAnswer) {
		
		for(int row = 0; row < totalAnswer.length; row++) {
			System.out.print("Student " + (row+1) + ": ");
			for (int column = 0; column < totalAnswer[row].length; column++) {
				
				System.out.print(totalAnswer[row][column] + " ");
			}
			System.out.println();//new line for new Student
		}
		
	}
	
	public static void seeAnswerKey(char[] answerKey) {
		
		System.out.println("*** Answer Key ***");
		for(char answer : answerKey) {
			System.out.print(answer + " ");
		}
		System.out.println();//for new line
		
		
	}

	public static void getResult(char[] answerKey, char[][] totalAnswer) {
		
		for(int row = 0; row < totalAnswer.length; row++) {
			
			int countCorrectAnswers = 0;
			for(int column = 0; column < totalAnswer[row].length; column++) {
				
				if(totalAnswer[row][column] == answerKey[column]) {
					countCorrectAnswers++;
				}
			}
			
			System.out.print("Student " + (row+1) + " Total Correct : " + countCorrectAnswers + " -> ");
			retroMeeting(countCorrectAnswers,answerKey.length);
		}		
	}
	
	public static void retroMeeting(int corretAnswer, int numberOfQuestions) {
		
		int res = (int)(100*((double)corretAnswer/numberOfQuestions));

		
		int point = 3; // default 
		
		if(res >= 0 && res <= 20) {		
			point = 0;
		}else if(res > 20 && res <= 40) {
			point = 1;
		}else if(res > 40 && res <= 60) {
			point = 2;
		}else if(res > 90) {
			point = 5;
		}
		
		switch (point) {
		case 0:
			System.out.println("FAIL, You should die");
			break;
		case 1:
			System.out.println("FAIL, You need to more practice");
			break;
		case 2:
			System.out.println("PASS, You shouldn't be comfortable");
			break;
		case 5:
			System.out.println("PASS, *** You took the job ***");
			break;
		default:
			System.out.println("PASS, Rather Good");
			//break;
		}
	}
}
