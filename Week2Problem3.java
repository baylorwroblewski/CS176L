package cs176;

class University {
	public String universityName;
	public int totalEnrollment;
	
	
	public University (String name){
		universityName = name;
	}
	public String getUniversity() {
		return universityName;
	}
	
	public int addTotalEnrollment(int enrollment) {
		return totalEnrollment += enrollment;
	}
	
}


public class Week2Problem3 {

	public static void main(String[] args) {
		University Monmouth = new University ("Monmouth");
		System.out.println("University Name: "+ Monmouth.getUniversity());
		System.out.println("Enrollment Size: "+ Monmouth.addTotalEnrollment(1000));
		
		

	}

}
