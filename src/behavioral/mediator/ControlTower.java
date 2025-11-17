package behavioral.mediator;

public class ControlTower implements ControlTowerMediator {
    @Override
    public void requestLanding(Pilot pilot) {
        System.out.println("Requesting landing");
    }

    @Override
    public void sendWeatherUpdate(Radar radar) {
        System.out.println("Sending weather update");
    }
}
