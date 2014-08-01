package responsibility;

/**
 * 具体处理类
 * 
 * @author yanbin
 * 
 */
public class HandlerImplTwo extends Handler {

	@Override
	public String handleRequest(Long number) {
		if (number > 8) {
			return "大于8退出了！";
		} else if (null != getHandler()) {
			return getHandler().handleRequest(number);
		}
		return "全部通过了！";
	}

}
