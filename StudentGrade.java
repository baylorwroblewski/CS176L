
public class StudentGrade {
	final int DEFAULTGRADE = 60;
	final int MAXIMUMGRADE = 100;
	final int MINIMUMGRADE = 0;
	final int AGRADE = 90;
	final int BGRADE = 80;
	final int CGRADE = 70;
	public int grade;
	public String name;
	
	public StudentGrade(String name) {
		this.name = name;
		this.grade = DEFAULTGRADE;
		
	}
	public StudentGrade(String name, int grade) {
		this.name = name;
		setGrade(grade);
		
	}
	public void setGrade(int grade) {
		if (grade > MINIMUMGRADE && grade < MAXIMUMGRADE) {
			this.grade = grade;
		}else {
			this.grade = DEFAULTGRADE;
		}
	}
	public int getGrade() {
		return grade;
	}
	public String retGradeLevel() {
		if (grade >= AGRADE) {
			return "A";
		}else if (grade >= BGRADE) {
			return "B";
		}else if (grade >= CGRADE) {
			return "C";
		}else {
			return "D";
		}
	}
	
	public static void main(String[] args) {
		StudentGrade Baylor = new StudentGrade("Baylor");
		StudentGrade Liv = new StudentGrade("Liv", 99);
		System.out.println(Baylor.getGrade());
		System.out.println(Liv.getGrade());
		
		Baylor.setGrade(-100);
		System.out.println(Baylor.getGrade());
		Baylor.setGrade(1000);
		System.out.println(Baylor.getGrade());
		Baylor.setGrade(88);
		System.out.println(Baylor.getGrade());
		
		System.out.println(Liv.retGradeLevel());
		System.out.println(Baylor.retGradeLevel());
		Baylor.setGrade(77);
		System.out.println(Baylor.retGradeLevel());
		Baylor.setGrade(54);
		System.out.println(Baylor.retGradeLevel());



	}
	
}

