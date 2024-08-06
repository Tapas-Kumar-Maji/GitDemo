package Tutorial;
// Sourabh's tutorial.

public class StudentCal {

	public static void main(String[] args) {
		Student student1 = new Student("Tapas", "8a", "23");
		Student student2 = new Student("Tapas", "8a", "23");
		System.out.println(student1.equals(student2));
		
	}
	
	static class Student{
		String name;
		String className;
		String rollNo;
		
		public Student(String name, String className, String rollNo) {
			super();
			this.name = name;
			this.className = className;
			this.rollNo = rollNo;
		}
		
		public boolean equals(Student obj) {
			if(this.name.equals(obj.name) && this.className.equals(obj.className) && this.rollNo.equals(obj.rollNo))
				return true;
			return false;
			
			
		}
		
		
		
	}
}
