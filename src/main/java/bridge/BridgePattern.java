package bridge;

/**
 * 桥梁模式：将抽象部分与它的实现部分分离，使它 们都可以独立地变化。 抽象和实现是组合的关系。<br>
 * 也就是说，实现部分是被抽象部分调用，以用来完成（实现） 抽象部分的功能。 <br>
 * 组成：抽 象 （ Abstraction ） 角色： 它定义了抽象类的接口而且维护着一个指向实现（Implementor）角色的引用。<br>
 * 精确抽象（RefinedAbstraction）角色：实现并扩充由抽象角色定义的接口。<br>
 * 实现（Implementor）角色：给出了实现类的接口，这里的接口与抽象角色中的接口可以不一致。<br>
 * 具体实现（ConcreteImplementor）角色：给出了实现角色定义接口的具体实现。
 * 
 * @author yanbin
 * 
 */
public class BridgePattern {

	public static void main(String[] args) {
		Implementor implementorA = new ConcreteImplementorA();
		Abstraction abstractionA = new RefinedAbstraction(implementorA);

		Implementor implementorB = new ConcreteImplementorB();
		Abstraction abstractionB = new RefinedAbstraction(implementorB);

		implementorA.operation();
		implementorB.operation();
		abstractionA.operation();
		abstractionB.operation();
	}

}
