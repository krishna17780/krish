import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class groupbyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list=Arrays.asList("app","apple","apple","banana","apple","banana");
Map<String, Long> result=list.stream().sorted().collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()));
System.out.println(result);
 result.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).forEachOrdered(e->);
	}

}
