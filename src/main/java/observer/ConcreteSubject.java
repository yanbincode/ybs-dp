package observer;

/**
 * 具体的主题角色类（被观察者类）
 * 
 * @author yanbin
 * 
 */
public class ConcreteSubject extends Subject {

	/** 主题角色状态 */
	private String subjectState;

	@Override
	public void nodifyChange(String subjectState) {
		this.subjectState = subjectState;
		for (Observer observer : observers) {
			observer.update(subjectState);
		}
	}

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}

}
