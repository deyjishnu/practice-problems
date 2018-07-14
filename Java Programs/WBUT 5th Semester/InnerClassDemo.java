//Demonstrate an inner class.
class Outer {
	int outer_a=3;
	class Inner {
		int inner_a=5;
		void display() {
			System.out.println("outer_a = "+outer_a);
		}
	}
	void test() {
		//inner_a=1;
		Inner ob1=new Inner();
		ob1.display();
	}
}
class InnerClassDemo {
	public static void main(String args[]) {
		Outer ob=new Outer();
		ob.test();
	}
}