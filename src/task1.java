import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = s.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }
        s.close();
    }
}
