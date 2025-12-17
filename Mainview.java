import java.util.Scanner;

public static void main(String[] args) {
    public class Mainview {
        Scanner sc = new Scanner(System.in);
        Mainview() {
            System.out.println("Who is better mika or sina");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("Mika")) {
                System.out.println("Correct!");
            } else if (answer.equalsIgnoreCase("Sina")) {
                System.out.println("Wrong!");
            }
        }
    }
}