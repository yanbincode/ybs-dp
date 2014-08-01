package mediator;

public class ConcreteColleagueA extends Colleague {

	public void sendMsg() {
		getMediator().sendMsg("通知B，想揍他", this);
	}

	public void notify(String message) {
		System.out.println("A接受到通知：" + message);
	}

}
