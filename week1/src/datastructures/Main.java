package datastructures;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 13;

		for (int i = 0; i <= 5; i++) {
			System.out.println("a + b = " + (a + b - i));
		}

		if (a < b) {
			System.out.println("a is smaller.");
		} else {
			System.out.println("b is smaller.");
		}
		
		int i = 0;
		
		/*while(i < 10){
			System.out.print("i = " + i);
			i++;
		}
		
		do {
			System.out.println(i);
			i--;
			
		} while(false);
		 */
		
		int [] c = {1, 3};
		System.out.println(c[0]);
		
	}

}
