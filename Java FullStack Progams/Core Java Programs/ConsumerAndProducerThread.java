class Put implements Runnable{
	Thread t;
	Work ww;
	Put(Work ww) {
	this.ww =ww;
	t = new Thread(this);
	t.start();
	}
	public void run() {
	int i=0;
	while(i<=10) {
		ww.put(i);
	i++;
	}	
	}
}
class Get implements Runnable{
	Thread t;
	Work ww;
	Get(Work ww) {
	this.ww = ww;
	t = new Thread(this);
	t.start();
	}
	public void run() {
	int i=0;
	while(i<=10) {
	ww.get();
	i++;
	}
	}
}
class Work {
	boolean result=false;
	int n;
	synchronized void get() { 
	if(!result) 
	try { 
	wait(); 
	} catch(InterruptedException e) { 
	System.out.println("InterruptedException caught"); 
	} 
	System.out.println("Got: " + n); 
	result = false; 
	notify(); 
	} 
	
	synchronized void put(int n) { 
	if(result) 
	try { 
		wait(); 
	} catch(InterruptedException e) { 
	System.out.println("InterruptedException caught"); 
	} 
	this.n = n; 
	result = true; 
	System.out.println("Put: " + n); 
	notify(); 
	} 

}

class ConsumerAndProducerThread {
	public static void main(String args[]) {
	Work ww = new Work();
	Put pp = new Put(ww);
	Get gg = new Get(ww);
	}
}


