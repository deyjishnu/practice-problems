import java.util.Scanner;

class BalancedParanthesis {
    boolean checkBalancedParanthesis(String exp) {
        DynamicStack stack = new DynamicStack(exp.length());
        for(char ch: exp.toCharArray()) {
            if(ch == '[' || ch == '{' || ch == '(')
            stack.push(ch);
            else if(ch == ']' || ch == '}' || ch == ')') {
                if(arePairs(stack.topElement(), ch))
                ch = stack.pop(); // This popped value is not needed
                else
                return false;
            }
        }
        return stack.isEmpty()? true : false;
    }

    boolean arePairs(char a, char b) {
        if((a == '[' && b == ']') || (a == '{' && b == '}') || (a == '(' && b == ')'))
        return true;
        else
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String exp = sc.next();
        BalancedParanthesis bp = new BalancedParanthesis();
        if(bp.checkBalancedParanthesis(exp))
        System.out.println("Balanced paranthesis");
        else
        System.out.println("Unbalanced paranthesis");
        sc.close();
    }
}