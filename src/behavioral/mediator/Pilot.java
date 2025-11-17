package behavioral.mediator;

public class Pilot extends Colleague {
    public Pilot(ControlTowerMediator mediator) {
        super(mediator);
    }

    public void requestLanding() {
        mediator.requestLanding(this);

    }
}
