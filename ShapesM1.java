class Circle{
	private double radius;

	Circle(double radius){
		this.radius=radius;
	}

	public double area(){
		return 3.14*this.radius*this.radius;
	}

	public double perimeter(){
		return 2*3.14*this.radius;
	}
}

class ShapesM1{

	public static void main(String args[]){
		Circle circle1=new Circle(7);
		System.out.println("Area of circle  1 is : " + circle1.area());
		System.out.println("Perimeter of circle  1 is : " + circle1.perimeter());

		Circle circle2=new Circle(14);
		System.out.println("Area of circle  2 is : " + circle2.area());
		System.out.println("Perimeter of circle  2 is : " + circle2.perimeter());
	}
}
