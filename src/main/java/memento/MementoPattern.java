package memento;

/**
 * 备忘录模式（Memento）：又称标记（Token）模式。在不 破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后
 * 就可将该对象恢复到原先保存的状态。备忘录模式是专门来存放对象历史状态的。<br>
 * 组成：备忘录（Memento）角色；备忘发起（Originator）角色；备忘录管理者（Caretaker）角色；<br>
 * 
 * Java 中可保存封装的方法：第一种就是采用两个不同的接口类来限制访问权限。，一个提供比较完
 * 备的操作状态的方法，我们称它为宽接口；而另一个则可以只是一个标示，我们称它为窄接
 * 口。这种实现比较简单，但是需要人为的进行规范约束——而这往往是没有力度的。
 * 
 * 第二种方法便很好的解决了第一种的缺陷：采用内部类来控制访问权限。将备忘录角色 作为“备忘发起角色”的一个私有内部类。
 * 
 * 第三种方式是不太推荐使用的：使用 clone 方法来简化备忘录模式
 * 
 * 适用情况：如果备份的“备忘发起角色”存在大量的信息或者创建、恢复操作非常频繁，则可 能造成很大的开销。必须保存一个对象在某一个时刻的(部分)状态,
 * 这样以后需要时它才能恢复到先前的 状态。如果一个用接口来让其它对象直接得到这些状态，将会暴露对象的实现细节并破坏对象 的封装性。
 * 
 * @author yanbin
 * 
 */
public class MementoPattern {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		// 改变负责人对象的状态
		originator.setState("On");
		// 创建备忘录对象，并将发起人对象的状态储存起来
		caretaker.saveMemento(originator.createMemento());
		// 修改发起人的状态
		originator.setState("Off");
		// 恢复发起人对象的状态
		originator.restoreMemento(caretaker.retrieveMemento());

		System.out.println(originator.getState());
	}

}
