
public class Client {

	public static void main(String args[]) {
		Component component,component1,component2;
		component = new Window();
		component1 = new BlackBorderDecorator(component);
		component2 = new ScrollBarDecorator(component1);
		component2.display();
	}
}
//ע�⣺װ��ģʽ���ǲ��ϵ���һ��װ�������ԭ�����࣬ÿһ�����ܾ�װ��һ�㣬ע����Щ���Ǽ̳���һ�����ࡣ