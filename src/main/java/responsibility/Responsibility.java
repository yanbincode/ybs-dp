package responsibility;

import java.util.Scanner;

/**
 * 责任链模式 1、定义：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。<br/>
 * 将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理他为止。<br/>
 * 2、运用场景：有多个类对请求处理，但不明确哪个类进行处理。可处理一个请求的对象应该被动态指定。<br/>
 * 3、具体类中的处理方法，组合出来的链应该是递归调用的。<br/>
 * 4、组成角色：抽象处理角色(Handler)， 具体处理者角色(Concrete Handler)。<br>
 * 5、责任模式有解偶的情况。<br>
 * 6、客户端可以定义链路结构，也可以在责任链中定义好链路结构。前者较灵活，后者更封装
 * 
 * 
 * @author yanbin
 * 
 */
public class Responsibility {

	public static void main(String[] args) {
		// 从控制台输入数字
		System.out.println("请输入你要处理的数字：");
		Scanner input = new Scanner(System.in);
		Long testObject = input.nextLong();
		Handler handler1 = new HandlerImplOne();
		Handler handler2 = new HandlerImplTwo();
		Handler handler3 = new HandlerImplThree();
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		String info = handler1.handleRequest(testObject);
		System.out.println(info);
	}

}
