//Here, We will try to mimick the work of 'this' keyword

class Box{
	double width;
	double height;
	double depth;
	
	//Box this1;
	
	//This is the constructor for Box using 'this' keyword
    Box(double width, double height, double depth, Box this1){
		this1.width = width;
		this1.height = height;
	    this1.depth = depth;
	}

	//compute and return volume of a Box
	double volume(){
		return width*height*depth;
	}
}

class MimickingThisKeyword{
	public static void main(String args[]){
		Box this1;
		
		Box myBox1;
		this1=myBox1;
		myBox1=new Box(10, 20, 15, this1);
		
		Box myBox2;
		this1=myBox2;
		myBox2 = new Box(3, 6, 9, this1);
		
		double vol;
		
		//get volume of first Box
		vol=myBox1.volume();
		System.out.println("Volume is " + vol);
		
		//get volume of second Box
		vol=myBox2.volume();
		System.out.println("Volume is " + vol);
	}
}