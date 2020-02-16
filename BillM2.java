class Product{
	private String name;
	private Double unitPrice;
	

	public Product(String name,Double unitPrice){
		this.name=name;
		this.unitPrice=unitPrice;
	}

	public String getName(){
		return this.name;
	}

	public Double getUnitPrice(){
		return this.unitPrice;
	}

	
}

class Bill{
	// assume 0 index for product
	// assume 1 index for quantity
	private Product[][] productsArray=new Product[5][2];
	private int productCounter=0;

	public void purachaseProduct(Product product,Integer qty){
		productsArray[productCounter][0]=product;
		productsArray[productCounter][1]=qty;
		productCounter=productCounter+1;
	}

	public Double getTotal(){
		Double total=0.0;

		for(int i=0;i<productCounter;i++){
			total = total + this.calcualteSubtotal(i);
		}

		return total;
	}

	private Double calcualteSubtotal(int index){
		return productsArray[index][0].getUnitPrice()*productsArray[index][1];
	}

	public void printBill(){
		for(int i=0;i<productCounter;i++){
			System.out.println(" | \t" + productsArray[i][0].getName() + "\t | \t"+ productsArray[i][0].getUnitPrice() 
				+"\t | \t"+productsArray[i][1]+"\t | \t"+this.calcualteSubtotal(i));
		}	
	}
}

class BillM2{
	public static void main(String args[]){
		Product pr1=new Product("Apple",50.00);
		Product pr2=new Product("Orange",60.00);
		Product pr3=new Product("Banana",10.00);


		Bill billObj=new Bill();
		billObj.purachaseProduct(pr1,2);
		billObj.purachaseProduct(pr2,3);
		billObj.purachaseProduct(pr3,4);

		billObj.printBill();
		System.out.println("Total is : "+ billObj.getTotal());
	}
}
