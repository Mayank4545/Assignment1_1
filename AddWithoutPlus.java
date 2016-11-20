

// Sum of two integers without using + operator
public class AddWithoutPlus {
public static void main(String[] args) {
	
	int a = 10;
	int b = 20;
	int c = Math.addExact(a, b);
	
	System.out.println("Sum is : " + c);
}
}