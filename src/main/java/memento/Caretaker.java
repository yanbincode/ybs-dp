package memento;

/**
 * 备忘录管理者（Caretaker）角色：负责保存好备忘录。不能对备忘录的内容进行操作 或检查。
 * 
 * @author yanbin
 * 
 */
public class Caretaker {

	private Memento memento;

	/**
	 * 备忘录的取值方法
	 * 
	 * @return
	 */
	public Memento retrieveMemento() {
		return this.memento;
	}

	/**
	 * 备忘录的赋值方法
	 * 
	 * @param memento
	 */
	public void saveMemento(Memento memento) {
		this.memento = memento;
	}

}
