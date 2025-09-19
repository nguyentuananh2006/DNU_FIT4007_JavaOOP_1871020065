import java.util.Scanner;

public class ChuSoGanCuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên N (có ít nhất 2 chữ số): ");
        int n = sc.nextInt();

        if (Math.abs(n) > 9) {
            int ganCuoi = Math.abs((n % 100) / 10);

            System.out.println("Chữ số gần cuối của " + n + " là: " + ganCuoi);
        } else {
            System.out.println("Số nhập vào không hợp lệ! N phải có ít nhất 2 chữ số.");
        }

        sc.close();
    }
}
