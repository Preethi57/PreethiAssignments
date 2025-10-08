package week2.Day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		int x = 0;
		String[] splitText = text.split(" ");
		System.out.println(splitText);
	
		for (int i =0; i < splitText.length; i++) {
		for (int k=i+1; k<splitText.length; k++) {
			if (splitText[i].equalsIgnoreCase(splitText[k])) {
				splitText[k]=" ";
				x+=1;
		}
		
	}
	}
		if (x>0) {
			
			for(int i=0;i<splitText.length;i++) {
				String word = splitText[i];
				System.out.print(word);
				System.out.print(" ");	
		}
			
}
	}

}
