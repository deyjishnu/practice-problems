/* A command-line argument is the information that directly follows the program's name on the command line when it is executed.
To run this program, type in the command line:
javac CommandLineArguments.java
java CommandLineArguments This is Jishnu Dey 100 1 */

class CommandLineArguments {
    public static void main(String args[]) {
        for(int i=0; i<args.length; i++)
        System.out.println("args[" + i + "]: " + args[i]);
    }
}
