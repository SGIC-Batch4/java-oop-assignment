class Product{
	private String name;
	private Double unitPrice;
	private Integer quantity;

	public Product(String name,Double unitPrice){
		this.name=name;
		this.unitPrice=unitPrice;
	}

	public void setQuantity(Integer quantity){
		if(quantity > 0){
			this.quantity=quantity;
		}
	}

	public Double getSubtotal(){
		return this.unitPrice*this.quantity;
	}

	public String getName(){
		return this.name;
	}

	public Double getUnitPrice(){
		return this.unitPrice;
	}

	public Integer getQuantity(){
		return this.quantity;
	}
}

class Bill{
	private Product[] productsArray=new Product[5];
	private int productCounter=0;

	public void addProduct(Product product){
		productsArray[productCounter]=product;
		productCounter=productCounter+1;
	}

	public Double getTotal(){
		Double total=0.0;

		for(int i=0;i<productCounter;i++){
			total = total + productsArray[i].getSubtotal();
		}

		return total;
	}

	public void printBill(){
		for(int i=0;i<productCounter;i++){
			System.out.println(" | \t" + productsArray[i].getName() + "\t | \t"+ productsArray[i].getUnitPrice() 
				+"\t | \t"+productsArray[i].getQuantity()+"\t | \t"+productsArray[i].getSubtotal());
		}	
	}
}

class BillM1{
	public static void main(String args[]){
		Product pr1=new Product("Apple",50.00);
		Product pr2=new Product("Orange",60.00);
		Product pr3=new Product("Banana",10.00);

		pr1.setQuantity(2);
		pr2.setQuantity(3);
		pr3.setQuantity(4);

		Bill billObj=new Bill();
		billObj.addProduct(pr1);
		billObj.addProduct(pr2);
		billObj.addProduct(pr3);

		billObj.printBill();
		System.out.println("Total is : "+ billObj.getTotal());
	}
}
