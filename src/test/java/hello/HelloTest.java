package hello;

import org.junit.Test;

import com.zwj.maven.Hello;

public class HelloTest {

	@Test
	public void test1() {
		Hello hello = new Hello();
		String string = hello.sayHello("Maven");
		System.out.println(string);
	}
}
