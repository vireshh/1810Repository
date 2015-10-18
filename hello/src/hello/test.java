package hello;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class test {

	
	public static void main(String [] args)
	{
		/*System.out.println("dev".compareTo("dev "));
		System.out.println(Float.parseFloat("12.2"));*/
		Set<String> set = new HashSet<String>();
		
		A a = new A();
				set.add("aa");
				set.add("bb");
				set.add("cc");
				set.add("dd");
				/*set.add(new A());*/
		System.out.println(set);
		System.out.println("this is the new method");
	}
}


class A
{
	int a = 12;
	String name = "vireshdev";
	
}