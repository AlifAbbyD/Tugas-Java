public class JavaScope {
    public static void main(String[] args) {
        // Code here can't use x
        
        { // This is a block
         
         // Code here can't use x
        int x = 100;
        
        // Code here can use x
            System.out.println(x);
            
    }// The block ends here
        
     // Code here can't use x
    }   
}
