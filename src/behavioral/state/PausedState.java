package behavioral.state;

public class PausedState implements State {
    @Override
    public void pressPlay(Player player) {
        System.out.println("Resuming the song...");
        player.setState(new PlayingState());
    }
}
