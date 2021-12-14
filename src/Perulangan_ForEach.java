public class Perulangan_ForEach {
    public static void main(String[] args) {
        /*
            Umumnya digunakan untuk mempermudah pengaksesan
            sebuah perulangan di Array.
         */

        /*
            for(var value : namaArray){
            System.out.println(value);
         */


        //Perulangan Array dengan looping FOR
        String[] daftarNama = {
                "Finda", "Atun", "Anja"
        };

        for(int i = 0; i< daftarNama.length; i++){
            System.out.println(daftarNama[i]);
        }

        System.out.println("");


        //Perulangan Array dengan ForEach
        String[] members = {
                "Finda", "Atun", "Anja", "Ria", "Filza"
        };

        for(var value : members){
            System.out.println(value);
        }
    }
}
