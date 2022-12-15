import java.util.ArrayList;
class Student{
	private String name;
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}


public class test {

	public static void main(String[] args) {
		Student p1 = new Student("Sam");
		Student p2 = new Student("Tam");
		//Student[] Students = new Student[2];
		Student[] Students = {p1, p2};
		p1 = Students[1];
		Students[0] = p2;
		p2.setName("Jam");
		System.out.println(p1.getName());
		System.out.println(Students[Students.length - 1].getName().equals("Tam"));
		
		boolean[][] x = new boolean[3][];
		x[0] = new boolean[1]; 
		x[1] = new boolean[2];
		x[2] = new boolean[3];
		System.out.println("x[2][2] is " + x[2][2]);
		ArrayList<String> list = new ArrayList<String>();
		int len = list.size();
		list.add("test");
		int len1 = list.size();
		System.out.println(list.get(0) + "\t" + len + "\t" + len1);

	}

}
