import java.util.*;
public class LatihanFungsi {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("Lebar = ");
        int inputLebar = userInput.nextInt();
        
        gambar(inputPanjang, inputLebar);
        
        System.out.println("Luas = " + luas(inputPanjang, inputLebar));
        System.out.println("Keliling = " + keliling(inputPanjang, inputLebar));
        
        tampilkanKelilingDanLuas(inputPanjang, inputLebar);
    }
    private static void tampilkanKelilingDanLuas(int panjang, int lebar){
        System.out.println("Luas = " + luas(panjang, lebar));
        System.out.println("Keliling = " + keliling(panjang, lebar));
    }
    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }
    private static void gambar(int panjang, int lebar){
        for(int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    private static String luas(int inputPanjang, int inputLebar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
