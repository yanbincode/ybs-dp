package mediator;

public class ConcreteColleagueB extends Colleague {

	public void sendMsg() {
		getMediator().sendMsg("通知A，有问题", this);
	}

	public void notify(String message) {
		System.out.println("B接受到通知：" + message);
	}

}
