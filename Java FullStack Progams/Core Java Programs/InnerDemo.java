class InnerDemo{
	public static void main(String args[]) {
	Runnable r = new Runnable(){
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("i "+i);
			}
		}
	};
	
	Thread t1 = new Thread(r);
	t1.start();
	Thread t2 = new Thread(r);
	t2.start();
	Thread t3 = new Thread(r);
	t3.start();
	}
}