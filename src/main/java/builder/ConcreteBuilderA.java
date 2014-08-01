package builder;

/**
 * 具体建造者角色：担任这个角色的是于应用程序紧密相关的类，它们在指导者的调用下 创建产品实例。这个角色在实现抽象建造者角色提供的方法的前提下，达到完成产品组
 * 装，提供成品的功能。
 * 
 * @author yanbin
 * 
 */
public class ConcreteBuilderA implements Builder {

	private Product product = new Product();

	public void buildPartA() {
		product.setPartA("大轮胎");
	}

	public void buildPartB() {
		product.setPartB("大方向盘");
	}

	public void buildPartC() {
		product.setPartC("大发动机");
	}

	public Product getResult() {
		return product;
	}

}
