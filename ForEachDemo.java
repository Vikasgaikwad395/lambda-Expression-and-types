import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachDemo {

		public static void main(String[] args) {
			
			ArrayList<Integer> al = new ArrayList<>();
			
			al.add(10);
			al.add(20);
			al.add(3);
			al.add(22);
			al.add(15);
			
			System.out.println("Using For Loop");
			for(Integer i : al) {
				System.out.println(i);
			}
			
			System.out.println("------------------------");
			System.out.println("Using the ForEach Method ");
			Consumer<Integer> count  = new Consumer<>() {
			public void accept(Integer i) {	
				System.out.println(i);
			}
			};
			al.forEach(count);
		}
}
				