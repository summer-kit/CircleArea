import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int time = scanner.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;

        System.out.print(time + "second is ");
        System.out.print(hour + " hour,");
        System.out.print(minute + "minute, ");
        System.out.print(second + "second. ");

        scanner.close();
    }

}