class Rosource {
	public void put(int i){

	}
	public int get() {
		return 0;
	}
}
class Put implements Runnable {
	Rosource rr;
	Thread t;
	Put(Rosource rr) {
		this.rr = rr;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		rr.put(10);
	}
}
class Get implements Runnable {
	Rosource rr;
	Thread t;
	Get(Rosource rr) {
	this.rr = rr;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		rr.get();
	}
}
class ThreadDemo {
	public static void main(String args[])  {
	Rosource rr = new Rosource();
	Put pp = new Put(rr);
	Get gg = new Get(rr);
	}
}



