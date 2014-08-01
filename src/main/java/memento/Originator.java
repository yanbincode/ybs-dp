package memento;

/**
 * 备忘发起（Originator）角色：“备忘发起角色”创建一个备忘录，用以记录当前时刻它 的内部状态。在需要时使用备忘录恢复内部状态。
 * 
 * @author yanbin
 * 
 */
public class Originator {

	private String state;

	/**
	 * 返回一个新的备忘录对象
	 * 
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(state);
	}

	/**
	 * 将发起人恢复到备忘录对象所记载的状态
	 * 
	 * @param memento
	 */
	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("当前状态：" + this.state);
	}

}
