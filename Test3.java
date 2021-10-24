import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(0);
		al.add(10);
		al.add(50);
		al.add(14);
		al.add(30);
			
		System.out.println(al);
		System.out.println("By using the Stream API");{
		al.stream()
		.map(i -> i*2)
		.forEach(System.out::println);
		}
		
		al.stream()
		.filter(i -> i %2 == 0)
		.forEach(System.out::println);
		
			

	}

}
