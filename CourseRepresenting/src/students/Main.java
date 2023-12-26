package students;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Subject subject=new Subject("OOP","CSE313");
			System.out.println(subject);
			System.out.println(subject.getcourse_code());
			subject.setName("Object Oriented Programming");
			System.out.println(subject);
			
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
