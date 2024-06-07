package codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class ProblemGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//planning to hold m rounds
		//each round holds a,b, c,d,e,f,g
		//count their frequency and then substract all the frequency with the number of rounds
		try(Scanner in = new Scanner(System.in);){
			int testCase = in.nextInt();
			while(testCase>0) {
				int n =in.nextInt();
				int m = in.nextInt();
				String str = in.next();
				HashMap<Character, Integer> map  = new HashMap<>();
				for(char ch='A';ch<='G';ch++) {
					map.put(ch,0);
				}
				
				for (char ch : str.toCharArray()) {
		            if (map.containsKey(ch)) {
		                map.put(ch, map.get(ch) + 1);
		            }
		        }
				
				int count = 0;
				//if 0 count them else add them if less then 0
				 for (char ch = 'A'; ch <= 'G'; ch++) {
	                    int required = m - map.get(ch);
	                    if (required > 0) {
	                        count += required;
	                    }
	                }
				System.out.println(count);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
