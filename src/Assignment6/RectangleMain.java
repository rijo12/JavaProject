package Assignment6;

public class RectangleMain {

	public static void main(String[] args) {
		
		Rectangle rectangle1= new Rectangle();
		
		Rectangle rectangle2= new Rectangle();
		
		int lengthRect1=rectangle1.length= 4;
		int widthRect1=rectangle1.width=5;
		
		int lengthRect2=rectangle2.length=5;
		int widthRect2=rectangle2.width=8;
		
		int areaOfRectangle1= rectangle1.areaOfRectangle(lengthRect1,widthRect1);
		
		System.out.println("Area of Rectangle1= "+ areaOfRectangle1);
		
		int areaOfRectangle2 = rectangle2.areaOfRectangle(lengthRect2,widthRect2);
		
		System.out.println("Area of Rectangle2= "+ areaOfRectangle2);
		
	}

}
