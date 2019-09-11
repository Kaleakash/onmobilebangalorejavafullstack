class A{}
class StringDemo {
	public static void  main(String args[]) throws Exception{
	Runtime rr = Runtime.getRuntime();
	/*A obj= null;
	for(int i=0;i<1000000;i++) {
	obj  =new A();
	}
	System.out.println(rr.freeMemory());
	System.out.println(rr.totalMemory());*/
	Process pp = rr.exec("calc");
		Thread.sleep(5000);
		pp.destroy();
	}
}