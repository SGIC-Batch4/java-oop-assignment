class Calucations{

	public double addition(double num1,double num2){
		return num1+num2;
	}

	public double substraction(double num1,double num2){
		return num1-num2;
	}

	public double multiplication(double num1,double num2){
		return num1*num2;
	}

	public double division(double num1,double num2){
		return num1/num2;
	}
}



class SimpleCalculatorM2{

	public static void main(String args[]){
		Calucations calculationObj=new Calucations();

		System.out.println("Addition : "+ calculationObj.addition(5,7));
		System.out.println("Addition : "+ calculationObj.addition(15,7));

		System.out.println("Substraction : "+ calculationObj.substraction(5,7));
		System.out.println("Multiplication : "+ calculationObj.multiplication(5,7));
		System.out.println("Division : "+ calculationObj.division(5,7));
	}
}
