import java.util.Scanner;
class PrimesLessThanN {
    public static void main(String args[]) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ->");
        int n = sc.nextInt();

        System.out.println("Primes ->");
        for(int i=2; i<=n; i++) {
            if(isPrime(i))
            System.out.print(i + " ");
            flag = 1;
        }
        System.out.println();
        if(flag == 0)
        System.out.println("No Primes present");
        sc.close();
    }

    static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0)
            return false;
        }
        return true;
    }
}
