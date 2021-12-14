public class Method_Java {
     /*
            Method atau function adalah kode program yang
            dirancang untuk menyelesaikan sebuah tugas tertentu
            dan merupakan bagian dari program utama.

            Bahasa Java tidak dikenal istilah function,
            akan tetapi diganti dengan sebutan method.
         */

        /*
            static tipeDataKembalian namaFunction(TipeData parameter) {
              // Isi function disini...
              // Isi function disini...
              return nilai;
            }
         */

    // Method tanpa parameter
    static void hitungLuasSegitiga(){
        int panjang = 3;
        int lebar = 2;
        double luas = (panjang * lebar)/2;

        System.out.println(luas);
    }

    // Method degan paramater dan argument
    static void menyapa(String namaParam, String hariParam){
        System.out.println("Halo " + namaParam + ". Selamat " + hariParam);

    }

    // Method dengan return
        /*
            Tujuan adanya return pada method/function adalah
            agar sebuah method/function bisa mengembalikan nilai.
         */

        /*
            1. Tipe data yang direturn harus sesuai
               dengan yang ditulis ketika pendefinisian
               function.
            2. perintah return berfungsi mirip seperti
               break dalam perulangan. Jika ditemukan
               perintah return, pemrosesan function akan
               berhenti dan tidak akan mengeksekusi kode
               dibawahnya.
         */
    static double menghitungLuasSegitiga(double panjang_param, double lebar_param){
        double luas = (panjang_param * lebar_param)/2;

        return luas;
    }


    public static void main(String[] args) {
        hitungLuasSegitiga();
        menyapa("afdul", "siang");
        System.out.println(menghitungLuasSegitiga(2.1,3.4));;



    }
}
