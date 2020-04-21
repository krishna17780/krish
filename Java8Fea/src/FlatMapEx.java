import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] data = new String[][] { { "a", "b" }, { "c", "d" } };
		Stream<String> stream=Arrays.stream(data).flatMap(x->Arrays.stream(x)).filter(x->"a".equalsIgnoreCase(x.toString()));
		
	System.out.println(stream);
	}

}
