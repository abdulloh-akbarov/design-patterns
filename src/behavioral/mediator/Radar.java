package behavioral.mediator;

public class Radar extends Colleague {
    public Radar(ControlTowerMediator mediator) {
        super(mediator);
    }

    public void sendWeatherUpdate(){
        mediator.sendWeatherUpdate(this);
    }
}
