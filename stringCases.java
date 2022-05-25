package stringassignment;

public class stringCases {
	public static void main(String[] args) {
		
		 String str = "Java String refers to collection of Strings which are stored in heap memory";
		String s1 = str.toLowerCase();
		System.out.println("str after lower case is:"+str);
		System.out.println("s1 is: "+s1);
		
		
		String s2 = str.toUpperCase();
		System.out.println("str after upper case is:"+str);
		System.out.println("s1 is:"+s2);
		
		String s3 = str.replace('a', '$');
		System.out.println("str is:"+s3);
		
		if(str.contains("collection")){
			System.out.println("Jim is in the string");
			
			String str1 = "java String refers to collection of Strings which are stored in heap memory";
		if(str.equals(str1)){
			System.out.println("str is equal to str1");
			}
		else{
			System.out.println("str is not equal to str1");
			}
		{	
		if(str==str1){
			System.out.println("str is equal to str1");
			}
			else{
			System.out.println("str is not equal to str1");
			}	
		}
		}
	}
}
	

	
	
