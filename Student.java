
public class Student {
	private String name;
	

	public Student(String name) {
		super();
		this.name = name;
	}


	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		for(int i=0; i<10; i++) {
			Student student = new Student("Ram "+ i);
			students[i]=student;
			System.out.println(student);
		}
	}
}
