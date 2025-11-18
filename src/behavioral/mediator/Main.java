package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower();

        Pilot pilot = new Pilot(controlTower);
        Radar radar = new Radar(controlTower);

        controlTower.requestLanding(pilot);
        controlTower.sendWeatherUpdate(radar);
    }
}
