package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色
 * 
 * @author yanbin
 * 
 */
public abstract class Subject {

	/** 存放所有的观察者 */
	protected List<Observer> observers = new ArrayList<Observer>();

	/**
	 * 增加观察者
	 * 
	 * @param observer
	 */
	public void attach(Observer observer) {
		if (null != observer) {
			observers.add(observer);
		}
	}

	/**
	 * 移除观察者
	 * 
	 * @param observer
	 */
	public void detach(Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	/**
	 * 通知所有的观察者，由子类具体实现
	 * 
	 * @param subjectState
	 *            被观察者状态改变
	 */
	public abstract void nodifyChange(String subjectState);

}
