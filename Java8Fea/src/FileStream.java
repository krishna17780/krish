import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileStream {

	public static void main(String[] args) {
		 List<String> numbers = Arrays.asList("1", "2", "A", "B", "C1D2E3");

	        List<String> collect = numbers.stream()
	                .map(x -> new Scanner(x)
	                        .map(m -> m.group())
	                        .collect(Collectors.toList())
	                )									 	// List<List<String>>
	                .flatMap(List::stream)					// List<String>
	                .collect(Collectors.toList());


	        collect.forEach(x -> System.out.println(x));

	    }
}
