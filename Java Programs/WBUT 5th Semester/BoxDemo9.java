//Here, Box uses a parameterized constructor to initialize the dimensions of  a box

class Box{
	double width;
	double height;
	double depth;
	
	//This is the constructor for Box
    Box(double w, double h, double d){
		width = w;
		height = h;
	    depth = d;
	}
	
	protected void finalize(){
		System.out.println("finalize() is called");
	}
	
	//compute and return volume of a box
	double volume(){
		return width*height*depth;
	}
}

class BoxDemo9{
	int x=2;
	public static void main(String args[]){
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box(3, 6, 9);
		double vol;
		
		//get volume of first box
		vol=mybox1.volume();
		System.out.println("Volume is " + vol);
		
		//get volume of second box
		vol=mybox2.volume();
		System.out.println("Volume is " + vol);
		
		BoxDemo9 obj=new BoxDemo9();
		obj.outofscopenow();
	}
	
	void outofscopenow(){
		outofscope2();
		System.out.println("Out of Scope Now");
	}
	
	void outofscope2(){
		this.x=5;
		System.out.println("Value of x is "+x);
		System.out.println("Yeah !! Done that...Called a method without creating an object");
	}
}