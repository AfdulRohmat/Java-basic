public class Break_diPerulangan {
    public static void main(String[] args) {
        /*
            BREAK adalah perintah khusus yang dipakai
            untuk memaksa sebuah perulangan berhenti sebelum waktunya.
            Perintah break ini bisa dipakai dalam semua jenis perulangan,
            baik itu FOR, WHILE, maupun DO WHILE.
         */

        /*
            for (start; condition_1; increment)
            {
               // kode program
               // kode program
               if (condition_2) {
                 break;
               }
            }
         */

        // Break pada For
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
            if(i == 8){
                break;
            }
        }

        System.out.println("");

        // Break pada While
        int a = 1;
        while (a<=10){
            if(a == 3){
                break;
            }
            System.out.println(a*3);
            a++;
        }

    }
}
