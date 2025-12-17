import java.util.Scanner;

class WelcomeView {
    WelcomeView() {
        int tripleT;
        int gabe = 5;
        System.out.println("Gabe is a sigma boy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Is this true");
        String answer = sc.nextLine();
        if (answer.equals("Yes")) {
            System.out.println("Goodboy");
        } else {
            System.out.println(" Triple T will get you... I promise");
        }

    }
}
