<<<<<<< HEAD
public class Question17 {

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
=======
public class Question17 {

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
>>>>>>> bdbd430708b279b1f77a53ba7e3a3f7c0d7da5ff
}