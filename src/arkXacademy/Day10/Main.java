package arkXacademy.Day10;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Player 1 name: ");
            Player player1 = new Player(scanner.nextLine());
            //String author= scanner.nextLine();          without using object

            System.out.print("Enter Player 2 name: ");
            Player player2 = new Player(scanner.nextLine());

            Story story = new Story();

            while (true) {
                System.out.print(player1.getPlayerName() + ", enter your sentence (type 'exit' to finish): ");
                String content = scanner.nextLine();

                if ("exit".equalsIgnoreCase(content)) {
                    break;
                }
                story.addSentence(content, player1);
                story.printStory();

                System.out.print(player2.getPlayerName() + ", enter your sentence (type 'exit' to finish): ");
                content = scanner.nextLine();

                if ("exit".equalsIgnoreCase(content)) {
                    break;
                }

                story.addSentence(content, player2);
                story.printStory();

                story.saveProgress("storyprogress.txt");
            }
            System.out.println("This is the story using load progress");
            story.loadProgress("storyprogress.txt");
            scanner.close();
        }
    }

