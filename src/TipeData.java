public class TipeData {
    public static void main(String[] args) {
        //Tipe data primitif
        int integer = 20;
        double angka_dengan_koma = 12.4;
        char character = 'A';
        boolean benar_salah = true;

        //Tipe data non-primitiv
        String kata = "kata";
        int[] arrayAngka = {2,4,4,9};

        System.out.println(integer);
        System.out.println(angka_dengan_koma);
        System.out.println(character);
        System.out.println(benar_salah);
        System.out.println(kata);

        for(int i : arrayAngka){
            System.out.print(i + " ");
        }

    }
}
