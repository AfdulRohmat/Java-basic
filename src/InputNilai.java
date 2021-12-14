import java.util.Scanner; // import

public class InputNilai {
    public static void main(String[] args) {
        /* Terdapat beberapa cara untuk menginput data ke dalam bahasa Java, diantaranya:
            1. Scanner class
            2. BufferReader class
            3. Console class
         */

        // instansiasi Scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama anda = ");
        String nama = input.nextLine();

        System.out.print("Umur anda = ");
        int umur = input.nextInt();

        System.out.print("Tinggi badan = ");
        double tinggi_badan = input.nextDouble();


        System.out.println("Nama anda " + nama + ", berusia " + umur + "tahun, " + "punya Tinggi bada " + tinggi_badan + " cm.");
    }
}
