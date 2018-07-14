class ArrayTest {
    public static void main(String args[]) {
        int b[] = {1, 2, 3, 4};
        // int a[][] = new b[][3];
        int [] a[] = new int[3][4];
        for(int i=0; i<3; i++)
        for(int j=0; j<4; j++)
        a[i][j] = 10 * i + j;
        
        int c[] = a[2];

        for(int j=0; j<4; j++)
        System.out.print(c[j] + " ");
    }
}