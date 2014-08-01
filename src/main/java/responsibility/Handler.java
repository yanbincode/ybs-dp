package responsibility;

/**
 * 抽象处理器
 * 
 * @author yanbin
 * 
 */
public abstract class Handler {

	private Handler handler;

	/**
	 * 实现的抽象处理方法
	 * 
	 * @param number
	 * @return
	 */
	public abstract String handleRequest(Long number);

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

}
