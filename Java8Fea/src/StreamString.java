import java.util.Arrays;

public class StreamString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String lines=" i love java 8 stream";
 String[] result=Arrays.stream(lines.split("\\s+")).map(String::toUpperCase).toArray(String[]::new);
	for (String string : result) {
		System.out.println(string);
	}
	}

}
