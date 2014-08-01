package mediator;

/**
 * 抽象同事角色
 * 
 * @author yanbin
 * 
 */
public abstract class Colleague {

	private Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void sendMsg();

	public abstract void notify(String message);

}
