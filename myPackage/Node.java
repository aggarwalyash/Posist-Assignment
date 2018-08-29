package myPackage;                                   // main package
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Date;

public class Node
{
    private Date timeStamp;
    private String data;
    static public String genesisReferenceNodeId;
    private Double value;
    static Integer Number=0;
    private Integer nodeNumber;
    private String nodeId;
    private String ownerName;
    private String referenceNodeId;
    ArrayList<String> childReferenceNodeId;
    private String genesisReferenceNodeId;
    private String hashValue;
	
    public Node(){
	   Number += 1;
	   this.nodeNumber = Number;
    }
 	
    public String getData(){
	    return data;
    }
	
    public Integer getNodeNumber(){
	    return nodeNumber;
    }
	
    public String getNodeId(){
	    return nodeId;
    }
	
    public String getReferenceNodeId(){
	    return referenceNodeId;
    }
    
    public ArrayList<String> getChildReferenceNodeId(){
	    return childReferenceNodeId;
    }
    
    public void setData(){
        this.data = this.nodeId + Double.toString(this.value) + this.ownerName;
    }
    
    public void setNodeId(String id){
        this.nodeId = id;
    }

    public void setTimeStamp(Date d){
	this.timeStamp = d;
    }
    
    public void setReferenceNodeId(String id){
        this.referenceNodeId = id;
    }
    
    public void setHashValue(String value){
        this.hashValue = value;
    }
  
    public void setOwnerName(String name){
        this.ownerName = name;
    }
 
    public void decrypt(String n,Stringname){
	return toString();
    } 

    public void toString(){
	System.out.println("TimeStamp: " + this.timeStamp);	
	System.out.println("Data: " + this.data);
	System.out.println("GenesisReferenceID: " + this.genesisReferenceNodeId);	
	System.out.println("Node value: " + this.value);
	System.out.println("NodeID: " + this.nodeId);
	System.out.println("Owner name: " + this.ownerName);
	System.out.println("GenesisReferenceId: " + this.genesisReferenceNodeId);	
	System.out.println("HashValue: " + this.hashValue);
    }
}

