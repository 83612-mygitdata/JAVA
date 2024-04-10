package com.sunbeam.excep;

public class ExceptionLineTooLong extends Exception
{
	private String message;
	private int len;
	

	public ExceptionLineTooLong() {
		message="";
		len=0;
	}



	public ExceptionLineTooLong(String message,int len) {
		this.message = message;
		this.len=len;
	}



	@Override
	public String toString() {
		return "ExceptionLineTooLong [message=" + message + "]";
	}
	
	

}
