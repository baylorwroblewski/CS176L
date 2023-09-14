package cs176;
//Implement a class Student, a student has a name, a total quiz score. Supply the methods
//getName(), addQuiz(int score), getTotalScore(), getAverageScore().
//Hint: for average, you need to store the number of quiz takes.
//Please create an instance of student with your name and input 5 quiz scores.
//Print the total score, your name and average score
class Student {
	
	public String studentName;
	public int totalScore = 0;
	public int score;
	public int quizzesTaken = 0;
	public int average;
	
	
	public Student (String name){
		studentName = name;
	}
	
	public String getName() {
		return studentName;
	}
	
	public int getScore(){
		return score;
	}
	
	public void addQuiz(int score) {
		totalScore = totalScore + score;
		quizzesTaken = quizzesTaken+1;
	}
	
	public int getTotalScore() {
		return totalScore;
	}
	public void average() {
		average = totalScore/quizzesTaken;
	}
	public int getAverage() {
		return average;
	}

}

public class Week2Problem2 {

	public static void main(String[] args) {
		Student Jane = new Student("Jane");
		Jane.addQuiz(95);
		Jane.addQuiz(67);
		Jane.addQuiz(88);
		Jane.addQuiz(97);
		Jane.addQuiz(87);
		Jane.average();
		System.out.println("Student Name: "+Jane.getName());
		System.out.println("Total Score: "+Jane.getTotalScore());
		System.out.println("Average Score: "+Jane.getAverage());
		

	}

}
