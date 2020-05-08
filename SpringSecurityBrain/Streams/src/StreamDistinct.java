import java.util.ArrayList;
import java.util.List;

public class StreamDistinct {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("bk");
        list.add("ck");
		list.add("dk");
        list.add("auuk");
        list.add("akr");
        list.add("akr");
        list.add("akrrry");
        list.add("akkhu");
         System.out.println(list.stream().distinct().count());
         
         list.stream().allMatch(a->a.contains("ak"));
         
	}

}
