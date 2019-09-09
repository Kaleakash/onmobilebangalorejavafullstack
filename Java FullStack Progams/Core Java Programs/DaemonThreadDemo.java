class A implements Runnable {
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+"--"+i);
		}
	}
}
class DaemonThreadDemo {
	public static void main(String args[]) {
		A obj1 = new A();
		Thread t1 = new Thread(obj1,"First");
		Thread t2 = new Thread(obj1,"Second");
		Thread t3 = new Thread(obj1,"Third");
		t1.start();
			t2.setDaemon(true);
		t2.start();
		//t3.start();
	}
}