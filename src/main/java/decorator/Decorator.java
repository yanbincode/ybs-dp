package decorator;

/**
 * 装饰角色(Decorator)：持有一个构件对象的实例，并定义了抽象构件定义的接口。
 * 
 * @author yanbin
 * 
 */
public class Decorator implements Component {

	private Component component;

	@Override
	public void operation() {
		if (null != component) {
			component.operation();
		}
	}

	public void setComponent(Component component) {
		this.component = component;
	}

}
