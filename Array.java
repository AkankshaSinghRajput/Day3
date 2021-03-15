
public class Array {
	
	public static void main(String[] args) {	
		int[] number= {1, 2, 3, 4};
		
		for(int i=0; i< number.length; i++) {
			System.out.println(number[i]);
		}
		
		boolean[] bool= {true, false};
		for(boolean value: bool) {
			System.out.println(value);
		}
		
		String[] names = new String[10];
		for(String name: names) {
			name="Ram";
			System.out.println(name);
		}
	}
}
