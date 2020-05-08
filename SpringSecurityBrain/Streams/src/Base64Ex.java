import java.util.Base64;

public class Base64Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String textDate = " hari priyanks krishna kanth gona";

		String encodeTest = Base64.getEncoder().encodeToString(textDate.getBytes());
		System.out.println(encodeTest);

		byte[] decodeTest = Base64.getDecoder().decode(encodeTest);
		String decodetext = new String(decodeTest);

		System.out.println(decodetext);
		
		
		String encodeTest1 = Base64.getMimeEncoder().encodeToString(textDate.getBytes());
		System.out.println(encodeTest1);


	}
     
	
}
