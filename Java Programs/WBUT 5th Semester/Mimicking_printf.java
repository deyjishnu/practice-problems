class Mimicking_printf {//not done
    static void printff(String s, String ... v) {
		String t;
		int c=-1;
		for(int i=0 ; i<s.length()-1 ; i=i+2) {
			t=s.substring(i,i+2);
			switch(t) {
				
				case "\n":
				    System.out.println();
					break;
					
				case "%d":
				    c++;
					try {
		                int x=Integer.parseInt(v[c]);
	                }
		            catch(Exception e) {
			            System.out.println("Error occured");
						System.exit(0);
		            }
					System.out.print(v[c]);
					break;
					
				case "%c"://Not Complete
				    c++;
					if(v[c].length()==1)
					System.out.print(v[c]);
				    else {
						System.out.println("Error occured");
						System.exit(0);
					}
					break;
					
				default:
				    System.out.print(t);
			}
		}
    }
	public static void main(String args[])
	{
		printff("The number is :  %d %d","3");
	}
}