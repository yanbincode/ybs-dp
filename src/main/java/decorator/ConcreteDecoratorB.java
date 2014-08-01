package decorator;

/**
 * 具体装饰角色(Concrete Decorator)：负责给构件添加增加的功能。
 * 
 * @author yanbin
 * 
 */
public class ConcreteDecoratorB extends Decorator {

	/** 设置一个变量，用于区别A */
	private String state;

	@Override
	public void operation() {
		super.operation();
		state = "new state";
		System.out.println("具体装饰对象B的操作：" + state);
	}

}
