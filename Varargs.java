
public class Varargs {

	public static void main(String[] args) {
		int result = add("Ram", 2,3,4,5,6,7);
		System.out.println(result);
		

	}
	static int sum=0;
	
	/*static int add(int...a) {
		for (int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}

		return sum;
		
	}*/
	
	static char[] name = null;
	static int add(String name, int...a) {
		for (int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(name);
		return sum;
		
	}

}
