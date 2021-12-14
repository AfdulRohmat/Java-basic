import java.util.Scanner;

public class TipeDataBoolean {
    public static void main(String[] args) {
        /*
            true -> default
            false
         */

        boolean sudahTidur = true;
        boolean sudahMakan = false;

        System.out.println(sudahTidur);
        System.out.println(sudahMakan);


        /*
           Umumnya, tipe data boolean di dapat dari hasil operasi perbandingan,
           seperti apakah sebuah angka sama dengan angka lain, apakah lebih besar
            atau lebih kecil, dst.
         */
        boolean var1, var2, var3;
        var1 = 1 < 2;
        var2 = 79 > 290;
        var3 = 63 == 63;

        System.out.println("var1 = "+var1);
        System.out.println("var2 = "+var2);
        System.out.println("var3 = "+var3);


        /*
           konsep true dan false ini sangat
           berguna untuk proses pemeriksaan kondisi if else
         */
        int minNilai = 75;
        int maxNilai = 100;

        // instansiasi Scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai anda = ");
        int nilai = input.nextInt();

        if(nilai >= minNilai && nilai <= maxNilai){
            System.out.println("Anda lulus");
        }else if (nilai > maxNilai){
            System.out.println("Nilai diluar jangkauan");
        }else {
            System.out.println("anda belum lulus");
        }



    }
}
