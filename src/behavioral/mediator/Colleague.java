package behavioral.mediator;

abstract class Colleague {
    protected ControlTowerMediator mediator;

    public Colleague(ControlTowerMediator mediator) {
        this.mediator = mediator;
    }
}
