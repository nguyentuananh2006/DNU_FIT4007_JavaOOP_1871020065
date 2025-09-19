import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double chieuDai = sc.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double chieuRong = sc.nextDouble();

        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi hình chữ nhật = " + chuVi);
        System.out.println("Diện tích hình chữ nhật = " + dienTich);

        sc.close();
    }
}
