import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEx {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "krishna", "ravi","harsha");
		names.stream().filter(name->!name.equals("krishna")).forEach(System.out::println);
		names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
	}


class User{
	String name;
	String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void user(String name, String id) {
		
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", id=" + id + "]";
	}
}
}