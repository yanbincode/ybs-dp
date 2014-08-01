package decorator;

/**
 * 具体装饰角色(Concrete Decorator)：负责给构件添加增加的功能。
 * 
 * @author yanbin
 * 
 */
public class ConcreteDecoratorA extends Decorator {

	@Override
	public void operation() {
		super.operation();
		addState();
		System.out.println("具体装饰对象A的操作！");
	}

	/**
	 * 区别B的A类独有的装饰
	 */
	private void addState() {
		System.out.println("add new state");
	}

}
