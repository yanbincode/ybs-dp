package memento;

/**
 * 备忘录（Memento）角色：备忘录角色存储“备忘发起角色”的内部状态。“备忘发起角色”根据需要决定备忘录角色存储“备忘发起角色”的哪些内部状态。<br>
 * 为了防止“备忘发起角色”以外的其他对象访问备忘录。备忘录实际上有两个接口，“备忘录管理者角色”只能看到备忘录提供的窄接口——
 * 对于备忘录角色中存放的属性是不可见的。“备 忘发起角色”则能够看到一个宽接口——能够得到自己放入备忘录角色中属性。 <br>
 * 
 * 
 * @author yanbin
 * 
 */
public class Memento {

	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
