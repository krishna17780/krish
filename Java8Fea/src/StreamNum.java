import java.util.stream.IntStream;

public class StreamNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[ ] num = {4,6,7,83,3,88,8,3};
 IntStream.of(num).distinct().sorted().limit(3).forEach(System.out::println);
	}

}
