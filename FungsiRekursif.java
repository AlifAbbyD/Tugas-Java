import java.util.*;

public class FungsiRekursif{
    public static void main(String[]args){
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = userInput.nextInt();
        System.out.println("Anda memasukkan nilai = " + nilai);
        
        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah = " + jumlah);
        
        int faktorial = hitungFaktorial(nilai);
        System.out.println("Hasil faktorial = " + faktorial);
    }
    // Fungsi rekursif sederhana
    private static int hitungFaktorial(int parameter){
        System.out.println("Parameter = " + parameter);
        
        if (parameter == 1){
            return parameter;
        }
        return parameter * hitungFaktorial( parameter - 1);
        
    }
    
    private static int jumlahNilai(int parameter){
        System.out.println("Parameter = " + parameter);
        
        if (parameter == 1){
            return parameter;
        }
        return parameter + jumlahNilai( parameter - 1);
        
    }
    
    private static int printNilai(int parameter){
        System.out.println("Nilai = " + parameter);
        
        if (parameter == 0){ 
        }
        
        parameter--;
        printNilai(parameter);
        return 0;
    }
}