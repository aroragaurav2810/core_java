package interview_preparation_algo_set5;

import java.util.Stack;

public class BalancedParenthesisCheckUsingStack
{

    Stack<Character> characterStack=new Stack<>();
    public boolean isBalanced(String exp)
    {
        boolean isBalanced=true;
        for(char ch:exp.toCharArray())
        {
            if(ch=='{' || ch=='[' || ch=='(')
            {
                characterStack.push(ch);
            }
            else if(ch=='}' || ch==']' || ch==')')
            {

                if(characterStack.isEmpty())
                {
                     isBalanced=false;
                }
                char top=characterStack.pop();
                if(ch=='}' && top!='{' || ch==')' && top!='(' || ch==']' && top!='[')
                {
                     isBalanced=false;
                }
            }
        }
        return isBalanced;
    }


    static void main() {
    BalancedParenthesisCheckUsingStack obj=new BalancedParenthesisCheckUsingStack();
    String expression1="{[()]}";
    if(obj.isBalanced(expression1))
    {
        System.out.println("Parenthesis are in balanced shape");
    }
    else
    {
        System.out.println("Parenthesis are not in balanced shape");
    }
    }

}
