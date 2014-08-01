package facade;

/**
 * 门面模式：又称外观模式，为子系 统中的一组接口提供一个一致的界面。门面模式定义一个高层接口，这一接口使得这一子系统更加容易使用<br>
 * 组成：门面角色； 子系统角色；客户角色。<br>
 * Facade 模式的一个典型应用就是进行数据库连接。<br>
 * 使用场景：当你要为一个复杂子系统提供一个简单接口时。客户程序与抽象类的实现部分之间存在着很大的依赖性。当你需要构建一个层次结构的子系统时，使用facade
 * 模式定义子系统中每层的入口点 <br>
 * 优点：它对客户屏蔽子系统组件，因而减少了客户处理的对象的数目并使得子系统使用起来更
 * 加方便。它实现了子系统与客户之间的松耦合关系，而子系统内部的功能组件往往是紧耦合的。
 * 
 * @author yanbin
 * 
 */
public class FacadePattern {

	public static void main(String[] args) {
		Client client = new Client();
		client.method();
	}

}
