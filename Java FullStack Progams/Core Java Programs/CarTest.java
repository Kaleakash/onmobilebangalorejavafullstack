class Car {
	int wheel;
	String color;
	float price;
	void start() {
		int temp=0;
		System.out.println(wheel);
		System.out.println(color);
		System.out.println(temp);
	}
	void stop() {
		String msg="Welcome";
		System.out.println(wheel);
		System.out.println(color);
		System.out.println(msg);
	}
}
class CarTest {
	public static void main(String args[]) {
	Car santro = new Car();
	santro.start();		santro.stop();
	}
}


