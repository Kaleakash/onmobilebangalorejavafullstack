import java.util.*;
import java.util.function.*;
class Demo implements Consumer<String>{
	public void accept(String s) {
		System.out.println(s);
	}
}
public class DemoTest {
	public static void main(String args[]) {
	List<String> ll =new ArrayList<>();
	ll.add("Ravi");ll.add("Raj");ll.add("Ramesh");ll.add("Rajesh");
	System.out.println("For each loop");
	for(String s:ll) {
		System.out.println(s);
	}
	System.out.println("Using Iterator");
	Iterator<String> i = ll.iterator();
	while(i.hasNext()) {
		String s = i.next();
		System.out.println(s);
	}
	System.out.println("using for each method without Lambda");
	ll.forEach(new Demo());
	
	System.out.println("using for each method with Lambda");
	ll.forEach(data->System.out.println(data));

	System.out.println("Using Method Reference");
	ll.forEach(System.out::println);
	}
}



