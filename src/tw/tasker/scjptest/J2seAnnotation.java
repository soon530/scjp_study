package tw.tasker.scjptest;

import static org.junit.Assert.*;

import org.junit.Test;

import tw.tasker.scjpstudy.Copyright;
import tw.tasker.scjpstudy.Dog;

public class J2seAnnotation {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	/**
	 * moving 強制 override
	 * move 告知不建議使用
	 */
	@Test 
	public void moveDog() {
		Dog dog = new Dog();
		dog.moving();
		dog.move();
	}
	
	@Test
	public void AnimalCopyright() throws ClassNotFoundException {
		Class animal = Class.forName("tw.tasker.scjpstudy.Animal");
		if (animal.isAnnotationPresent(Copyright.class)) {
			Copyright copyright = (Copyright) animal.getAnnotation(Copyright.class);
			System.out.println(copyright.value());
		}
	}

}
