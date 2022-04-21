import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumberAndString {

	public static void main(String[] args) {
		
		//Approach - Random Class
		
		Random random = new Random();
		int ran_int = random.nextInt(100); //0-99
		System.out.println("1234"+ran_int);
		
		double ran_double = random.nextDouble();
		System.out.println(ran_double);
		
		//Approach - Math Class
		System.out.println(Math.random());
		
		//Approach - Apache commans-long API
//		https://commons.apache.org/proper/commons-lang/download_lang.cgi
	
		String randnum = RandomStringUtils.randomNumeric(5);
		System.out.println(randnum);
 
		String ranString =RandomStringUtils.randomAlphabetic(5);
		System.out.println(ranString);
	}

}
