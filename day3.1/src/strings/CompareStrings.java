package strings;

import java.util.Arrays;

public class CompareStrings {

	public static void main(String[] args) {
		String[] names= {"Anish","Rutva","Amiti","Rutuj","Mihir","Amiti","anish"};//5 literal strings
		
		System.out.println(names[0].compareTo(names[1]));//  <0
		System.out.println(names[2].compareTo(names[0]));// <0 
		System.out.println(names[1].compareTo(names[3]));// > 0
		System.out.println(names[2].compareTo(names[5])); //0
		System.out.println(names[1].compareTo(names[6]));
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);//calling Strign class compareTo method
		System.out.println(Arrays.toString(names));
		boolean flag=false;
		for (String s:names){
			if(s.contains("Rutuj")) {
				System.out.println("Yes");
				break;
			}
			
		}
		if(flag) {
			System.out.println("yes");
			else {
				System.out.println("no");}
		}	

	}

}
