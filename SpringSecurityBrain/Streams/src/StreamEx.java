import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {

		List<String> arr = Arrays.asList("aa", "bb", "dd");
		arr.stream().forEach(System.out::println);

		Stream<String> str = Stream.of("a", "b", "c");
		str.forEach(System.out::println);

	}
}
