import java.util.Scanner;

public class summary {

    public static void main(String[] args) {
        
        palindromeWord();
    }
    public static void palindromeWord() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Word : ");
        String word = input.next();
        input.close();
        
        String dummy = "";
        
        for(int i = word.length()-1 ; i >= 0 ; i--) {
            dummy = dummy + word.charAt(i);
        }
        if(word.replace(" ", "").equalsIgnoreCase(dummy.replace(" ", ""))) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }    
