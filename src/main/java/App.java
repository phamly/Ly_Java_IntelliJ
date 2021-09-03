import java.util.Scanner;

public class App {
    // khai bao bien: kieu du lieu ten bien = gia tri
    //static String global ="Global variable";    //bien toan cuc

    public static void main(String[] args){
        /*
        String str = "data Type";    //bien cuc bo
        final double PI = 3.14;     //bien hang so - final la tu khoa dung khai bao bien hằng
        System.out.println(str);
        sum();
        System.out.println("Name\tDOB");    // \t la ky tu hang so. la phim tab
        System.out.println(PI);
        */
        // ------ kieu du lieu nguyen thuy -----------------
        /*
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
        */
        // ------ kieu du lieu tham chieu -----------------
        /*
        Integer ref_i = 100;
        Short ref_s = 100;
        Long ref_l = 100000L;
        Float ref_f= 1.1f;
        Double ref_d = 3.1;
        */
        /*
        int a = 100;
        int b = 200;
        System.out.println("a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("a = " + a + ", b = " + b);
        */
        /*
        Integer a = 100;
        Integer b = 200;
        System.out.println("a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("a = " + a + ", b = " + b);
        */
        // ------ kieu du lieu enumerator -----------------
        /*
        seasons se = seasons.AUTUMN;
        System.out.println(se);
         */
        //-------------------------------- BAI TAP --------------------------
        // ------ Bai tap 6: nhap nam sinh cua 1 nguoi va tinh tuoi cua nguoi do
        /*
        int age, year, curDate;
        Date d = new Date();
        curDate = d.getYear() + 1900;
        year = 1980;
        age = curDate - year;
        System.out.println("age: " + age);*/

        // ------ Bai tap 7: nhap hai so a va b. Tinh tong, hieu, tich va thuong cua hai so do
        /*float a, b, tong, hieu, tich, thuong;
        a = 1022;
        b = 10.5f;
        tong = a + b;
        hieu = a - b;
        tich = a * b;
        thuong = a/b;
        System.out.println("Tong cua a va b la: " + tong);
        System.out.println("Hieu cua a va b la: " + hieu);
        System.out.println("Tich cua a va b la: " + tich);
        System.out.println("Thuong cua a va b la: " + thuong);*/
        // ------ Bai tap 8: Nhap so luong va don gia. tinh tien va thue gia tri gia tang phai tra, biet:
        // a. tien = so luong * don gia;
        // b. thue gia tri gia tang = 10% tien
        /*
        float soluong, dongia, tien, TGTGT;
        soluong = 10000;
        dongia = 22432.24234f;
        tien = soluong * dongia;
        TGTGT = (10 * tien)/100;
        System.out.println("Tien: " + tien);
        System.out.println("TGTGT: " + TGTGT);
        */

        // ------ Bai tap 9: Nhap vao diem thi va he so 3 mon Toan Ly Hoa cua 1 sv. Tinh diem trung binh cua sinh vien do
        /*double toan, ly, hoa;
        int heso;
        float dtb;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao diem mon toan: ");
        toan = scanner.nextDouble();
        System.out.println("Nhap vao diem mon ly: ");
        ly = scanner.nextDouble();
        System.out.println("Nhap vao diem mon hoa: ");
        hoa = scanner.nextDouble();
        System.out.println("Nhap vao he so: ");
        heso = scanner.nextInt();
        dtb= (float)((toan*heso) + (ly*heso) + (hoa * heso))/ (heso * 3);
        System.out.println("Diem trung binh cua Toan Ly Hoa: " + dtb);*/

        // ------ Bai tap 10: Nhap ban kinh hinh tron. Tinh chu vi va dien tich hinh tron do
        /*double bankinh, chuvi, dientich;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh cua hinh tron");
        bankinh = scanner.nextFloat();
        chuvi = 2 * bankinh * Math.PI;
        System.out.println("Chu vi hinh tron la: " + chuvi);
        dientich = bankinh*bankinh*Math.PI;
        System.out.println("Dien tich hinh trong la: " + dientich);*/

        // ------ Bai tap 11: Nhap vao so xe cua ban (5 chu so). cho biet so xe cua ban dc may nut.

        int soxe;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so xe 5 chu so cua ban:");
        soxe = scanner.nextInt();
        int a1 = soxe/10000;
        int a2 = (soxe/1000)%10;
        int a3 = (soxe/100)%10;
        int a4 = (soxe/10)%10;
        int a5 = soxe%10;
        int sum = a1 + a2 + a3 + a4 + a5;
        int result = sum % 10;
        System.out.println("Bien so xe ban duoc " + result + " nut");
    }

   /* static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swab: a = " + a + ", b = " + b);
    }*/

   /* static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swab: a = " + a + ", b = " + b);
    }*/

    /*public static void sum(){
        System.out.println(global);
    }*/

}
