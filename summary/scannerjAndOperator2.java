package summary;

import java.util.Scanner;

public class scannerjAndOperator2 {
	public static void main(String[] args) {
		 Scanner note = new Scanner(System.in);

	        System.out.print("enter your first point: ");
	        int firstNote = note.nextInt();

	        System.out.print("final point: ");
	        int finalNotu = note.nextInt();

	        int enteredfirst = (firstNote * 30) / 100; 
	        int enteredlast = (finalNotu * 70) / 100; 
	        int total = enteredfirst + enteredlast;

	        System.out.print("r\t"+"esult : "+total);
	}

}
/*
 * String için  --> next
int için     --> nextInt
float için   --> nextFloat
double için  --> nextDouble
byte için    --> nextByte

*
*\b --> Önceki karakteri silmeye yarar
\t --> Tab
\r --> Satır başı yapar
\n --> Satır atlar
\" --> Çift tırnak
*/
