import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class StreamDemo {
	public static void main(String args[]) {
	List<String> ll = new ArrayList<>();
	ll.add("Ravi");ll.add("Ramesh"); ll.add("Balaji"); ll.add("Seeta"); ll.add("Meeta");
	ll.stream().map(data->data.toUpperCase()).forEach(System.out::println);
	System.out.println(ll);
	ll.stream().filter(data->data.contains("ee")).map(data->data.toUpperCase()).forEach(System.out::println);

	System.out.println("Separate Stream Reference");
	Stream<String> ss1 = ll.stream();
	Stream<String> ss2 = ss1.filter(data->data.contains("ee"));
	Stream<String> ss3 = ss2.map(data->data.toUpperCase());
	ss3.forEach(System.out::println);
	}
}