package com.sonata.Day4;

public class DuplicationIdException extends Exception {
	private static final long serialVersionUID = 1L;
	String s;
	DuplicationIdException(String s){
		this.s=s;
	}
	public String toString() {
		return s;
	}

}
