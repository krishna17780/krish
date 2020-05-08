import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterFindany {
public static void main(String[] args) {
	List<Person> persons=Arrays.asList(new Person("krishna", 28),
			new Person("hari", 20),
			new Person("sai", 22),
			new Person("ravi", 30)
			);
	/*
	 * Person
	 * res=persons.stream().filter(per->"sai".equals(per.getName())).findAny().
	 * orElse(null); System.out.println(res);
	 */
persons.stream().map(Person::getName).collect(Collectors.toList()).forEach(System.out::println);
}
}
