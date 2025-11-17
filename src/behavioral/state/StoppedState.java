package behavioral.state;

class StoppedState implements State {
    public void pressPlay(Player player) {
        System.out.println("Starting the song...");
        player.setState(new PlayingState());
    }
}