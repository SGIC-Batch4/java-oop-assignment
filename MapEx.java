import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

class TermResult{
	private Integer mathsMarks;
	private Integer physicsMarks;
	private Integer chemistryMarks;

	ALResult(Integer mathsMarks, Integer physicsMarks,Integer chemistryMarks){
		this.mathsMarks=mathsMarks;
		this.physicsMarks=physicsMarks;
		this.chemistryMarks=chemistryMarks;
	}
	public Integer getTotal(){
		return this.mathsMarks+this.physicsMarks+this.chemistryMarks;
	}

	public String toString(){
		return "maths : "+this.mathsMarks+" physics : "+this.physicsMarks+"chemistry : "+this.chemistryMarks;
	}
}

class MapEx{
	public static void main(String args[]){
		HashMap<String,Map<String,TermResult>> stuMap=new HashMap<String,Map<String,TermResult>>();


		Map<String,TermResult> termlistS1=new ArrayList<String,TermResult>();
		termlistS1.put("Term1",new TermResult(78,56,46));
		termlistS1.put("Term2",new TermResult(23,56,46));
		termlistS1.put("Term3",new TermResult(78,76,46));

		stuMap.put("S001",termlistS1);
		
		

		System.out.println(stuMap);



		
	}
}
