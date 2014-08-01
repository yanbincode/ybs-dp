package mediator;

public class ConcreteMediator implements Mediator {

	private Colleague colleagueA;
	private Colleague colleagueB;

	public ConcreteMediator(Colleague colleagueA, Colleague colleagueB) {
		this.colleagueA = colleagueA;
		this.colleagueB = colleagueB;
	}

	@Override
	public void sendMsg(String message, Colleague colleague) {
		if (colleagueA == colleague) {
			colleagueB.notify(message);
		} else if (colleagueB == colleague) {
			colleagueA.notify(message);
		}
	}

}
