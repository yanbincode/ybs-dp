package observer;

/**
 * 观察者模式：定义了一种一对多的依赖关系，让多个观察者对象监听某一个主题对象。这个主体对象在状态发生变化时，会通知所有观察者对象，使他们能够自动更新自己。<br>
 * 组成：抽象目标角色（Subject）：目标角色知道它的观察者，可以有任意多个观察者观察同一个目标。<br>
 * 抽象观察者角色（Observer）：为那些在目标发生改变时需要获得通知的对象定义一个更新接口。<br>
 * 具体目标角色（Concrete Subject）：将有关状态存入各个Concrete
 * Observer对象。当它的状态发生改变时,向它的各个观察者发出通知。<br>
 * 具体观察者角色（Concrete Observer）：存储有关状态，这些状态应与目标的状态保持一致。<br>
 * 
 * @author yanbin
 * 
 */
public class ObserverPattern {

	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer observerA = new ConcreteObserver("A");
		Observer observerB = new ConcreteObserver("B");
		subject.attach(observerA);
		subject.attach(observerB);
		subject.nodifyChange("状态改成C了！ ");
	}

}
