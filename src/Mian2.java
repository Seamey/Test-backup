import java.util.Scanner;

public class Mian2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<num; i++){
            System.out.println(i);
        }

    }
}
