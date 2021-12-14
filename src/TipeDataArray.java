public class TipeDataArray {
    public static void main(String[] args) {
        /* Cara Penulisan:
            1. tipedata[] namaVariable = {..isi array based on tipedata..};
            2. tipedata[] namaVariable;
                namaVariable = new tipedata[..jumlah array..];
                namaVariable[0] = isi;
                namaVariable[1] = isi;
                ..dst
         */

        int[] dataUmur = {10, 13, 21, 23, 30};
        System.out.println(dataUmur[0]);

        String[] dataNama;
        dataNama = new String[2];
        dataNama[0] = "Ana";
        dataNama[1] = "Fitria";
        System.out.println( dataNama[0] );
        System.out.println( dataNama[1] );


        // Array di dalam Array
        String[][] members = {
                {"Finda", "Atun"},
                {"Anja", "Iqbal"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);




    }
}
