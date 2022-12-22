package BAI2;

public class Rectangle implements IShape {
	public double length;
	public double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (length+width)*2;
	}

}
