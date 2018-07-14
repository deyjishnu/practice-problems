//Demonstrate an inner class.
class Outer {
	int outer_x=100;
	
	void test() {
		for(int i=0;i<10;i++) {
		    class Inner {
		        void display() {
			    System.out.println("outer_x = "+outer_x);
	            }
	        }
	    Inner ob1=new Inner();
		ob1.display();
		}
	}
}
class InnerClassDemo2 {
	public static void main(String args[]) {
		Outer ob=new Outer();
		ob.test();
	}
}