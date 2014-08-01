package mediator;

/**
 * 调停者模式：用一个调停对象来封装一系列的对象交互。 <br>
 * 组成：抽象调停者（Mediator）角色；具体调停者（Concrete Mediator）角色；<br>
 * 同事（Colleague）角色；具体同事角色（ConcreteColleague）<br>
 * 调停者模式的作用便是将关系错乱复 杂、层次不清晰的对象群分割成两层或者三层。<br>
 * 结构上和观察者模式、命令模式十分相像；而应用目的又与结构模式“门面模式”有些相似。
 * 
 * @author yanbin
 * 
 */
public class MediatorPattern {

	public static void main(String[] args) {
		Colleague colleagueA = new ConcreteColleagueA();
		Colleague colleagueB = new ConcreteColleagueB();
		Mediator mediator = new ConcreteMediator(colleagueA, colleagueB);
		colleagueA.setMediator(mediator);
		colleagueB.setMediator(mediator);

		colleagueA.sendMsg();
		colleagueB.sendMsg();
	}

}
