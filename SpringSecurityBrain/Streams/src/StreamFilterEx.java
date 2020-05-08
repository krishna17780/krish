import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("krishna", 28,15000));
		list.add(new Student("hari", 18,178825));
		list.add(new Student("priyanka", 45,15481));
		list.add(new Student("jj", 23,687458));
		list.add(new Student("ravi", 19,69745));
		list.add(new Student("kanth", 28,785599));

		list.stream().filter(e->e.getName().contains("k")).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("---------------------------------");
		
		list.stream().filter(e->e.getName().contains("k")).collect(Collectors.toList()).forEach(System.out::println);

	}

}
