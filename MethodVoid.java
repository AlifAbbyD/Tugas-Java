
import static jdk.nashorn.tools.ShellFunctions.input;

public class MethodVoid {
    public static void main(String[] args) {
        // Void itu artinya hampa
        
        System.out.println(simpel());
        
        fungsiVoid("Apa pun");
        selamatPagi("Emak");
        selamatPagi("Abah");
    }
       private static void selamatPagi(String nama){
           System.out.println("Selamat Pagi "+nama);
       }
    // Fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }
    
    // Fungsi atau method dengan kembalian
    // Sehingga menggunakan return untuk
    // Mengembalikan nilainya (10.0f)
    private static float simpel(){
        return 10.0f;
    }
}
