package library;

public class Library {

	public static void main(String[] args) {
		try {
			publisher publisher1=new publisher("112233","chodu modu kodu");
			System.out.println(publisher1.getId());
			System.out.println(publisher1.getName());
			publisher1.setName("Sir valo hoye jan:");
			System.out.println(publisher1);
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
