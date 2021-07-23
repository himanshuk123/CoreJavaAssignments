package com.Himanshu.ProblemPractice;
class InvalidCodeException extends Exception{  
	 InvalidCodeException(String s){  
	  super(s);  
	 }  
}
class Repository{
	static String getCountryName(String countryCode) throws InvalidCodeException{ 
		String country = null;

		int cc=Integer.parseInt(countryCode);
		if(cc>=70 && cc<=99)
			country="India";

		else if(cc==908)
			country="US";
 
		else if(countryCode.equals("011"))
			country="Dial somewhere outside of USA";

		else
		{
			try{
				throw new InvalidCodeException("Enter a validcode");
			}
			catch(InvalidCodeException e){
				country="No country with given code";
			}
				
		}	
		return country;
 }	
}

public  class CustomException {
	
	public static void main(String[] args) throws InvalidCodeException {
		Repository r=new Repository();
		System.out.println(r.getCountryName("78"));
		System.out.println(r.getCountryName("011"));
		System.out.println(r.getCountryName("678"));
	
	}
}


