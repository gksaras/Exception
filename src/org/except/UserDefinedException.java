package org.except;

// Throwable - super class
// It contains method getMessage() 
// getMessage() - should be Overrided when Userdefined class inherited by Throwable predefined class
// UserDefinedException - class name,message
public class UserDefinedException extends Throwable {

	@Override
	public String getMessage() {
		String msg = "UserDefinedException";
		return msg;
	}
	
}
