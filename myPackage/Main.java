package myPackage;                                   // main package
import java.util.*;
import java.lang.*;
import java.io.*;
import myPackage.Node;                               // Node
import myPackage.NodeCheck;                          // Contains every unique nodeId

class Main()
{

	public static void main (String[] args) throws java.lang.Exception
	{

		boolean check = true;
		//ArrayList<Node> records = new ArrayList<Node>();
		Integer n = 0;
		NodeCheck nCheck = new NodeCheck();
		Node node = new Node(); 
		Scanner scan = new Scanner(System.in);

		while(check){                                                 // check to exit from while loop

			System.out.println("Your menu is ready:- Select the appropriate option");
			System.out.println("1.) Create a Genesis node.");
			System.out.println("2.) Create a child node");
			System.out.println("3.) Get number of nodes.");
			System.out.println("4.) Decrypt a node.");
			n = scan.nextInt();

			switch(c){

				case 1: 
					String sName = scan.next();
					Double value = scan.nextDouble();
					node.value = value;
				        node.setTimeStamp(new Date());
					node.setOwnerName(sName);
					node.setReferenceNodeId(null);
					node.nodeId = Node.Number;
					Node.genesisReferenceNodeId = node.nodeId;
					node.setData();
					nCheck.addData(node.nodeId,node);
					break;


				case 2: 
					String sName = scan.next();
					Double value = scan.nextDouble();
					String parent = scan.next();
					node.value = value;
				        node.setTimeStamp(new Date());
					node.setOwnerName(sName);
					node.setReferenceNodeId(parent);
					node.nodeId = Node.Number;
					Node.genesisReferenceNodeId = node.nodeId;
					node.setData();
					nCheck.addData(node.nodeId,node); 
					break;

				case 3: 
					System.out.println(nCheck.getNumberOfData);
					break;
				case 4:
					System.out.println("Please enter the node id:");
					String n = scan.next();
					if(nCheck.containsKey(n)){
						System.out.println("Enter your name: ");
						String name = scan.next();
						Node data = nCheck.getKey(n);
						data.toString();
					}
					else{
						System.out.println("You entered a wrong nodeID.");
					}

					break;

				default: System.out.println("You entered a wrong choice. Press -1 to exit");
					 break;				
			}
			n = scan.nextInt();
			if(n==-1){
				check = false;
			}
		}
	}
}

