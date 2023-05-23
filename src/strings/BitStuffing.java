package strings;

public class BitStuffing {
	
	public static void bitManipulation(String S, String X, char c) {
		int patternLength= X.length();
		int j= 0;
		String t = " ";
		for(int i= 0; i<S.length()-patternLength; i++) {
			t += S.charAt(i);
			boolean g= false;
			System.out.println("j is " + X.charAt(j));
			System.out.println("i is " + S.charAt(i));
			if(S.charAt(i) == X.charAt(j)) {
				if(S.substring(i, i+3).equals(X)) {
					g= true;
				}
				
			}
		}
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		String abc= "011100111010111";
		String xyz= "111";
		bitManipulation(abc, xyz, 'c');
	}

}
