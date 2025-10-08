package week2.Day2;

public class reverseOddWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] splitTest=test.split(" ");
		for(int i=0;i<splitTest.length;i++) {
			if(i%2!=0) {
				char[] charArray = splitTest[i].toCharArray();
				for (int c=charArray.length-1;c>=0;c--) {
					System.out.print(charArray[c]);
				}
			
				}
			
			else {
				System.out.print(splitTest[i]);
			}
			System.out.print(" ");	
		}
			}
		
		
	}


