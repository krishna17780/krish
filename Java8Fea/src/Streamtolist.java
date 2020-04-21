import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamtolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);
       number.filter(x->x!=3).map(x->x+2).collect(Collectors.toList()).forEach(System.out::println);
	}

}
