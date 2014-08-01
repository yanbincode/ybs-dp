package decorator;

/**
 * 具体构件角色(Concrete Component)：这是被装饰者，定义一个将要被装饰增加功能的 类。
 * 
 * @author yanbin
 * 
 */
public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		System.out.println("具体对象的操作！");
	}

}
