
public class ScrollBarDecorator extends ComponentDecorator{

	public ScrollBarDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		decoratScrollBar();
		super.display();
	}

	private void decoratScrollBar() {
		System.out.print("Decorate scroll bar! ");
	}
}
