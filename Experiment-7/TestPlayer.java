interface Playable {        // Playable interface with play, pause, and stop methods
    void play();
    void pause();
    void stop();
}
class MusicPlayer implements Playable {     // MusicPlayer class implementing Playable interface
    @Override
    public void play() {
        System.out.println("Music is playing.");
    }
    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }
    @Override
    public void stop() {
        System.out.println("Music is stopped.");
    }
}
public class TestPlayer {
    public static void main(String[] args) {
        MusicPlayer myPlayer = new MusicPlayer();

        myPlayer.play();
        myPlayer.pause();
        myPlayer.stop();
    }
}
