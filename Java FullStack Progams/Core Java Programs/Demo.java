interface A {
	int add(int x, int y);
}
interface B {
	int sub(int x, int y);
}
class Server implements A,B{
	public int add(int x, int y){
		return x+y;
	}
	public int sub(int x, int y){
		return x-y;
	}
	public void ownMethod() {
		System.out.println("Server own method");
	}
}
class Demo {
	public static void main(String args[]){
	Server ss = new Server();
	ss.add(10,20);	ss.sub(20,10);	ss.ownMethod();
	A obj1 = new Server();	
	B obj2 = new Server();
	System.out.println(obj1.add(10,20));	
	System.out.println(obj2.sub(10,20));	
	}
}








