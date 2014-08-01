package observer;

/**
 * 抽象观察者角色，定义统一的更新状态方法
 * 
 * @author yanbin
 * 
 */
public interface Observer {

	/**
	 * 状态改变
	 * 
	 * @param subjectState
	 */
	public void update(String subjectState);

}
