import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> lines=Arrays.asList("spring","hibernate","node", "mkyong","hibernate","node");
      lines.stream().filter(line->!"node".equals(line)).collect(Collectors.toList()).forEach(System.out::println);
	}

}
