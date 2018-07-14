class VarArgsManual {
    static void vaTest(int v[]) {
		System.out.print("Contents : ");
	    for(int i=0;i<v.length;i++)
			System.out.print(v[i] + " ");
		System.out.println();
    }
	
	public static void main(String args[])
	{
		int n1[]={10};
		int n2[]={1,2,3};
		int n3[]={};
		vaTest(n1);
		vaTest(n2);
		vaTest(n3);
	}
}