
public class BlackBorderDecorator extends ComponentDecorator {

	public BlackBorderDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		decorateBlackBorder();
		super.display();
	}
	
	private void decorateBlackBorder() {
		System.out.print("Decorate black border! ");
	}

}
