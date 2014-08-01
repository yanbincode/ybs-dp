package observer;

/**
 * 具体观察者角色
 * 
 * @author yanbin
 * 
 */
public class ConcreteObserver implements Observer {

	/** 观察者状态 */
	private String observerState;

	public ConcreteObserver(String observerState) {
		this.observerState = observerState;
	}

	@Override
	public void update(String observerState) {
		this.observerState = observerState;
		System.out.println("接到通知，做出反应。状态改为：" + this.observerState);
	}

	public String getObserverState() {
		return observerState;
	}

	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}

}
