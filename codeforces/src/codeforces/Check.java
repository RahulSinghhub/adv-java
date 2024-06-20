package codeforces;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] f1 = new int[260];
		int [] f2 = new int[260];
		String a= new String("anagram");
		String b= new String("margana");
		for(char c : a.toCharArray())
			if(Character.isLetter(c))
				f1[c]++;
		for(char c : b.toCharArray())
			if(Character.isLetter(c))
				f2[c]++;
		 for (int i = 0; i < f1.length; i++) {
	               if(f1[i]>0) {
	                System.out.print((char) i + ": " + f1[i]+" ----");}
	            }
		 System.out.println();
		 for (int i = 0; i < f2.length; i++) {
             if(f2[i]>0) {
              System.out.print((char) i + ": " + f2[i]+" ----");}
		 }
		 System.out.println(f1.equals(f2));
		 
	}

}
