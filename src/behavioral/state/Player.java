package behavioral.state;

public class Player {
    State state;

    public Player() {
        state = new StoppedState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPlay() {
        state.pressPlay(this);
    }
}
