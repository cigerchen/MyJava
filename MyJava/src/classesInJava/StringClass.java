package classesInJava;
//@link http://docs.oracle.com/javase/6/docs/api/java/lang/String.html
public class StringClass {
         static String str ="Hello";
         //strings are CONSTANT, which means they CAN'T be CHANGED after they are created
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(str);
         char data[]={'H','e','l','l','o'};
         String str2 = new String(data);
         System.out.println(str2);
	}

}
