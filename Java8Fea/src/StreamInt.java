import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamInt {
	public static void main(String[] args) {
		int[] stream1= IntStream.rangeClosed(1, 5).toArray();
		System.out.println(Arrays.toString(stream1));
		Stream<Integer> stream2=Stream.of(1,2,3,4,5);
		int[] result=stream2.mapToInt(x->x).toArray();
		System.out.println(Arrays.toString(result));
	}

}
