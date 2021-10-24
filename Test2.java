interface Like{
	void happy();
}
public class Test2 {
		public static void Welcome(){
			System.out.println("Welcome Friends");
		}
		
		public static void main(String[] args) {
			
			System.out.println("Using Lambda Function");
			Like l1 = () -> System.out.println("Hiiiii");
			l1.happy();
			
			
			System.out.println("Using Method reference");
			Like l = Test2 ::Welcome;
			l.happy();
		}
}
