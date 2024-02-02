package arkXacademy.Day7.C1;

abstract class AudioPlayer implements Playable {
    int volume;

    public AudioPlayer(int volume) {
        this.volume = volume;
        System.out.println("Volume : " + volume);
    }



    @Override
    public void play() {
        // Implement play functionality here
        System.out.println("Playing...");
    }

    @Override
    public void pause() {
        // Implement pause functionality here
        System.out.println("Pausing...");
    }

    @Override
    public void stop() {
        // Implement stop functionality here
        System.out.println("Stopping...");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to: " + volume);
    }
}
