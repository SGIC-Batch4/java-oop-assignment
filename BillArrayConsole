import java.util.Scanner;

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
	private Integer billno;
	private String customerName;
	private Product[] products=new Product[5];
	private Integer[] quantities=new Integer[5];

	private int productCounter=0;

	Bill(Integer billno,String customerName){
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

class BillArrayConsole{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		
		Product[] products=new Product[5];
		Bill[] bills = new Bill [5];
		int productCount=0;
		int billCount=0;
		

		while(true){
			System.out.println("----------------- MENU -------------------");
			System.out.println("1. Add New products to store");
			System.out.println("2. List Products in Store");
			System.out.println("3. Put new Bills");
			System.out.println("4. View Sales");
			System.out.println("5. To Exit");
			
			System.out.println("Please choose your option");
			int option=scanner.nextInt();
		
			switch(option){
				case 1:
					System.out.println("---------- Now u have to add product -----");
					System.out.print("please Enter product code : ");
					String productCode=scanner.next();
					System.out.print("please Enter product Name : ");
					String productName=scanner.next();
					System.out.print("please Enter product's Unit price : ");
					Double uprice=scanner.nextDouble();

					// Create new product
					Product productObj=new Product(productCode,productName,uprice);
					products[productCount]=productObj;
					productCount++;
					break;
				case 2:
					System.out.println("Id\t|\tName\t|\tUprice");
					System.out.println("-----------------------");
					for(int i=0;i<productCount;i++){
						System.out.println(products[i].getId()+"\t|\t"+products[i].getName()+"\t|\t"+products[i].getUnitPrice());
					}
					break;
                case 3:
					System.out.println("Id\t|\tName\t|\tUprice");
					System.out.println("-----------------------");
					for(int i=0;i<productCount;i++){
						System.out.println(products[i].getId()+"\t|\t"+products[i].getName()+"\t|\t"+products[i].getUnitPrice());
					}

                    System.out.println("----------------------Item Selection--------------------------");
					
					System.out.print("Enter Customer Name:");
					String customerName = scanner.next();
					
					boolean addItem=true;
					
					Bill billObj = new Bill(billCount, customerName);
					while(addItem){
						System.out.print("Enter the product's ID as shown in table above:");
				        String idChoice = scanner.next();

						Product product=null;
						for(int i=0;i<productCount;i++){
							if(products[i].getId().equals(idChoice)){
								product=products[i];
								break;
							}
						}
						if(product!=null){
								System.out.print("Enter the quantity:");
								int quantity = scanner.nextInt();
								billObj.purachaseProduct(product, quantity);
							}			
						System.out.print("want more item?(enter 1 for yes 0 for No");
						int want = scanner.nextInt();
						
						
						
						if(want==0){
							addItem = false;
						}
						
					}
					billObj.printBill();
					bills[billCount]=billObj;
					billCount++;

					break;

				case 4:
					for(int i=0;i<billCount;i++){
						bills[i].printBill();
					}
	
				case 5:
					System.exit(0);
			}
			
		}

		
	}
}
