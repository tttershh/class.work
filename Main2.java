import java.util.*;
import java.lang.*;
import java.io.*;

class Main2{
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
            String[] games = {"Genshin", "Dota2", "CookieRun kingdom"};

            System.out.print("Do you play games?");
            String answer = scanner.nextLine();

            if(answer.equalsIgnoreCase("yes")) {
                System.out.println("Games that you could play here: ");
                for(int i = 0; i < games.length; i++) {
                    System.out.println((i + 1) + " " + games[i]);
                }

                System.out.print("Which game would you choose? Enter the number: ");
                int choice = scanner.nextInt();

                if(choice >= 1 && choice <= games.length) {
                    System.out.println(games[choice - 1] + "...downloading...");
                    System.out.println("Your game has been downloaded! Now you can play!");
                } else {
                    System.out.println("Wrong choice");
                }
            } else {
                System.out.println("Okayy see you next time! :p ");
            }
            scanner.close();
    }
}