package com.codewr.user;

public class UserSaveException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public UserSaveException(){}
	
	public UserSaveException(String message){
		super(message);
	}
	
}