import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh A");
        int a = scanner.nextInt();
        System.out.println("nhap canh B");
        int b = scanner.nextInt();
        System.out.println("nhap canh C");
        int c = scanner.nextInt();
        check(a, b, c);
    }

    public static void check(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0 || a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("không thỏa mãn tam giác");
        } else {
            System.out.println("thỏa mãn điều kiện tam giác");
        }
    }
}