import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamReductionCollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> stdlist= Arrays.asList(new Student("krishna", 28,15000),
				new Student("hari", 18,178825),
				new Student("priyanka", 45,15481),
				new Student("jj", 23,785599),
	            new Student("ravi", 19,1559),
				new Student("krishna", 45,15481),

		        new Student("kanth", 28,178825));	
		
		/*
		 * stdlist.stream().map(Student::getName).collect(Collectors.toList()).forEach(
		 * System.out::println);
		 * 
		 * System.out.println("----------------------"); String collect=
		 * stdlist.stream().map(Student::getName).sorted().collect(Collectors.joining(
		 * ",", "[","]")); System.out.println(collect);
		 * System.out.println("----------------------");
		 * 
		 * Double collect2=
		 * stdlist.stream().collect(Collectors.averagingDouble(Student::getPrice));
		 * System.out.println(collect2);
		 */
		
		   IntSummaryStatistics stdsum=  stdlist.stream().collect(Collectors.summarizingInt(Student::getPrice));
		     
		   System.out.println(stdsum);
		   
		Map<Integer, List<Student>>  collect5 =stdlist.stream().collect(Collectors.groupingBy(Student::getPrice));
		   collect5.forEach((k,v)->{
			   System.out.println(k);
			   System.out.println(v);
		   });
		   
		   System.out.println("-------------------");
		   Map<Boolean, List<Student>>  collect6 =stdlist.stream().collect(Collectors.partitioningBy(p->p.getPrice()>15485));
		   collect6.forEach((k,v)->{
			   System.out.println(k);
			   System.out.println(v);
		   });
		   
		}

}
