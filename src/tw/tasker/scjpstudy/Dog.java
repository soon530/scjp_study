package tw.tasker.scjpstudy;

public class Dog extends Animal {

	/**
	 * 因為這裡有用annotation來強迫override，所以編輯就不給過.
	 */
	//@Override
	public void moving() {
		System.out.println("狗移動..");
	}
	
	@Deprecated
	public void move() {
		System.out.println("狗移動..");
	}

}
