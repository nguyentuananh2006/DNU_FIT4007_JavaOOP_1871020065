import java.util.Scanner;

public class Tinhtoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        String thuong;
        if (b != 0) {

            double kq = (double) a / b;
            thuong = String.valueOf(kq);
        } else {
            thuong = "Không xác định (b = 0)";
        }
        System.out.println("Tổng = " + tong);
        System.out.println("Hiệu = " + hieu);
        System.out.println("Tích = " + tich);
        System.out.println("Thương = " + thuong);

        sc.close();
    }
}
