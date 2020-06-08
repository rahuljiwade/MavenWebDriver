package Sample.com.TestGit;

import java.util.Arrays;

import org.testng.annotations.Test;
/*
 * input-->> String s="01/06/2020";
 * output-->>01
 *           06
 *           2020
 * 
 */

public class Test1 {
	
	
	@Test
	public void test() {
		System.out.println("This is the test method of Test1 class");
		
		String s="01/06/2020";
		
		//First method
		String[] st=s.split("/");
		
		for(String s1:st) {
			System.out.println(s1);
		}
		
		//Second method
		Arrays.asList(s.split("/")).stream().forEach(System.out::println);
		
	}
	
	@Test
	public void test1(){
		
		System.out.println("This is test1 method");
	}

}
