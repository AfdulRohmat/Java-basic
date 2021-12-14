import java.util.Scanner;

public class Pengkondisian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sistem login ala ala
        String username;
        String password;

        System.out.println("===Sistem login ala ala===");

        System.out.print("Buat username (tidak boleh kurang dari 2 character = ");
        username = input.nextLine();

        System.out.print("Buat password (tidak boleh kurang dari 2 character = ");
        password = input.nextLine();

        if((username.length() > 2) && (password.length() > 2)){
            System.out.println("Akun berhasil dibuat \n");
        } else {
            System.out.println("username atau password salah \n");
        }


        //Menebak angka ganjil atau genap
        double angka1;

        System.out.println("===Menebak angka ganjil atau genap===");

        System.out.print("Masukkan angka = ");
        angka1 = input.nextDouble();

        if(angka1 % 2 ==0){
            System.out.println("Angka adalah genap \n");
        }else {
            System.out.println("Angka adalah ganjil \n");
        }


        //Tingkat kelulusan berdasarkan nilai
        double nilai;

        System.out.println("===Tingkat kelulusan berdasarkan nilai===");

        System.out.print("Masukkan nilai anda (0 - 100) = ");
        nilai = input.nextDouble();

        if(nilai >= 80 && nilai <= 100){
            System.out.println("Nilai anda A");
            //
        }else if (nilai >= 60 && nilai <80){
            System.out.println("Nilai anda B");
            //
        }else if (nilai >= 40 && nilai <60){
            System.out.println("Nilai anda C");
            //
        }else if (nilai >= 0 && nilai < 40){
            System.out.println("Nilai anda D");
            //
        }else {
            System.out.println("Masukan nilai dengan benar!");
        }

    }
}
