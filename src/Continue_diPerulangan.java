public class Continue_diPerulangan {
    public static void main(String[] args) {
        /*
            Perintah CONTINUE mirip seperti perintah BREAK,
            hanya saja jika dalam perintah break perulangan
            langsung berhenti, untuk perintah continue
            perulangan hanya melewati 1 kali proses iterasi
            saja
         */

        int i;
        for (i = 1; i <= 10; i++) {
            if (i == 5) { //iterasi index i = 5 akan di skip
                continue;
            }
            System.out.println(i + " + " + i + " = "+ (i+i));
        }


    }
}
