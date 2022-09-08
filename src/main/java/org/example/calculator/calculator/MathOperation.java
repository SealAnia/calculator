package org.example.calculator.calculator;

public enum MathOperation {
	
	APPLICATION("apply", ""),
	
	ADDITION("add", "+"),
	SUBSTRACTION("substract", "-"), 
	MULTIPLICATION("multiply", "*"),
	DIVISION("divide", "/"); 
	
	private String keyword;
	private String sign;
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	MathOperation(String keyword, String sign) {
		this.keyword = keyword;
		this.sign = sign;
	}
	
	@Override
    public String toString() {
		return keyword + " " + sign;
	}

}
