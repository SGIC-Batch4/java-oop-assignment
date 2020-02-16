class Person{
	private String name;
	private Integer age;
	private Boolean marriedStatus;
	private String address;

	public Person(){}

	public Person(String name,Integer age){
		this.name=name;
		this.age=age;
	}
	
	public Person(String name,Integer age,Boolean marriedStatus,String address){
		this.name=name;
		this.age=age;
		this.marriedStatus=marriedStatus;
		this.address=address;
	}
	
	public boolean checkVoteEligibilty(){
		if(this.age>=18){
			return true;
		}
		return false;
	}

	public void setName(String name){
		this.name=name;
	}
	public void setAge(Integer age){
		this.age=age;
	}
	public void setMarriedStatus(Boolean marriedStatus){
		this.marriedStatus=marriedStatus;
	}
	public void setAddress(String address){
		this.address=address;
	}

	public String getName(){
		return this.name;
	}
	public Integer getAge(){
		return this.age;
	}
	public Boolean getMarriedStatus(){
		return this.marriedStatus;
	}
	public String getAddress(){
		return this.address;
	}


	
}

class DetailsM2{
	public static void main(String args[]){
		
		Person person1=new Person();
		person1.setName("Suresh");
		person1.setAge(38);
		person1.setMarriedStatus(true);
		person1.setAddress("12 , main street");

		Person person2=new Person("Kumar",15);
		person2.setMarriedStatus(false);
		person2.setAddress("14 , a9 street");

		Person person3=new Person("Sasi",27,true,"56 , ponit pedro road");
		
		// lets create person Array
		Person[] personArray=new Person[3];
		personArray[0]=person1;
		personArray[1]=person2;
		personArray[2]=person3;

		// lets print it
		for(int i=0;i<personArray.length;i++){
		String voteStatus=personArray[i].checkVoteEligibilty() ? "YES":"NO";
			System.out.println(" | "+personArray[i].getName()+ "\t | \t"+personArray[i].getAge()+"\t | \t"+personArray[i].getMarriedStatus()
			+"\t | \t"+personArray[i].getAddress()+"\t | \t"+voteStatus);
		}

	}
}
