package week2.Day2;

public class oddIndexToUppercase {

	public static void main(String[] args) {
		String test ="changeme";
		
		char[] charArray=test.toCharArray();
				for(int i=0;i<charArray.length;i++) {
					if(i%2!=0) {
						charArray[i]=Character.toUpperCase(charArray[i]);
						
					}
					String result=new String(charArray);
					System.out.println(result);
					
					
				}
		
	}

}
