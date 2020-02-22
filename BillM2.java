class Product{
	private String id;
	private String name;
	private Double unitPrice;
	

	public Product(String id,String name,Double unitPrice){
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
	}
	
	public String getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	public Double getUnitPrice(){
		return this.unitPrice;
	}

	
}

class Bill{
	private String billno;
	private String customerName;
	private Product[] products=new Product[5];
	private Integer[] quantities=new Integer[5];

	private int productCounter=0;

	Bill(String billno,String customerName){
		this.billno=billno;
		this.customerName=customerName;
	}

	public void purachaseProduct(Product product,Integer quantity){
		this.products[productCounter]=product;
		this.quantities[productCounter]=quantity;
		productCounter=productCounter+1;
	}

	private Double calcualteSubtotal(int index){
		return products[index].getUnitPrice()*quantities[index];
	}

	public Double getTotal(){
		Double total=0.0;

		for(int i=0;i<productCounter;i++){
			total = total + this.calcualteSubtotal(i);
		}

		return total;
	}

	

	public void printBill(){
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Bill Number : "+this.billno);
		System.out.println("Id\t|\tName\t|\tuprice\t|\tqty\t|\tsubtotal");
		for(int i=0;i<productCounter;i++){
			System.out.println(products[i].getId()+"\t|\t" + products[i].getName() + "\t|\t"+ products[i].getUnitPrice() 
				+"\t|\t"+quantities[i]+"\t|\t"+this.calcualteSubtotal(i));
		}	
		System.out.println("Total is : "+ this.getTotal());
		System.out.println("-----------------------------------------------------------------------------");
	}
}

class BillS1{
	public static void main(String args[]){
		Product pr1=new Product("p001","Apple",50.00);
		Product pr2=new Product("p002","Orange",60.00);
		Product pr3=new Product("p003","Banana",10.00);


		Bill billObj1=new Bill("001","kumar");
		billObj1.purachaseProduct(pr1,2);
		billObj1.purachaseProduct(pr2,3);
		billObj1.printBill();

		Bill billObj2=new Bill("002","ravi");
		billObj2.purachaseProduct(pr3,10);
		billObj2.purachaseProduct(pr2,3);
		billObj2.purachaseProduct(pr1,2);
		billObj2.printBill();
		
	}
}
