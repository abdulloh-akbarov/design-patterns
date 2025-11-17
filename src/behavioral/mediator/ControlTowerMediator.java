package behavioral.mediator;

public interface ControlTowerMediator {
    void requestLanding(Pilot pilot);

    void sendWeatherUpdate(Radar radar);
}
