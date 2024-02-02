package arkXacademy.Day7.C1;

class MP3Player extends AudioPlayer {
    private String songTitle;

    public MP3Player(String songTitle,int volume) {
        super(volume);
        this.songTitle=songTitle;
    }
    public String getSongTitle() {
        return songTitle;
    }
    @Override
    public void play() {
        System.out.println("MP3Player is playing. Song: " + songTitle);
    }

    @Override
    public void pause() {
        System.out.println("MP3Player is paused. Song: " + songTitle);
    }

    @Override
    public void stop() {
        System.out.println("MP3Player is stopped. Song: " + songTitle);
    }

    @Override
    public void setVolume(int volume) {
        super.setVolume(volume);
        System.out.println("MP3Player volume set to: " + volume);
    }
}
