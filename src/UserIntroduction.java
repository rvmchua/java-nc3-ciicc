import java.util.Scanner;

public class UserIntroduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("What is your favorite hobby?");
        String favoriteHobby = input.nextLine();
        input.close();

        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("You are " + age + " years old and love " + favoriteHobby + ".");
    }
}
