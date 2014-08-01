package builder;

/**
 * 产品对象角色：建造中的复杂对象。它要包含那些定义组件的类，包括将这些组件装配成产 品的接口。 包括产品本身和装配方法<br>
 * 
 * @author yanbin
 * 
 */
public class Product {

	private String partA;

	private String partB;

	private String partC;

	public String getPartA() {
		return partA;
	}

	public void setPartA(String partA) {
		this.partA = partA;
	}

	public String getPartB() {
		return partB;
	}

	public void setPartB(String partB) {
		this.partB = partB;
	}

	public String getPartC() {
		return partC;
	}

	public void setPartC(String partC) {
		this.partC = partC;
	}

}
