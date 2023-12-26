package students;

public class Subject {
	
	private String name;
	private String course_code;
	
	public Subject(String name, String course_code) throws Exception {
		
		if(!subjectOk(name,course_code))
			throw new Exception("Subject must have both name and course code:");
		this.name=name;
		this.course_code=course_code;
	
	}
	
	public String getName() {
		return name;
	}
	
	public String getcourse_code() {
		return course_code;
	}
	
	public void setName(String name) throws Exception {
		if(!subjectOk(name,course_code))
			throw new Exception("Subject must have a name:");
		this.name=name;
		
	}
	
	public String toString() {
		return name;
	}
	
	public static boolean subjectOk(String name, String course_code) {
		return name!=null && name.length()>0 && course_code!=null && name.length()>0;
	}

}
