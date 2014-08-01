package mediator;

/**
 * 抽象调停者角色
 * 
 * @author yanbin
 * 
 */
public interface Mediator {

	public void sendMsg(String message, Colleague colleague);

}
