package InterviewProgram;

public class StringToCharJava {

	public static void main(String[] args) {
		String str = "journaldev";
		
		//string to char array
		char[] chars = str.toCharArray();
		System.out.println(chars.length);
		
		//char at specific index
		char c = str.charAt(2);
		System.out.println(c);
		
		//Copy string characters to char array
		char[] chars1 = new char[7];
		chars1[0]='d';
		String strd = new String(chars1);
		System.out.println("conversion : "+strd);
		
	}

}