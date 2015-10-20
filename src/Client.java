
public class Client {

	public static void main(String args[]) {
		Component component,component1,component2;
		component = new Window();
		component1 = new BlackBorderDecorator(component);
		component2 = new ScrollBarDecorator(component1);
		component2.display();
	}
}
//注意：装饰模式就是不断的用一个装饰类包裹原来的类，每一个功能就装饰一层，注意这些都是继承至一个基类。