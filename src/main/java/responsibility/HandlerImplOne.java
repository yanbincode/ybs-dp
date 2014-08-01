package responsibility;

/**
 * 具体处理角色
 * 
 * @author yanbin
 * 
 */
public class HandlerImplOne extends Handler {

	@Override
	public String handleRequest(Long number) {
		if (number > 10) {
			return "大于10跳出！";
		} else if (null != getHandler()) {
			return getHandler().handleRequest(number);
		}
		return "全部通过了！";
	}

}
