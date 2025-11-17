package behavioral.state;

public class PlayingState implements State {
    @Override
    public void pressPlay(Player player) {
        System.out.println("Pausing the song...");
        player.setState(new PausedState());
    }
}
