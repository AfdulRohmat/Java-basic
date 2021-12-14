import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
            merupakan alternatif penulisan dari kondisi logika IF ELSE IF.
            Tidak semua kondisi IF ELSE IF bisa dikonversi ke dalam bentuk SWITCH CASE.
            Switch Case tidak bisa dipakai untuk kondisi yang lebih kompleks
            seperti perbandingan, operator logika, dll.
         */

        /*
            switch (nama_variabel) {
              case 'nilai_1':
                // Kode program yang dijalankan jika nama_variabel == nilai_1
                break;
              case 'nilai_2':
                // Kode program yang dijalankan jika nama_variabel == nilai_2
                break;
              case 'nilai_3':
                // Kode program yang dijalankan jika nama_variabel == nilai_3
                break;
              ...
              ...
              default:
                 // Kode program yang dijalankan jika tidak ada kondisi yang terpenuhi
            }
         */

        Scanner input = new Scanner(System.in);

        //Tingkat kelulusan berdasarkan nilai
        char nilai;

        System.out.println("===Tingkat kelulusan berdasarkan nilai===");

        System.out.print("Masukkan nilai anda (A-C) = ");
        nilai = input.next().charAt(0);

        switch (nilai) {
            case 'A':
                System.out.println("Nilai yang sempurna");
                break;
            case 'B':
                System.out.println("lumayan");
                break;
            case 'C':
                System.out.println("lebih giat lagi");
                break;
            default:
                System.out.println("Masukan nilai dengan benar!");
        }

    }
}
