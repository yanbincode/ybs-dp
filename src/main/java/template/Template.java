package template;

/**
 * 模板方法（Template Method）模式<br>
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些步骤<br>
 * 组成：抽象类：定义模板 ， 具体实现类：继承模板，定义自己的实现方法
 * 
 * @author yanbin
 * 
 */
public class Template {

	public static void main(String[] args) {
		ADriver aDriver = new ADriver();
		aDriver.run();// 调用模板方法
		System.out.println("============华丽的分割线================");
		BDriver bDriver = new BDriver();
		bDriver.run();
	}

}
