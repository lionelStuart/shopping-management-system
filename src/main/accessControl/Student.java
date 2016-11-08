package accessControl;

public class Student {
	
	private String name;	
	private int score;
	public void showInfo(){
		System.out.println("student Info: name-"+name);
	}
		

	
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;	
		this.score=0;
	}
	protected void setScore (int score) {
		this.score=score;
	}
	
}

class PrimaryStudent extends Student{

	public PrimaryStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
