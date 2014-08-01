package facade;

/**
 * 门面角色：这是门面模式的核心。它被客户角色调用
 * 
 * @author yanbin
 * 
 */
public class Facade {

	/**
	 * client 只关注统一的调用，不需要关注内部的子系统的实现。
	 */
	public void method() {
		SubSystemA a = new SubSystemA();
		SubSystemB b = new SubSystemB();
		a.method();
		b.method();
	}

}
