

interface wish{
	void greet();
}
class happy implements wish {
	public void greet() {
	System.out.println("Hello Viewers");
	}
}
public class Test {

	public static void main(String[] args) {
		
		wish w = new happy();
		w.greet();
		
		
		wish w1  = () ->{
			System.out.println("Welcome");
		};
		w1.greet();

	}

}
