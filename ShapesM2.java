class Circle{
	private static Double radius;

	public static void setRadius(double radius){
		radius=radius;
	}

	public static Double area(){
		return 3.14*radius*radius;
	}

	public static Double perimeter(){
		return 2*3.14*radius;
	}
}

class ShapesM2{

	public static void main(String args[]){
		Circle.setRadius(7);
		System.out.println("Area of circle  1 is : " + Circle.area());
		System.out.println("Perimeter of circle  1 is : " + Circle.perimeter());

		Circle.setRadius(7);
		System.out.println("Area of circle  2 is : " + Circle.area());
		System.out.println("Perimeter of circle  2 is : " + Circle.perimeter());
	}
}
