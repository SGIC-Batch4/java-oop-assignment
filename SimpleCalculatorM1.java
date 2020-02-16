class Calucations{

	public static double addition(double num1,double num2){
		return num1+num2;
	}

	public static double substraction(double num1,double num2){
		return num1-num2;
	}

	public static double multiplication(double num1,double num2){
		return num1*num2;
	}

	public static double division(double num1,double num2){
		return num1/num2;
	}
}



class SimpleCalculatorM1{

	public static void main(String args[]){
		System.out.println("Addition : "+ Calucations.addition(5,7));
		System.out.println("Addition : "+ Calucations.addition(15,7));

		System.out.println("Substraction : "+ Calucations.substraction(5,7));
		System.out.println("Multiplication : "+ Calucations.multiplication(5,7));
		System.out.println("Division : "+ Calucations.division(5,7));
	}
}
