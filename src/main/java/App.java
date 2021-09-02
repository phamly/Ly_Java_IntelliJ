public class App {
    // khai bao bien: kieu du lieu ten bien = gia tri
    static String global ="Global variable";    //bien toan cuc

    public static void main(String[] args){
        String str = "data Type";    //bien cuc bo
        System.out.println(str);
        sum();

        final double PI = 3.14;     //bien hang so - final la tu khoa dung khai bao bien hằng

        System.out.println("Name\tDOB");    // \t la ky tu hang so. la phim tab
        System.out.println(PI);

        // ------ kieu du lieu nguyen thuy -----------------

        // 1. kieu so nguyen. gia tri mac dinh la 0
        byte bai = 1;     // -218 -> 217
        short s = 10;   // -32768 -> 32767
        int i = 10;     // -2^31 -> 2^31-1
        long l = 1000000000;    // -2^63 -> 2^63-1
        long l2 = 100L; // 'L' là dùng để Jva biết là kiue Long vì 100 là số nhỏ khong de L thi se hieu la so int.

        // 2. kieu so thuc. gia tri mac dinh la 0
        float f =3.1f;
        double d = 3.1;

        // 3. kieu ky tu. gia tri mac dinh la null
        char c ='c';
        char c1 = '5';
        char c3 = 65;   // 65 la vi tri cua ky tu o vi tri 65. la 'A'

        // 4. kieu luan ly:
        boolean b1 = true;
        boolean b2 = false;

        // ------ kieu du lieu tham chieu -----------------

        Integer ref_i = 100;
        Short ref_s = 100;
        Long ref_l = 100000L;
        Float ref_f= 1.1f;
        Double ref_d = 3.1;

        /*
        int a = 100;
        int b = 200;
        System.out.println("a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("a = " + a + ", b = " + b);
        */

        Integer a = 100;
        Integer b = 200;
        System.out.println("a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("a = " + a + ", b = " + b);

        // ------ kieu du lieu enumerator -----------------
        seasons se = seasons.AUTUMN;
        System.out.println(se);
    }

    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swab: a = " + a + ", b = " + b);
    }

   /* static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swab: a = " + a + ", b = " + b);
    }*/

    public static void sum(){
        System.out.println(global);
    }
}
