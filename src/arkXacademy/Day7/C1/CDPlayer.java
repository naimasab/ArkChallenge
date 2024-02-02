package arkXacademy.Day7.C1;

class CDPlayer extends AudioPlayer {
    private String songTitle;

    public CDPlayer(String songTitle, int volume) {
        super(volume);
        this.songTitle = songTitle;
    }

    public String getSongTitle() {
        return songTitle;
    }

    @Override
    public void play() {
        System.out.println("CDPlayer is playing. Song: " + songTitle);
    }

    @Override
    public void pause() {
        System.out.println("CDPlayer is paused. Song: " + songTitle);
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer is stopped. Song: " + songTitle);
    }

    @Override
    public void setVolume(int volume) {
        super.setVolume(volume);
        System.out.println("CDPlayer volume set to: " + volume);
    }
}
