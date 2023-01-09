package org.except;

//import java.io.FileNotFoundException;

public class ThrowAndThrows {

/*	private void add() throws FileNotFoundException {
	
		throw new FileNotFoundException();
	}  */
	private void search() throws UserDefinedException {
		String id = "123";
		if (id.equals("127")) {
			System.out.println("ID :"+id);
		}
		else {
			try {
				throw new UserDefinedException();
			} 
			catch (UserDefinedException e)  // static class Exception
			{
				System.out.println("not equal");
				e.printStackTrace();
			}
			finally {
				System.out.println("finally block");
			}
			//throw new UserDefinedException();
		}	
	}

	
	public static void main(String[] args) throws UserDefinedException {
		
		ThrowAndThrows t = new ThrowAndThrows();
		//t.add();
		t.search();
	}
}
