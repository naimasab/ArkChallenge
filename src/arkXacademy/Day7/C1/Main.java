package arkXacademy.Day7.C1;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        MusicLbrary musicLibrary = new MusicLbrary();
        Scanner scanner = new Scanner(System.in);

        musicLibrary.displaySongList();

        System.out.println("Enter the index of the audio to manipulate:");
        int audioIndex = scanner.nextInt();

        System.out.println("Enter the action (play/pause/stop):");
        String action = scanner.next();

        musicLibrary.manipulateAudio(audioIndex, action);

        System.out.println("Enter the new volume for the audio:");
        int newVolume = scanner.nextInt();
        musicLibrary.setVolume(audioIndex, newVolume);
    }
}