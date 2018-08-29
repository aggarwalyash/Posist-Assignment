package myPackage;                                   // main package
import myPackage.Node;                               // importing Node class

public class NodeCheck(){

	private static int id = 0;
	
	public NodeCheck(){
	}

	HashMap<String,Node> hMap;

	public void addData(String d1,Node d2){
		id += 1;		
		hMap.put(d1,d2);
	}

	public Integer getNumberOfData(){
		return hMap.size();
}

}
