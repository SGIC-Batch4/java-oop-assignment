class Person{
	public String name;
	public Integer age;
	public Boolean marriedStatus;
	public String address;

	public boolean checkVoteEligibilty(){
		if(this.age>=18){
			return true;
		}
		return false;
	}
}

class DetailsM1{
	public static void main(String args[]){
		
		Person person1=new Person();
		person1.name="Suresh";
		person1.age=38;
		person1.marriedStatus=true;
		person1.address="12 , main street";

		Person person2=new Person();
		person2.name="Kumar";
		person2.age=15;
		person2.marriedStatus=false;
		person2.address="14 , a9 street";

		Person person3=new Person();
		person3.name="Sasi";
		person3.age=27;
		person3.marriedStatus=true;
		person3.address="56 , ponit pedro road";

		// lets create person Array
		Person[] personArray=new Person[3];
		personArray[0]=person1;
		personArray[1]=person2;
		personArray[2]=person3;

		// lets print it
		for(int i=0;i<personArray.length;i++){
		String voteStatus=personArray[i].checkVoteEligibilty() ? "YES":"NO";
			System.out.println(" | "+personArray[i].name+ "\t | \t"+personArray[i].age+"\t | \t"+personArray[i].marriedStatus
			+"\t | \t"+personArray[i].address+"\t | \t"+voteStatus);
		}

	}
}
