import java.util.Scanner;
class Demo {
	public static void main(String args[]){
	Scanner obj = new Scanner(System.in);
	System.out.println("How many record do you wan to store?");
	int n = obj.nextInt();
	int id[]=new int[n];
	String name[]=new String[n];
	float salary[]=new float[n];
	System.out.println("Enter the records one by one");
	//Receive the values 
	for(int i=0;i<n;i++) {
	System.out.println("Enter the id");
	id[i]=obj.nextInt();
	obj.nextLine();	//use to hold the enter key
	System.out.println("Enter the name");
		name[i]=obj.nextLine();
	System.out.println("Enter the salary");
	salary[i]=obj.nextFloat();
	}
	//Business logic 
	for(int i=0;i<n;i++) {
		float hra, da,pf;
		hra = salary[i]*0.10f;
		da = salary[i]*0.05f;
		pf = salary[i]*0.07f;
	salary[i]=salary[i]+hra +da -pf;		
	}		
	//Display Records;
	for(int i=0;i<n;i++) {
System.out.println("id is"+id[i]+" Name is"+name[i]+" Salary is"+salary[i]);		}
	}
}