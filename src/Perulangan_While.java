public class Perulangan_While {
    public static void main(String[] args) {
        /*
            start;
            while (condition)
            {
               // kode program
               // kode program
              increment (Harus dibuat untuk menghindari infinity loop);
            }
         */

        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }

        System.out.println(" ");

        int a = 5;
        while (a >=0){
            System.out.println(a);
            a--;
        }

        System.out.println(" ");

        int b = 0;
        while (b<=10){
            System.out.println(b*3);
            b++;
        }
    }
}
