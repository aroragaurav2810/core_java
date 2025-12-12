package interview_preparation_algo_set5;

public class ImplementAStackUsingArray
{

    int ar[]=new int[5];
    int top=-1;
    int arrayCapacity=ar.length;
    static void main() {

        ImplementAStackUsingArray stack=new ImplementAStackUsingArray();
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.peek();
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.peek();
        stack.pop();
        stack.push(60);
        stack.pop();
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }

    void push(int element)
    {
        if(top==arrayCapacity-1)
        {
            System.out.println("You can't push as stack limit is full");
        }
        else {
            ar[++top] = element;
            System.out.println("pushed element is: "+ar[top]);
        }
    }

    void pop()
    {
       if(top==-1)
       {
           System.out.println("You can't pop as stack is empty");
       }
       else {
           System.out.println("popped element is: "+ar[top--]);
       }
    }


    void peek()
    {
        if(top==-1)
        {
            System.out.println("You can't peek as stack is empty");
        }
        else
        {
            System.out.println("Top element is: "+ar[top]);
        }
    }

}
