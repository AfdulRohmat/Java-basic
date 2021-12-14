public class OperatorJava {
    public static void main(String[] args) {
        //Operator Aritmatika Unary dan Binary
        int a = 5;
        int b = 10;

        int hasilKali = a*b;
        System.out.println(hasilKali);


        //Operator Increment dan Decrement
        /*
        Pre-increment	++a	Tambah a sebanyak 1 angka, lalu tampilkan hasilnya
        Post-increment	a++	Tampilkan nilai a, lalu tambah a sebanyak 1 angka
        Pre-decrement	--a	Kurangi a sebanyak 1 angka, lalu tampilkan hasilnya
        Post-decrement	a--	Tampilkan nilai a, lalu kurangi a sebanyak 1 angka
         */
        int var1 = 10;
        var1++;
        System.out.println(var1);


        //Operator Perbandingan/Relasional
        /*
            ==	Sama dengan	5 == 5	true
            !=	Tidak sama dengan	5 != 5	false
            >	Lebih besar	5 > 6	false
            <	Lebih kecil	5 < 6	true
            >=	Lebih besar atau sama dengan	5 >= 3	true
            <=	Lebih kecil atau sama dengan	5 <= 5	true
         */
        int harga1 = 10_000;
        int harga2 = 20_000;

        if(harga1 != harga2){
            System.out.println("harga tidak sama");
        }

        int angka1=5;

        if (angka1 % 2 == 0){
            System.out.println("angka " + angka1 + " Genap");
        }else {
            System.out.println("angka " + angka1 + " Ganjil");
        }


        //Operator Logika/Boolean
        /*
        &&	And	Akan menghasilkan true jika kedua operand true	true && false, hasilnya: false
        ||	Or	Akan menghasilkan true jika salah satu operand true	true || false, hasilnya: false
        !	Not	Akan menghasilkan true jika operand false	!false, hasilnya: true
         */
        int hargaBaju = 20_000;
        int hargaKaos = 12_500;

        if(hargaBaju >=10_000 && hargaKaos >= 10_000){
            System.out.println("Harga pakaian lebih dari Rp 10 000");
        }





    }
}
