<<<<<<< HEAD
package Lab3;

public class Question12 {
    
    public static void main(String[] args) {
        
        String str = "dogcatdogcat dog cat cat dog";
        int catCounter = 0;
        int dogCounter = 0;
        
        
        for(int i = 0; i < str.length()-2; i++) {
            
            if(str.substring(i, i+3).equals("cat")) {    // we can use "equalsIgnoreCase" method for the cat Cat CAT cAT etc.
                catCounter++;
            }
            if(str.substring(i, i+3).equals("dog")) {
                dogCounter++;
            }
            
            
        }
        boolean b = dogCounter == catCounter;
        System.out.println(b);
    }
=======
package Lab3;

public class Question12 {
    
    public static void main(String[] args) {
        
        String str = "dogcatdogcat dog cat cat dog";
        int catCounter = 0;
        int dogCounter = 0;
        
        
        for(int i = 0; i < str.length()-2; i++) {
            
            if(str.substring(i, i+3).equals("cat")) {    // we can use "equalsIgnoreCase" method for the cat Cat CAT cAT etc.
                catCounter++;
            }
            if(str.substring(i, i+3).equals("dog")) {
                dogCounter++;
            }
            
            
        }
        boolean b = dogCounter == catCounter;
        System.out.println(b);
    }
>>>>>>> bdbd430708b279b1f77a53ba7e3a3f7c0d7da5ff
}