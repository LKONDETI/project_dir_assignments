package stringassignment;

public class stringBufferAssignment {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("StringBuffer ");
		sb.append("is a peer class of String ");
		 
		sb.insert(39,"the functionality of the strings.");
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("It is used to _ at the specified index position.");
		sb.replace(14,15,"insert text");
		System.out.println(sb1);
		
		StringBuffer sb3=new StringBuffer("This method returns the reversed object on which it was called.");
		
		sb.reverse();
		System.out.println(sb);
		
		sb3.reverse();
		System.out.println(sb3);


	}

}
