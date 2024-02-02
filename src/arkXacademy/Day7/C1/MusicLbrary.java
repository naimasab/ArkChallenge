package arkXacademy.Day7.C1;

import java.util.ArrayList;

public class MusicLbrary {
    private ArrayList<AudioPlayer> audioPlayers;

    public MusicLbrary() {
        audioPlayers = new ArrayList<>();

        // Adding MP3 players with song titles
        audioPlayers.add(new MP3Player("Song 1 - Lalala",22));
        audioPlayers.add(new MP3Player("Song 2 - Lalala", 22));
        audioPlayers.add(new MP3Player("Song 3 - Lalala", 22));
        audioPlayers.add(new MP3Player("Song 4 - Lalala", 22));

        // Adding a CD player with a song title
        audioPlayers.add(new CDPlayer("CD Song - Lalala", 22));
    }

    public void displaySongList() {
        System.out.println("Available Songs:");
        for (int i = 0; i < audioPlayers.size(); i++) {
            System.out.println(i + ": " + getSongTitle(i));
        }
    }

    public void manipulateAudio(int audioIndex, String action) {
        if (audioIndex < 0 || audioIndex >= audioPlayers.size()) {
            System.out.println("Invalid audio index.");
            return;
        }

        AudioPlayer audioPlayer = audioPlayers.get(audioIndex);

        switch (action.toLowerCase()) {
            case "play":
                System.out.println("Playing: " + getSongTitle(audioIndex));
                audioPlayer.play();
                break;
            case "pause":
                System.out.println("Pausing: " + getSongTitle(audioIndex));
                audioPlayer.pause();
                break;
            case "stop":
                System.out.println("Stopping: " + getSongTitle(audioIndex));
                audioPlayer.stop();
                break;
            default:
                System.out.println("Invalid action.");
        }
    }

    public void setVolume(int audioIndex, int volume) {
        if (audioIndex < 0 || audioIndex >= audioPlayers.size()) {
            System.out.println("Invalid audio index.");
            return;
        }

        AudioPlayer audioPlayer = audioPlayers.get(audioIndex);

        if (audioPlayer instanceof MP3Player) {
            ((MP3Player) audioPlayer).setVolume(volume);
        } else if (audioPlayer instanceof CDPlayer) {
            ((CDPlayer) audioPlayer).setVolume(volume);
        }
    }

    public String getSongTitle(int audioIndex) {
        if (audioIndex >= 0 && audioIndex < audioPlayers.size()) {
            return audioPlayers.get(audioIndex) instanceof MP3Player ?
                    ((MP3Player) audioPlayers.get(audioIndex)).getSongTitle() :
                    ((CDPlayer) audioPlayers.get(audioIndex)).getSongTitle();
        }
        return "Invalid audio index";
    }
}
