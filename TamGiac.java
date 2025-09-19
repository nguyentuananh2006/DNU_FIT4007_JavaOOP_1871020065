import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double chuVi = a + b + c;

            double p = chuVi / 2; // nửa chu vi
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("Chu vi tam giác = " + chuVi);
            System.out.println("Diện tích tam giác = " + dienTich);
        } else {
            System.out.println("Ba cạnh vừa nhập không tạo thành một tam giác hợp lệ!");
        }

        sc.close();
    }
}
