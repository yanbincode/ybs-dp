package decorator;

/**
 * 装饰者模式：装饰模式（Decorator）也叫包装器模式（Wrapper）。动态地给一个对象添加一些额外的职责。<br>
 * Decorator 模式相比 生成子类更为灵活。
 * 
 * @author yanbin
 * 
 */
public class DecoratorPattern {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		Decorator decoratorA = new ConcreteDecoratorA();
		Decorator decoratorB = new ConcreteDecoratorB();
		component.operation();
		decoratorA.operation();
		decoratorB.operation();
	}

}
