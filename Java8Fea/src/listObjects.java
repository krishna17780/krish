import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listObjects {
	public static void main(String[] args) {
		// how to convert a list of staff objects into a list of StaffPublic objects.
		List<Staff> staff= Arrays.asList(new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );
		List<staffPublic> result  =staff.stream().map(temp->{
			staffPublic obj=new staffPublic();
			obj.setName(temp.getName());
			obj.setAge(temp.getAge());
			return obj;
		}).collect(Collectors.toList());
		System.out.println(result);
	}

}
