import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupbyCountSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
		Map<String, Long> map= items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		Map<String, Integer> map2= items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));

	}

	

}
